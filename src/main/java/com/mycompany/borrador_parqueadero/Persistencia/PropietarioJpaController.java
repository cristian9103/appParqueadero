package com.mycompany.borrador_parqueadero.Persistencia;

import com.mycompany.borrador_parqueadero.Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.borrador_parqueadero.logica.Mensualidad;
import com.mycompany.borrador_parqueadero.logica.Propietario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;

public class PropietarioJpaController implements Serializable {

    public PropietarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PropietarioJpaController() {
        emf = Persistence.createEntityManagerFactory("ParqueaderoPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Propietario propietario) {
        if (propietario.getListaMensualidades() == null) {
            propietario.setListaMensualidades(new ArrayList<Mensualidad>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Mensualidad> attachedListaMensualidades = new ArrayList<Mensualidad>();
            for (Mensualidad listaMensualidadesMensualidadToAttach : propietario.getListaMensualidades()) {
                listaMensualidadesMensualidadToAttach = em.getReference(listaMensualidadesMensualidadToAttach.getClass(), listaMensualidadesMensualidadToAttach.getId());
                attachedListaMensualidades.add(listaMensualidadesMensualidadToAttach);
            }
            propietario.setListaMensualidades(attachedListaMensualidades);
            em.persist(propietario);
            for (Mensualidad listaMensualidadesMensualidad : propietario.getListaMensualidades()) {
                Propietario oldPropiOfListaMensualidadesMensualidad = listaMensualidadesMensualidad.getPropi();
                listaMensualidadesMensualidad.setPropi(propietario);
                listaMensualidadesMensualidad = em.merge(listaMensualidadesMensualidad);
                if (oldPropiOfListaMensualidadesMensualidad != null) {
                    oldPropiOfListaMensualidadesMensualidad.getListaMensualidades().remove(listaMensualidadesMensualidad);
                    oldPropiOfListaMensualidadesMensualidad = em.merge(oldPropiOfListaMensualidadesMensualidad);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Propietario propietario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Propietario persistentPropietario = em.find(Propietario.class, propietario.getId());
            List<Mensualidad> listaMensualidadesOld = persistentPropietario.getListaMensualidades();
            List<Mensualidad> listaMensualidadesNew = propietario.getListaMensualidades();
            List<Mensualidad> attachedListaMensualidadesNew = new ArrayList<Mensualidad>();
            for (Mensualidad listaMensualidadesNewMensualidadToAttach : listaMensualidadesNew) {
                listaMensualidadesNewMensualidadToAttach = em.getReference(listaMensualidadesNewMensualidadToAttach.getClass(), listaMensualidadesNewMensualidadToAttach.getId());
                attachedListaMensualidadesNew.add(listaMensualidadesNewMensualidadToAttach);
            }
            listaMensualidadesNew = attachedListaMensualidadesNew;
            propietario.setListaMensualidades(listaMensualidadesNew);
            propietario = em.merge(propietario);
            for (Mensualidad listaMensualidadesOldMensualidad : listaMensualidadesOld) {
                if (!listaMensualidadesNew.contains(listaMensualidadesOldMensualidad)) {
                    listaMensualidadesOldMensualidad.setPropi(null);
                    listaMensualidadesOldMensualidad = em.merge(listaMensualidadesOldMensualidad);
                }
            }
            for (Mensualidad listaMensualidadesNewMensualidad : listaMensualidadesNew) {
                if (!listaMensualidadesOld.contains(listaMensualidadesNewMensualidad)) {
                    Propietario oldPropiOfListaMensualidadesNewMensualidad = listaMensualidadesNewMensualidad.getPropi();
                    listaMensualidadesNewMensualidad.setPropi(propietario);
                    listaMensualidadesNewMensualidad = em.merge(listaMensualidadesNewMensualidad);
                    if (oldPropiOfListaMensualidadesNewMensualidad != null && !oldPropiOfListaMensualidadesNewMensualidad.equals(propietario)) {
                        oldPropiOfListaMensualidadesNewMensualidad.getListaMensualidades().remove(listaMensualidadesNewMensualidad);
                        oldPropiOfListaMensualidadesNewMensualidad = em.merge(oldPropiOfListaMensualidadesNewMensualidad);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = propietario.getId();
                if (findPropietario(id) == null) {
                    throw new NonexistentEntityException("The propietario with id " + id + " no longer exists.");
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
            Propietario propietario;
            try {
                propietario = em.getReference(Propietario.class, id);
                propietario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The propietario with id " + id + " no longer exists.", enfe);
            }
            List<Mensualidad> listaMensualidades = propietario.getListaMensualidades();
            for (Mensualidad listaMensualidadesMensualidad : listaMensualidades) {
                listaMensualidadesMensualidad.setPropi(null);
                listaMensualidadesMensualidad = em.merge(listaMensualidadesMensualidad);
            }
            em.remove(propietario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Propietario> findPropietarioEntities() {
        return findPropietarioEntities(true, -1, -1);
    }

    public List<Propietario> findPropietarioEntities(int maxResults, int firstResult) {
        return findPropietarioEntities(false, maxResults, firstResult);
    }

    private List<Propietario> findPropietarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Propietario.class));
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

    public Propietario findPropietario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Propietario.class, id);
        } finally {
            em.close();
        }
    }

    public int getPropietarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Propietario> rt = cq.from(Propietario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Propietario> traerPropietarios(String tipoVehiculo, String placa, String propietario) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Propietario> cq = cb.createQuery(Propietario.class);
        Root<Propietario> MensualidadRoot = cq.from(Propietario.class);
        Predicate tipoVehiculoPredicate = cb.like(MensualidadRoot.get("tipo_Vehiculo"), "%" + tipoVehiculo + "%");
        Predicate propietarioPredicate = cb.like(MensualidadRoot.get("nombre"), "%" + propietario + "%");
        Predicate placaPredicate = cb.like(MensualidadRoot.get("placa"), "%" + placa + "%");

        cq.select(MensualidadRoot).where(
                cb.and(tipoVehiculoPredicate, placaPredicate, propietarioPredicate)
        );
        TypedQuery<Propietario> q = em.createQuery(cq);
        return q.getResultList();
    }

    public Propietario traerPropietario(String placa) {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Propietario> cq = cb.createQuery(Propietario.class);
            Root<Propietario> root = cq.from(Propietario.class);
            Predicate pre = cb.equal(root.get("placa"), placa);
            cq.select(root).where(pre);
            TypedQuery<Propietario> q = em.createQuery(cq);
            return q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public List<Propietario> traerPropietarioPorFecha(String fecha) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Propietario> cq = cb.createQuery(Propietario.class);
        Root<Propietario> root = cq.from(Propietario.class);
        cq.select(root).where(cb.like(root.get("fecha_Fin"), "%" + fecha + "%"));
        TypedQuery<Propietario> q = em.createQuery(cq);
        return q.getResultList();
    }

}
