package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;
import java.io.Serializable;

public class AreasEgresadoPK implements Serializable{

	private int idEgresado;
	
	private int idAreaInteres;
	
	public AreasEgresadoPK() {
		
	}

	/**
	 * @param idEgresado
	 * @param idAreaInteres
	 */
	public AreasEgresadoPK(int idEgresado, int idAreaInteres) {
		super();
		this.idEgresado = idEgresado;
		this.idAreaInteres = idAreaInteres;
	}

	/**
	 * @return the idEgresado
	 */
	public int getIdEgresado() {
		return idEgresado;
	}

	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(int idEgresado) {
		this.idEgresado = idEgresado;
	}

	/**
	 * @return the idAreaInteres
	 */
	public int getIdAreaInteres() {
		return idAreaInteres;
	}

	/**
	 * @param idAreaInteres the idAreaInteres to set
	 */
	public void setIdAreaInteres(int idAreaInteres) {
		this.idAreaInteres = idAreaInteres;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAreaInteres;
		result = prime * result + idEgresado;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AreasEgresadoPK other = (AreasEgresadoPK) obj;
		if (idAreaInteres != other.idAreaInteres)
			return false;
		if (idEgresado != other.idEgresado)
			return false;
		return true;
	}

	

}
