/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.Excepciones;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreasEgresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOAreasInteresJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOAreaInteres;

/**
 * @author XgioserX
 *
 */
public class BOAreaInteres {
	
	private IDAOAreaInteres daoAI;

	/**
	 * @param daoAI
	 */
	public BOAreaInteres() {
		daoAI = new DAOAreasInteresJPA();
	}

	/**
	 * 
	 * @param ai
	 * @throws Exception
	 */
	public void crearAreaInteres(AreaInteres ai) throws Exception {
		AreaInteres area = daoAI.buscar(ai.getIdArea());
		if (area != null) {
			throw new Excepciones("Esta area de interes ya se encuentra registrada");
		}else{
			if(buscarxNombre(ai.getNombre())){
				throw new Excepciones("Ya existe un area de interes con el nombre "+ai.getNombre());
			}else{
				daoAI.crear(ai);
			}
		}
	}
	/**
	 * 
	 * @param nombre
	 * @return
	 * @throws Exception
	 */
	public boolean buscarxNombre(String nombre) throws Exception{
		return daoAI.buscarXNombre(nombre);
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public AreaInteres buscarAreaInteres(int id) throws Exception {
		return daoAI.buscar(id);
	}
	/**
	 * 
	 * @param ai
	 * @return
	 * @throws Exception
	 */
	public AreaInteres editarAreaInteres(AreaInteres ai) throws Exception {
		daoAI.editar(ai);
		return ai;		
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<AreaInteres> listarAreaInteres() throws Exception{
		return daoAI.listar();
	}
	/**
	 * 
	 * @param ai
	 * @return
	 * @throws Exception
	 */
	public AreasEgresado buscarAreaInteresEgresado(AreasEgresado ai) throws Exception{
		return daoAI.buscarAreaInteres(ai);
	}
	/**
	 * 
	 * @param ai
	 * @throws Exception
	 */
	public void addAreaInteresEgresado(AreasEgresado ai) throws Exception{
		AreasEgresado ae = buscarAreaInteresEgresado(ai);
		if(ae == null){
			daoAI.addAreaInteres(ai);
		}
	}
}
