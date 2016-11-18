package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

public class HistLaboralPK implements Serializable{

	private int infoLaboral;
	
	private String idEmpresa;

	/**
	 * @param infoLaboral
	 * @param idEmpresa
	 */
	public HistLaboralPK(int infoLaboral, String idEmpresa) {
		super();
		this.infoLaboral = infoLaboral;
		this.idEmpresa = idEmpresa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
		result = prime * result + infoLaboral;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistLaboralPK other = (HistLaboralPK) obj;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		if (infoLaboral != other.infoLaboral)
			return false;
		return true;
	}

	
	
	
	
}
