package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Programa;

public interface IDAOFacultad {
	
    /**
     * 
     * @param f
     * @throws Exception en caso de una excepcion tecnica o de negocio.
     */
	public void crear(Facultad f) throws Exception;
	
	 /**
     * 
     * @param f
     * @throws Exception en caso de una excepcion tecnica o de negocio.
     */
	public Facultad buscar(int id) throws Exception;

	 /**
     * 
     * @param f
     * @throws Exception en caso de una excepcion tecnica o de negocio.
     */
	public void editar(Facultad f) throws Exception;

	 /**
     * 
     * @param f
     * @throws Exception en caso de una excepcion tecnica o de negocio.
     */
	public List<Facultad> listarFacultad() throws Exception;
}
