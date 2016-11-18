package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.TipoDocumento;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * @author Xgioserx
 *
 */
public class DAOEgresadoJPA implements IDAOEgresado {

	public void crear(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(e);
		en.getTransaction().commit();
		
	}

	public void editar(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.merge(e);
        en.getTransaction().commit();
		
	}

	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numero) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
        Query q = em.createQuery("SELECT e FROM Egresado e WHERE e.tipoDocumento = '"+tipo+"' AND e.numeroDocumento = '"+numero+"'");
		List<Egresado> lista = q.getResultList();
		if(lista.size() > 0){
			return lista.get(0);
		}else{
			return null;
		}
	}
	
	public Egresado buscar(int id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Egresado.class, id);
	}


	public void eliminar(Egresado e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.remove(en.merge(e));
        en.getTransaction().commit();
		
	}
	
}
