/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Login;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOLogin;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author XgioserX
 *
 */
public class DAOLoginJPA implements IDAOLogin{

	public void crear(Login l) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(l);
		en.getTransaction().commit();
	}

}
