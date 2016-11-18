/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.vista.controlador;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOFacultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Facultad;

/**
 * @author XgioserX
 *
 */
public class ControladorFacultad {
	private BOFacultad boFacultad;

	
	public ControladorFacultad() {
		boFacultad = new BOFacultad();
	}
	
	/**
	 * 
	 * @param f
	 * @throws Exception
	 */
	public void crearFacultad(Facultad f) throws Exception{	
		boFacultad.crearFacultad(f);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Facultad buscarFacultad(int id) throws Exception{
		return boFacultad.buscarFacultad(id);
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 * @throws Exception
	 */
	public Facultad editarFacultad(Facultad f) throws Exception{
		return boFacultad.editarFacultad(f);
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Facultad> listarFacultad()throws Exception{
		return boFacultad.listarFacultad();
	}
}
