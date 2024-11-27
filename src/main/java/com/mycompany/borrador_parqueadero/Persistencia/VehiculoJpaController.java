
package com.mycompany.borrador_parqueadero.Persistencia;

import com.mycompany.borrador_parqueadero.Persistencia.exceptions.NonexistentEntityException;
import com.mycompany.borrador_parqueadero.logica.Vehiculo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class VehiculoJpaController implements Serializable {

    public VehiculoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public VehiculoJpaController() {
        emf = Persistence.createEntityManagerFactory("ParqueaderoPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Vehiculo vehiculo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(vehiculo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Vehiculo vehiculo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            vehiculo = em.merge(vehiculo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = vehiculo.getId();
                if (findVehiculo(id) == null) {
                    throw new NonexistentEntityException("The vehiculo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Vehiculo vehiculo;
            try {
                vehiculo = em.getReference(Vehiculo.class, id);
                vehiculo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The vehiculo with id " + id + " no longer exists.", enfe);
            }
            em.remove(vehiculo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Vehiculo> findVehiculoEntities() {
        return findVehiculoEntities(true, -1, -1);
    }

    public List<Vehiculo> findVehiculoEntities(int maxResults, int firstResult) {
        return findVehiculoEntities(false, maxResults, firstResult);
    }

    private List<Vehiculo> findVehiculoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Vehiculo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Vehiculo findVehiculo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Vehiculo.class, id);
        } finally {
            em.close();
        }
    }

    public int getVehiculoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Vehiculo> rt = cq.from(Vehiculo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public Vehiculo traerVehiculo(String placa, String estado) {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Vehiculo> cq = cb.createQuery(Vehiculo.class);
            Root<Vehiculo> root = cq.from(Vehiculo.class);
            Predicate placaPredicate = cb.equal(root.get("placa"), placa);
            Predicate estadoPredicate = cb.equal(root.get("estado"), estado);
            cq.select(root).where(cb.and(placaPredicate, estadoPredicate));
            return em.createQuery(cq).getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public List<Vehiculo> traerVehiculos(String tipoVehiculo, String placa, String estado, String fecha) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Vehiculo> cq = cb.createQuery(Vehiculo.class);
        Root<Vehiculo> parqueaderoRoot = cq.from(Vehiculo.class);
        Predicate fechaInPredicate = cb.like(parqueaderoRoot.get("hora_Ingreso"), "%" + fecha + "%");
        Predicate tipoVehiculoPredicate = cb.like(parqueaderoRoot.get("tipo_Vehiculo"), "%" + tipoVehiculo + "%");
        Predicate placaPredicate = cb.like(parqueaderoRoot.get("placa"), "%" + placa + "%");
        Predicate estadoPredicate = cb.like(parqueaderoRoot.get("estado"), "%" + estado + "%");
        cq.select(parqueaderoRoot).where(
                cb.and(tipoVehiculoPredicate, placaPredicate, estadoPredicate, fechaInPredicate)
        );
        TypedQuery<Vehiculo> q = em.createQuery(cq);
        return q.getResultList();
    }

    public List<Vehiculo> traerVehiculosPorFecha(String fecha) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Vehiculo> cq = cb.createQuery(Vehiculo.class);
        Root<Vehiculo> root = cq.from(Vehiculo.class);
        cq.select(root).where(cb.like(root.get("hora_Salida"), "%" + fecha + "%"));
        TypedQuery<Vehiculo> q = em.createQuery(cq);
        return q.getResultList();
    }
    
    public List<Vehiculo> traerVehiculosEntreFechas(String fechaInicio, String fechaFin){
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Vehiculo>  cq = cb.createQuery(Vehiculo.class);
        Root<Vehiculo> root = cq.from(Vehiculo.class);
        Predicate fechaInicioPredicate = cb.greaterThanOrEqualTo(root.get("hora_Salida"), fechaInicio);
        Predicate fechaFinPredicate = cb.lessThanOrEqualTo(root.get("hora_Salida"), fechaFin);
        cq.where(cb.and(fechaInicioPredicate, fechaFinPredicate));
        TypedQuery<Vehiculo> q = em.createQuery(cq);
        return q.getResultList();
    }
}
