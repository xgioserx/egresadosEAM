package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOPrograma;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * @author  Xgioserx
 *
 */
public class DAOProgramaJPA implements IDAOPrograma {

	public void crear(Programa p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(p);
		en.getTransaction().commit();
		
	}

	public Programa buscarPrograma(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Programa.class,id);
	}

	public boolean buscarProgramaNombre(String nombre) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Programa.BUSCAR_NOMBRE);
		q.setParameter(1, nombre);
		List<Programa> lista = q.getResultList();
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
	}

	public void editarPrograma(Programa p) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(p);
		en.getTransaction().commit();
		
	}

	public List<Programa> listarPrograma() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Programa.LISTAR_PROGRAMAS);
		List<Programa> lista = q.getResultList();
		return lista;
	}

	public List<Programa> listarProgramaFacultad(Facultad f) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Programa.LISTAR_PROGRAMAS_FACULTAD);
		q.setParameter(1, f);
		List<Programa> lista = q.getResultList();
		return lista;
	}

	public void eliminar(Programa p) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
	}


}
