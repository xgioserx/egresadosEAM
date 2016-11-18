/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.Excepciones;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOFacultadJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOFacultad;

/**
 * @author XgioserX
 *
 */
public class BOFacultad {

	private IDAOFacultad daoF;

	public BOFacultad() {
		daoF = new DAOFacultadJPA();
	}
	/**
	 * 
	 * @param f
	 * @throws Exception
	 */
	public void crearFacultad(Facultad f) throws Exception {
		Facultad fa = daoF.buscar(f.getIdFacultad());
		if (fa != null) {
			throw new Excepciones("la Facultad ya se encuentra registrada");
		} else {
			daoF.crear(f);
		}
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Facultad buscarFacultad(int id) throws Exception {
		return daoF.buscar(id);
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 * @throws Exception
	 */
	public Facultad editarFacultad(Facultad f) throws Exception {
		Facultad fa = daoF.buscar(f.getIdFacultad());
		if (fa != null) {
			daoF.editar(f);
		} else {
			throw new Excepciones("la Facultad no se encuentra registrada");
		}
		return null;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Facultad>listarFacultad() throws Exception{
		return daoF.listarFacultad();
	}
}
