package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreasEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.SectorLaboral;

public interface IDAOEmpresa {
	

	/**
	 * 
	 * @param e
	 * @throws Exception
	 */
	public void crear(Empresa e) throws Exception;

	/**
	 * 
	 * @param e
	 * @throws Exception
	 */
	public void editar(Empresa e) throws Exception;

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Empresa buscar(String id) throws Exception;

	/**
	 * 
	 * @param e
	 * @throws Exception
	 */
	public void eliminar(Empresa e) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
    public List<SectorLaboral>listarSectorLab()throws Exception;

    /**
     * 
     * @return
     * @throws Exception en caso de una excepcion tecnica o de negocio.
     */
    public List<Empresa>listarEmpresas()throws Exception;
    
    /**
     * 
     * @return
     * @throws Exception en caso de una excepcion tecnica o de negocio.
     */
    public List<Pais>listarPaises()throws Exception;
	
    /**
     * 
     * @return
     * @throws Exception en caso de una excepcion tecnica o de negocio.
     */
	public List<Departamento>listarDepartamentos()throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Ciudad>listarCiudades()throws Exception;
	
	
}
