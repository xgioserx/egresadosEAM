package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name = Facultad.LISTAR_FACULTADES, query = "SELECT f FROM Facultad f ORDER BY f.nombreFacultad")
})

@Entity
@Table(name="TB_Falcultad")
public class Facultad implements Serializable{

	
	/* Id de la Facultad */
	@Id
	@Column(name="id_facultad",length=10)
	private int idFacultad;
	
	/* Nombre  de la facultad*/
	@Column(name="nombre_facultad",nullable=false,length=20)
	private String nombreFacultad;
	
	/* Lista las facultades*/
	public static final String LISTAR_FACULTADES = "Facultades.Listar";
	
	public Facultad(){
		
	}

	public Facultad(int idFacultad, String nombreFacultad) {
		super();
		this.idFacultad = idFacultad;
		this.nombreFacultad = nombreFacultad;
	}

	/**
	 * @return the idFacultad
	 */
	public int getIdFacultad() {
		return idFacultad;
	}

	/**
	 * @param idFacultad the idFacultad to set
	 */
	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}

	/**
	 * @return the nombreFacultad
	 */
	public String getNombreFacultad() {
		return nombreFacultad;
	}

	/**
	 * @param nombreFacultad the nombreFacultad to set
	 */
	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFacultad;
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
			Facultad other = (Facultad) obj;
			if (idFacultad != other.idFacultad)
				return false;
			return true;
		}

	@Override
	public String toString() {
		return nombreFacultad;
	}
	
	
	
}
