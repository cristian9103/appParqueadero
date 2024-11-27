
package com.mycompany.borrador_parqueadero.Persistencia;

import com.mycompany.borrador_parqueadero.Persistencia.exceptions.NonexistentEntityException;
import com.mycompany.borrador_parqueadero.logica.Mensualidad;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.borrador_parqueadero.logica.Propietario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;

public class MensualidadJpaController implements Serializable {

    public MensualidadJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public MensualidadJpaController() {
        emf = Persistence.createEntityManagerFactory("ParqueaderoPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mensualidad mensualidad) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Propietario propi = mensualidad.getPropi();
            if (propi != null) {
                propi = em.getReference(propi.getClass(), propi.getId());
                mensualidad.setPropi(propi);
            }
            em.persist(mensualidad);
            if (propi != null) {
                propi.getListaMensualidades().add(mensualidad);
                propi = em.merge(propi);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mensualidad mensualidad) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mensualidad persistentMensualidad = em.find(Mensualidad.class, mensualidad.getId());
            Propietario propiOld = persistentMensualidad.getPropi();
            Propietario propiNew = mensualidad.getPropi();
            if (propiNew != null) {
                propiNew = em.getReference(propiNew.getClass(), propiNew.getId());
                mensualidad.setPropi(propiNew);
            }
            mensualidad = em.merge(mensualidad);
            if (propiOld != null && !propiOld.equals(propiNew)) {
                propiOld.getListaMensualidades().remove(mensualidad);
                propiOld = em.merge(propiOld);
            }
            if (propiNew != null && !propiNew.equals(propiOld)) {
                propiNew.getListaMensualidades().add(mensualidad);
                propiNew = em.merge(propiNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = mensualidad.getId();
                if (findMensualidad(id) == null) {
                    throw new NonexistentEntityException("The mensualidad with id " + id + " no longer exists.");
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
            Mensualidad mensualidad;
            try {
                mensualidad = em.getReference(Mensualidad.class, id);
                mensualidad.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mensualidad with id " + id + " no longer exists.", enfe);
            }
            Propietario propi = mensualidad.getPropi();
            if (propi != null) {
                propi.getListaMensualidades().remove(mensualidad);
                propi = em.merge(propi);
            }
            em.remove(mensualidad);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Mensualidad> findMensualidadEntities() {
        return findMensualidadEntities(true, -1, -1);
    }

    public List<Mensualidad> findMensualidadEntities(int maxResults, int firstResult) {
        return findMensualidadEntities(false, maxResults, firstResult);
    }

    private List<Mensualidad> findMensualidadEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mensualidad.class));
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

    public Mensualidad findMensualidad(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mensualidad.class, id);
        } finally {
            em.close();
        }
    }

    public int getMensualidadCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mensualidad> rt = cq.from(Mensualidad.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Mensualidad> buscarMensualidadPorFecha(String fecha) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Mensualidad> cq = cb.createQuery(Mensualidad.class);
        Root<Mensualidad> root = cq.from(Mensualidad.class);
        
        Predicate predicadoFechaFin = cb.equal(root.get("fecha_Fin"), fecha);
        
        cq.select(root).where(predicadoFechaFin);
        TypedQuery<Mensualidad> q = em.createQuery(cq);
        return q.getResultList();
    }
    
    public List<Mensualidad> traerMensualidadEntreFechas(String fechaInicio, String fechaFin){
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Mensualidad>  cq = cb.createQuery(Mensualidad.class);
        Root<Mensualidad> root = cq.from(Mensualidad.class);
        Predicate fechaInicioPredicate = cb.greaterThanOrEqualTo(root.get("fecha_Inicio"), fechaInicio);
        Predicate fechaFinPredicate = cb.lessThanOrEqualTo(root.get("fecha_Inicio"), fechaFin);
        cq.where(cb.and(fechaInicioPredicate, fechaFinPredicate));
        TypedQuery<Mensualidad> q = em.createQuery(cq);
        return q.getResultList();
    }
}
