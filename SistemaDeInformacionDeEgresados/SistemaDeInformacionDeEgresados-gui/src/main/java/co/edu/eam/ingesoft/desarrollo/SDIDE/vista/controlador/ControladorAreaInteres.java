/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.vista.controlador;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOAreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;

/**
 * @author XgioserX
 *
 */
public class ControladorAreaInteres {
	private BOAreaInteres boAreaInt;

	/**
	 * 
	 */
	public ControladorAreaInteres() {
		boAreaInt = new BOAreaInteres();
	}

	/**
	 * 
	 * @param a
	 * @throws Exception
	 */
	public void crearAreaInt(AreaInteres a) throws Exception {
		boAreaInt.crearAreaInteres(a);
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public AreaInteres buscarArea(int id) throws Exception {
		return boAreaInt.buscarAreaInteres(id);
	}

	/**
	 * 
	 * @param a
	 * @return
	 * @throws Exception
	 */
	public AreaInteres editarArea(AreaInteres a) throws Exception {
		return boAreaInt.editarAreaInteres(a);
	}
       	/**
       	 * 
       	 * @return
       	 * @throws Exception
       	 */
	public List<AreaInteres> listarAreaInteres() throws Exception{
		return boAreaInt.listarAreaInteres();
	}

	
}
