/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.vista.controlador;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOContacto;
import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOEmpresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.SectorLaboral;

/**
 * @author XgioserX
 *
 */
public class ControladorAdminContactoEmpresa {

	private BOEmpresa boEmpresa;
	private BOContacto boContacto;
	/**
	 * 
	 */
	public ControladorAdminContactoEmpresa() {
		boEmpresa = new BOEmpresa();
		boContacto = new BOContacto();
	}
	

	/**
	 * 
	 * @param e
	 * @throws Exception
	 */
	public void crearEmpresa(Empresa e)throws Exception{
		boEmpresa.crearEmpresa(e);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Empresa buscarEmpresa(String id)throws Exception{
		return boEmpresa.buscarEmpresa(id);
	}
	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public Empresa editarEmpresa(Empresa e)throws Exception{
		return boEmpresa.editarEmpresa(e);
	}
	
	/**
	 * 
	 * @param c
	 * @param e
	 * @throws Exception
	 */
	public void crearContacto(Contacto c,Empresa e)throws Exception{
		boContacto.crearContacto(c,e);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Contacto buscarContacto(String id)throws Exception{
		return boContacto.buscarContacto(id);
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 * @throws Exception
	 */
	public Contacto editarContacto(Contacto c)throws Exception{
		return boContacto.editarContacto(c);
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamentos()throws Exception{
		return boEmpresa.listarDepartamentos();
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudades()throws Exception{
		return boEmpresa.listarCiudades();
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Pais> listarPaises()throws Exception{
		return boEmpresa.listarPaises();
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<SectorLaboral> listarSectorLaboral()throws Exception{
		return boEmpresa.listarSectorLaboral();
	}
}
