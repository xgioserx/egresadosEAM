/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.SDIDE.logica.bos;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Egresado;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.InfoLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa.DAOInfoLaboralJPA;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOInfoLaboral;

/**
 * @author XgioserX
 *
 */
public class BOInfoLaboral {
private IDAOInfoLaboral daoILab;

public BOInfoLaboral() {
	daoILab = new DAOInfoLaboralJPA();
}
/**
 * 
 * @param il
 * @throws Exception
 */
public void crearInfoAcademica(InfoLaboral il) throws Exception {
	daoILab.crear(il);
}
/**
 * 
 * @param id
 * @return
 * @throws Exception
 */
public InfoLaboral buscarInfoLaboral(int id) throws Exception {
	return daoILab.buscar(id);
}

/**
 * 
 * @param e
 * @return
 * @throws Exception
 */
public List<InfoLaboral> listaInfoAcademicaEgresado(Egresado e) throws Exception {
	List<InfoLaboral> lista = daoILab.listarInfoLaboralEgresados(e);
	return lista;
}

/**
 * 
 * @param il
 * @throws Exception
 */
public void editarInformacion(InfoLaboral il) throws Exception {
	daoILab.editar(il);
}

}
