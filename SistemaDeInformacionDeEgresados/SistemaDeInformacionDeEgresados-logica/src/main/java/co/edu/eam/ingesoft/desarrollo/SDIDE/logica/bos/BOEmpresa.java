/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.Excepciones;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOEmpresaJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOEmpresa;

/**
 * @author XgioserX
 *
 */
public class BOEmpresa {

	
	
	private IDAOEmpresa daoEmp;


	public BOEmpresa() {
		
		daoEmp = new DAOEmpresaJPA();
	}
	
	/**
	 * 
	 * @param e
	 * @throws Exception
	 */
	public void crearEmpresa(Empresa e) throws Exception {

		Empresa emp = daoEmp.buscar(e.getIdEmpresa());
		if (emp != null) {
			throw new Excepciones("la empresa ya se encuentra registrada");
		} else {
			daoEmp.crear(e);
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Empresa buscarEmpresa(String id) throws Exception {
		return daoEmp.buscar(id);
		
	}
	
	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public Empresa editarEmpresa(Empresa e) throws Exception {
		daoEmp.editar(e);
		return e;
		
	}
	/**
	 * 
	 * @param e
	 * @throws Exception
	 */
	public void eliminarEmpresa(Empresa e) throws Exception {
		Empresa emp = daoEmp.buscar(e.getIdEmpresa());
		if (emp != null) {
			daoEmp.eliminar(emp);
		} else {
			throw new Excepciones("el egresado no se encuentra");
		}

	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Departamento>listarDepartamentos()throws Exception{
		return daoEmp.listarDepartamentos();
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Ciudad>listarCiudades()throws Exception{
		return daoEmp.listarCiudades();
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Pais>listarPaises()throws Exception{
		return daoEmp.listarPaises();
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<SectorLaboral>listarSectorLaboral()throws Exception{
		return daoEmp.listarSectorLab();
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Empresa> listarEmpresas() throws Exception{
		return daoEmp.listarEmpresas();
	}
	
}
