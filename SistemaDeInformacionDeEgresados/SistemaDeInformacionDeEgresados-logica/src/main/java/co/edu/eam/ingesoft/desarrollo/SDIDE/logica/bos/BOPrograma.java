/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import java.util.List;

import co.edu.eam.desarrollo.proyectoFinal.logica.excepciones.Excepciones;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOProgramaJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOPrograma;

/**
 * @author XgioserX
 *
 */
public class BOPrograma {

	private IDAOPrograma daoProg;


	public BOPrograma() {
		
		daoProg = new DAOProgramaJPA();
		
	}
	/**
	 * 
	 * @param p
	 * @throws Exception
	 */
	public void crearPrograma(Programa p) throws Exception{
		Programa pr = daoProg.buscarPrograma(p.getId());
		if(pr != null){
			throw new Excepciones("Este programa ya se encuentra registrado");
		}else{
			if(daoProg.buscarProgramaNombre(p.getNomPrograma())){
				throw new Excepciones("Ya hay un programa con este nombre");
			}else{
				daoProg.crear(p);
			}
		}
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Programa buscarPrograma(int id) throws Exception{
		return daoProg.buscarPrograma(id);
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 * @throws Exception
	 */
	public Programa editarPrograma(Programa p) throws Exception{	
		if(daoProg.buscarProgramaNombre(p.getNomPrograma())){
			throw new Excepciones("Ya hay un programa con este nombre");
		}else{
			daoProg.editarPrograma(p);
			return p;
		}
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Programa>listarPrograma()throws Exception{
		return daoProg.listarPrograma();
	}
	
	/**
	 * 
	 * @param facultad
	 * @return
	 * @throws Exception
	 */
	public List<Programa>listarProgramaFacultad(Facultad facultad)throws Exception{
		return daoProg.listarProgramaFacultad(facultad);
	}
	
	/**
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void eliminarPrograma(int id) throws Exception{
		Programa p = daoProg.buscarPrograma(id);
		if(p == null){
			throw new Excepciones("No se ha encontrado ningun programa\ncon el codigo "+id);
		}else{
			daoProg.eliminar(p);
		}
	}
	
}
