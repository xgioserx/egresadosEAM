/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.Excepciones;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOContactoJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOCotacto;

/**
 * @author XgioserX
 *
 */
public class BOContacto {
	
	private IDAOCotacto daoC;

	public BOContacto() {
		daoC = new DAOContactoJPA();
	}
	
	/**
	 * 
	 * @param c
	 * @param e
	 * @throws Exception
	 */
	public void crearContacto(Contacto c, Empresa e) throws Exception {
		Contacto con = daoC.buscar(e.getIdEmpresa());
		if (con != null) {
			throw new Excepciones("Este contacto ya se encuentra registrado");
		} else {
			daoC.crear(c);
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Contacto buscarContacto(String id) throws Exception {
		return daoC.buscar(id);
	}
	/**
	 * 
	 * @param c
	 * @return
	 * @throws Exception
	 */
	public Contacto editarContacto(Contacto c) throws Exception {
		daoC.editar(c);
		return c;
	}
}
