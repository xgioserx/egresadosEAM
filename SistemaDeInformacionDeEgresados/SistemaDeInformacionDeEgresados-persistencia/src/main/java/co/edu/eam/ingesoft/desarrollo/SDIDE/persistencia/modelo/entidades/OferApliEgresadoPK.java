package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

public class OferApliEgresadoPK implements Serializable {

	private int idEgresado;
	
	private int idOferta;

	public OferApliEgresadoPK(){
		
	}
	
	public OferApliEgresadoPK(int egresado, int ofertaLaboral) {
		super();
		this.idEgresado = egresado;
		this.idOferta = ofertaLaboral;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEgresado;
		result = prime * result + idOferta;
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
		OferApliEgresadoPK other = (OferApliEgresadoPK) obj;
		if (idEgresado != other.idEgresado)
			return false;
		if (idOferta != other.idOferta)
			return false;
		return true;
	}
	
}
