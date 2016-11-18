package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Programa;

public interface IDAOPrograma {
	
	/**
	 * Registra un programa en la bd
	 * @param p el programa
	 * @throws Exception  en caso de una excepcion tecnica o de negocio.
	 */
	public void crear(Programa p) throws Exception;

	/**
	 * Buscamos un programa por su codigo
	 * @param id
	 * @return
	 * @throws Exception  en caso de una excepcion tecnica o de negocio.
	 */
	public Programa buscarPrograma(int id) throws Exception;
	
	/**
	 * Buscamos un programa por su nombre
	 * @param id
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public boolean buscarProgramaNombre(String nombre) throws Exception;
	
	/**
	 * Edita un programa
	 * @param p
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void editarPrograma(Programa p) throws Exception;
	
	/**
	 * Lista todos los programas
	 * @param facultad
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Programa> listarPrograma() throws Exception;
	
	/**
	 * Lista todos los programas de una determinada Facultad
	 * @param f
	 * @return
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public List<Programa> listarProgramaFacultad(Facultad f) throws Exception;

	/**
	 * Eliminar programa
	 * @param p progama a eliminar
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void eliminar(Programa p) throws Exception;
}
