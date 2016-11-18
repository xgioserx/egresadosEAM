package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Contacto;

public interface IDAOCotacto {

	/**
	 * 
	 * @param c
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void crear(Contacto c) throws Exception;

	
	/**
	 * 
	 * @param c
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void editar(Contacto c) throws Exception;

	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public Contacto buscar(String id) throws Exception;

}
