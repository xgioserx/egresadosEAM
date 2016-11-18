/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.vista.controlador;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOPrograma;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Programa;

/**
 * @author XgioserX
 *
 */
public class ControladorPrograma {
	
	private BOPrograma boPrograma;


	public ControladorPrograma() {
		boPrograma = new BOPrograma();
	}
	
	public void crearPrograma(Programa p) throws Exception {
		boPrograma.crearPrograma(p);

	}

	public Programa buscarPrograma(int id) throws Exception {
		return boPrograma.buscarPrograma(id);
	}
	
	public Programa editarPrograma(Programa p) throws Exception{
		return boPrograma.editarPrograma(p);
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Programa> listarPrograma() throws Exception{
		return boPrograma.listarPrograma();
	}
	
	/**
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void eliminarPrograma(int id) throws Exception{
		boPrograma.eliminarPrograma(id);
	}
	
}
