package controladoresJPA;

import comercio.ControllerSingleton;
import controladoresJPA.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Marca;

/**
 *
 * @author Mauro Federico Lopez
 */
public class MarcaJpaController extends Observable implements Serializable {

    public MarcaJpaController() {
        this.emf = ControllerSingleton.getEntityManagerFactory();
    }
    private EntityManagerFactory emf = null;

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Persiste un objeto <code>Marca</code> en la base de datos.
     * @param marca 
     */
    public void crearMarca(Marca marca) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(marca);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            notificarCambios();
        }
    }
    /**
     * Actualiza un objeto <code>Marca</code> en la base de datos.
     * @param marca
     * @throws NonexistentEntityException Se lanza ésta excepción cuando la marca que se quiere actualizar no existe en la base de datos.
     * @throws Exception 
     */
    public void editarMarca(Marca marca) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            marca = em.merge(marca);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = marca.getId();
                if (encontrarMarca(id) == null) {
                    throw new NonexistentEntityException("The marca with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
            notificarCambios();
        }
    }

    /**
     * Elimina una marca de la base de datos con el <code>id</code> especificado.
     * @param id
     * @throws NonexistentEntityException Se lanza ésta excepción cuando la marca que se quiere eliminar no existe en la base de datos.
     */
    public void destruirMarca(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Marca marca;
            try {
                marca = em.getReference(Marca.class, id);
                marca.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The marca with id " + id + " no longer exists.", enfe);
            }
            em.remove(marca);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
            notificarCambios();
        }
    }

    /**
     * Devuelve un objeto <code>Marca</code> buscado por su id en la base de datos.
     * @param id
     * @return 
     */
    public Marca encontrarMarca(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Marca.class, id);
        } finally {
            em.close();
        }
    }

    /**
     * Devuelve la cantidad de marcas registradas en la base de datos.
     * @return 
     */
    public int getMarcaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Marca> rt = cq.from(Marca.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    /**
     * Devuelve una lista de todas las marcas registrados en la base de datos.
     * Devuelve un ArrayList de marcas.
     * @return 
     */
    public ArrayList<Marca> obtenerTodasLasMarcas() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Marca.class));
            Object[] array = em.createQuery(cq).getResultList().toArray();
            ArrayList<Marca> marcas = new ArrayList();
            for(Object o : array)
                marcas.add((Marca) o);
            return marcas;
        } catch (NoResultException ex) {
            return new ArrayList();
        } finally {
            em.close();
        }
    }

    private void notificarCambios() {
        setChanged();
        notifyObservers();
    }

}
