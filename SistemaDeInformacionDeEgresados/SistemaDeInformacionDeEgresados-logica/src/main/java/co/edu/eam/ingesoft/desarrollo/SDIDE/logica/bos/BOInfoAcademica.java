/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoAcademica;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOInfoAcademicaJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOInfoAcademica;

/**
 * @author XgioserX
 *
 */
public class BOInfoAcademica {

	private IDAOInfoAcademica daoIAcad;

	public BOInfoAcademica() {
		daoIAcad = new DAOInfoAcademicaJPA();
	}
	
	/**
	 * 
	 * @param ia
	 * @throws Exception
	 */
	public void crearInfoAcademica(InfoAcademica ia) throws Exception {
		daoIAcad.crear(ia);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public InfoAcademica buscar(int id) throws Exception {
		return daoIAcad.buscar(id);
	}
	
	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public List<InfoAcademica> listaInfoAcademicaEgresado(Egresado e) throws Exception {
		List<InfoAcademica> lista = daoIAcad.listarInfoAcademicaEgresado(e);
		return lista;
	}
	
	/**
	 * 
	 * @param ia
	 * @throws Exception
	 */
	public void editarInformacion(InfoAcademica ia) throws Exception {
		daoIAcad.editar(ia);
	}
}
