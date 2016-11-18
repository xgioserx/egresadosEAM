package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.crypto.AEADBadTagException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreasEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOAreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

public class DAOAreasInteresJPA implements IDAOAreaInteres {

	public AreaInteres buscar(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(AreaInteres.class, id);

	}

	public void crear(AreaInteres ai) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(ai);
		en.getTransaction().commit();
		
	}

	public void editar(AreaInteres ai) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(ai);
		en.getTransaction().commit();
		
	}

	public List<AreaInteres> listar() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(AreaInteres.LISTAR_AREA);
		List<AreaInteres> lista = q.getResultList();
		return lista;
	}

	public void addAreaInteres(AreasEgresado ai) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(ai);
		en.getTransaction().commit();
		
	}

	public boolean buscarXNombre(String nombre) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(AreaInteres.BUSCAR_NOMBRE_AREA);
		q.setParameter(1, nombre);
		List<AreaInteres> lista = q.getResultList();
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
	}

	public AreasEgresado buscarAreaInteres(AreasEgresado ai) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(AreasEgresado.BUSCAR_AREA_EGRESADO);
		q.setParameter(1, ai.getIdEgresado());
		q.setParameter(2, ai.getIdAreaInteres());
		List<AreasEgresado> lista = q.getResultList();
		if(lista.size() > 0){
			return lista.get(0);
		}else{
			return null;
		}
	}

}
