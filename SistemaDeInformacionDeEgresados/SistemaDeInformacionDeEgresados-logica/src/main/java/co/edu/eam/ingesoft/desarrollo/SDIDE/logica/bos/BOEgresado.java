/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.Excepciones;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.TipoDocumento;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOEgresadoJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOEgresado;

/**
 * @author XgioserX
 *
 */
public class BOEgresado {
 
	private IDAOEgresado daoEgr;

	
	public BOEgresado() {
		
		daoEgr = new DAOEgresadoJPA();
	}
	
	/**
	 * 
	 * @param egresado
	 * @throws Exception
	 */
	public void crearEgresado(Egresado egresado) throws Exception {
		Egresado e = daoEgr.buscar(egresado.getIdEgresado());
		if(e != null){
			throw new Excepciones("Este egresado ya se encuentra registrado");
		}else{
			daoEgr.crear(e);
		}
	}
	/**
	 * 
	 * @param tipo
	 * @param numeroDocumento
	 * @return
	 * @throws Exception
	 */
	public Egresado buscarEgresadoTipoYcedula(TipoDocumento tipo, String numeroDocumento) throws Exception {
		return daoEgr.buscarEgresadoTipo(tipo, numeroDocumento);
		
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Egresado buscarEgresado(int id) throws Exception {
		return daoEgr.buscar(id);
	}
	
	/**
	 * 
	 * @param egresado
	 * @throws Exception
	 */
	public void editarEgresado(Egresado egresado) throws Exception {
		Egresado e = daoEgr.buscar(egresado.getIdEgresado());
		if (e != null) {
			daoEgr.editar(egresado);
		}else{
			throw new Excepciones("No se ha encontrado ningun egresado");
		}
	}
	
	/**
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void eliminarEgresado(int id) throws Exception {
		Egresado egresado = daoEgr.buscar(id);
		if (egresado != null) {
			daoEgr.eliminar(egresado);
		} else {
			throw new Excepciones("el egresado no se encuentra");
		}

	}
	
	
}
