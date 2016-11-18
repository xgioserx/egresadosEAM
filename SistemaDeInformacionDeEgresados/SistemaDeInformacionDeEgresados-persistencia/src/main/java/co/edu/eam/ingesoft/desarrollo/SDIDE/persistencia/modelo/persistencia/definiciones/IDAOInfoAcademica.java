package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoAcademica;

public interface IDAOInfoAcademica {

	/**
	 * 
	 * @param ia
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void crear(InfoAcademica ia) throws Exception;

	/**
	 * 
	 * @param ia
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void editar(InfoAcademica ia) throws Exception;

	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<InfoAcademica> listarInfoAcademicaEgresado(Egresado e) throws Exception;

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public InfoAcademica buscar(int id) throws Exception;

}
