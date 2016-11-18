package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Login;

public interface IDAOLogin {

	/**
	 * 
	 * @param l
	 * @throws Exception en caso de una excepcion tecnica o de negocio.
	 */
	public void crear(Login l) throws Exception;
}
