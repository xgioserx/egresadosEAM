package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreasEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoLaboral;

public interface IDAOInfoLaboral {
	
	/**
	 * 
	 * @param il
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void crear(InfoLaboral il) throws Exception;

	/**
	 * 
	 * @param il
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void editar(InfoLaboral il) throws Exception;

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public InfoLaboral buscar(int id) throws Exception;

	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<InfoLaboral> listarInfoLaboralEgresados(Egresado e) throws Exception;

}
