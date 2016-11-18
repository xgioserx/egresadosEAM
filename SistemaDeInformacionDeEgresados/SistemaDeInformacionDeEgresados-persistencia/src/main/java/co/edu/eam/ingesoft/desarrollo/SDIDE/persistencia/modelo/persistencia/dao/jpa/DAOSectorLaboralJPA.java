/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOSectorLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author XgioserX
 *
 */
public class DAOSectorLaboralJPA implements IDAOSectorLaboral{

	public List<SectorLaboral> listar() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(SectorLaboral.LISTAR_SECTORES);
		List<SectorLaboral> lista = q.getResultList();
		return lista;
	}

}
