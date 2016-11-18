package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOInfoLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * @author TecnoSystem
 *
 */
public class DAOInfoLaboralJPA implements IDAOInfoLaboral {

	public void crear(InfoLaboral il) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(il);
		en.getTransaction().commit();
		
	}

	public void editar(InfoLaboral il) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.merge(il);
		en.getTransaction().commit();
		
	}

	public InfoLaboral buscar(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(InfoLaboral.class, id);
		
	}

	public List<InfoLaboral> listarInfoLaboralEgresados(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(InfoLaboral.LISTAR_INFORMACION_LABORAL);
		q.setParameter(1, e);
		List<InfoLaboral> lista = q.getResultList();
		return lista;
	}
	
}
