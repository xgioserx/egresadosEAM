package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOCotacto;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * @author Xgioserx
 *
 */
public class DAOContactoJPA implements IDAOCotacto {

	public void crear(Contacto c) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(c);
		en.getTransaction().commit();
		
	}

	public void editar(Contacto c) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(c);
		en.getTransaction().commit();
		
	}

	public Contacto buscar(String id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
	    return en.find(Contacto.class, id);
	}
	

}
