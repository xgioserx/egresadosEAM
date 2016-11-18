package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreasEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.TipoDocumento;

public interface IDAOEgresado {

	/**
	 * 
	 * @param e
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void crear(Egresado e) throws Exception;

	/**
	 * 
	 * @param e
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void editar(Egresado e) throws Exception;

	/**
	 * 
	 * @param tipo
	 * @param numero
	 * @return
	 * @throws Exception
	 */
	public Egresado buscarEgresadoTipo(TipoDocumento tipo, String numero)throws Exception;
	
	/**
	 * 
	 * @param e
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public Egresado buscar(int id) throws Exception;

	//public Egresado buscarXTipo(TipoDocumento tipo, String numero)throws Exception;
	
	
	/**
	 * 
	 * @param e
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void eliminar (Egresado e)throws Exception;
}
