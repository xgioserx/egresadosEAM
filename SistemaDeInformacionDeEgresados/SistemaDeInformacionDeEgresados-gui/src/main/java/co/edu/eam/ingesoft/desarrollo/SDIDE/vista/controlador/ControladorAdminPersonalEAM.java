/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.vista.controlador;

import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos.BOLogin;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Login;

/**
 * @author XgioserX
 *
 */
public class ControladorAdminPersonalEAM {
	private BOLogin boLog;

	
	public ControladorAdminPersonalEAM() {
		boLog = new BOLogin();
	}
	
	public void crearLogin(Login l) throws Exception{
		boLog.crearLogin(l);
	}
	
}
