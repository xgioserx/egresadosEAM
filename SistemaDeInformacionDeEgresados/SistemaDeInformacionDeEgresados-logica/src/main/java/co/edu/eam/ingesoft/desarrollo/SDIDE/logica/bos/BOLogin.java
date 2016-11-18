/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Login;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOLoginJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOLogin;

/**
 * @author XgioserX
 *
 */
public class BOLogin {
	
public IDAOLogin daoLog;

public BOLogin() {
	daoLog= new DAOLoginJPA();
}


	public void crearLogin(Login l) throws Exception {
		daoLog.crear(l);
	}
}
