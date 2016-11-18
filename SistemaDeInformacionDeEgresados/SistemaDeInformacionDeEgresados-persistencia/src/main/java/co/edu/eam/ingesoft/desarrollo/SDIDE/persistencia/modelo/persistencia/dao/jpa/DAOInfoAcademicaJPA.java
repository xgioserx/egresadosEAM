/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOInfoAcademica;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author XgioserX
 *
 */
public class DAOInfoAcademicaJPA implements IDAOInfoAcademica {

	public void crear(InfoAcademica ia) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(ia);
		en.getTransaction().commit();
	}

	public void editar(InfoAcademica ia) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(ia);
		en.getTransaction().commit();
		
	}

	public List<InfoAcademica> listarInfoAcademicaEgresado(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(InfoAcademica.LISTAR_INFORMACION_ACADEMICA);
		q.setParameter(1, e);
		List<InfoAcademica> info = q.getResultList();
		return info;
	}

	public InfoAcademica buscar(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(InfoAcademica.class, id);
	}

}
