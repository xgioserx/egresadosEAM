package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.AreaInteres;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.SectorLaboral;

public interface IDAOSectorLaboral {

	/**
	 * Listamos todas los Sectores laborales que se encuentran
	 * @return lista con todas los sectores laborales
	 * @throws Exception en caso de que la consulta no se puede ejecutar
	 */
	public List<SectorLaboral> listar() throws Exception;

}
