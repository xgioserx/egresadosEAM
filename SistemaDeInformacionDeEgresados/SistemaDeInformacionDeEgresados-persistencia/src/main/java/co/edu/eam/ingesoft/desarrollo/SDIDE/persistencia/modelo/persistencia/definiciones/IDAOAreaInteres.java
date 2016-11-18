package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreasEgresado;

public interface IDAOAreaInteres {
	
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public AreaInteres buscar(int id) throws Exception;

/**
 * 
 * @param ai
 * @throws Exception en caso de una excepcion tecnica o de negocio.
 */
	public void crear(AreaInteres ai) throws Exception;

	/**
	 * 
	 * @param ai
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void editar(AreaInteres ai) throws Exception;
	
    /**
	 * Listamos todas las areas de interes que se encuentran en la bd
	 * @return lista con todas las areas de interes
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<AreaInteres> listar() throws Exception;
	
	
	/**
	 * 
	 * @param ai
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void addAreaInteres(AreasEgresado ai) throws Exception;
	
	/**
	 * Busca un area de interes por nombre
	 * @param nombre nombre del area a interes a buscar
	 * @return true si ya hay un area de interes con ese nombre, de lo contrario false
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public boolean buscarXNombre(String nombre) throws Exception;
	
	
	/**
	 * 
	 * @param ai
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public AreasEgresado buscarAreaInteres(AreasEgresado ai) throws Exception;

}
