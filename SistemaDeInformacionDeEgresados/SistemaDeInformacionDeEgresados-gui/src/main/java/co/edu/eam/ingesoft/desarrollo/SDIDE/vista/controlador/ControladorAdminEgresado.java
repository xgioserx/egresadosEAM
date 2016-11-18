/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.vista.controlador;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOAreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOEmpresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOFacultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOPrograma;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreasEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.TipoDocumento;

/**
 * @author XgioserX
 *
 */
public class ControladorAdminEgresado {
	private BOEgresado boEgresado;
	private BOFacultad boFacultad;
	private BOPrograma boPrograma;
	private BOAreaInteres boAreaInteres;
	private BOEmpresa boEmpresa;

	public ControladorAdminEgresado() {
		boEgresado = new BOEgresado();
		boFacultad = new BOFacultad();
		boPrograma = new BOPrograma();
		boAreaInteres = new BOAreaInteres();
		boEmpresa = new BOEmpresa();
	}
	
	
	public void crearEgresado(Egresado egresado, List<AreaInteres> Areas) throws Exception{
		boEgresado.crearEgresado(egresado);
		for (AreaInteres areaInteres : Areas) {
			AreasEgresado interes = new AreasEgresado(egresado, areaInteres);
			AgregarAreaIntegeresEgresado(interes);
		}
	}
	
	public Egresado buscarEgresado(int id) throws Exception{
		return boEgresado.buscarEgresado(id);
	}
	
	public void editarEgresado(Egresado egresado) throws Exception{
		boEgresado.editarEgresado(egresado);
	}
	
	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numeroDocumento) throws Exception{
		return boEgresado.buscarEgresadoTipoYcedula(tipo,numeroDocumento);
	}
	public List<Facultad> listarFacultades() throws Exception{
		return boFacultad.listarFacultad();
	}
	
	
	public List<Programa> listarProgramaFacultad(Facultad facultad) throws Exception{
		return boPrograma.listarProgramaFacultad(facultad);
	}
	
	public List<Empresa> listarEmpresas() throws Exception{
		return boEmpresa.listarEmpresas();
	}
	
	public List<AreaInteres> listarAreaInteres() throws Exception{
		return boAreaInteres.listarAreaInteres();
	}
	
	public void AgregarAreaIntegeresEgresado(AreasEgresado interes) throws Exception{
		boAreaInteres.addAreaInteresEgresado(interes);
	}
	
}
