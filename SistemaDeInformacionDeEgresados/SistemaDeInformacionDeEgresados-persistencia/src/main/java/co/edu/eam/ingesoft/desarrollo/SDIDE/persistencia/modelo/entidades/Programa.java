package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = Programa.LISTAR_PROGRAMAS, query = "SELECT p FROM Programa p ORDER BY p.nomPrograma"),
	@NamedQuery(name = Programa.BUSCAR_NOMBRE, query = "SELECT p FROM Programa p WHERE p.nomPrograma=?1"),
	@NamedQuery(name = Programa.LISTAR_PROGRAMAS_FACULTAD, query = "SELECT p FROM Programa p WHERE p.idFacultad=?1 ORDER BY p.nomPrograma")
})
@Entity
@Table(name="TB_Programa")
public class Programa implements Serializable {

	/* Id del Programa */
	@Id
	@Column(name="id_programa")
	private int idPrograma;
	
	/* Facultad a la que pertenece el programa */
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_facultad",nullable=false)
	private Facultad idFacultad;
	
	/* nombre del programa */
	@Column(name="nom_programa")
	private String nomPrograma;
	
	/* listar programas */
	public static final String LISTAR_PROGRAMAS = "Programas.Listar";
	
	/*busca programas por nombre */
	public static final String BUSCAR_NOMBRE = "Programas.buscarxNombre";
	
	/* lista programas por facultad */
	public static final String LISTAR_PROGRAMAS_FACULTAD = "Programa.listarxFacultad";

	
	
	public Programa(){
		
	}

	/**
	 * @param id
	 * @param idFacultad
	 * @param nomPrograma
	 */
	public Programa(int id, Facultad idFacultad, String nomPrograma) {
		super();
		this.idPrograma = id;
		this.idFacultad = idFacultad;
		this.nomPrograma = nomPrograma;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return idPrograma;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idPrograma = id;
	}

	/**
	 * @return the idFacultad
	 */
	public Facultad getIdFacultad() {
		return idFacultad;
	}

	/**
	 * @param idFacultad the idFacultad to set
	 */
	public void setIdFacultad(Facultad idFacultad) {
		this.idFacultad = idFacultad;
	}

	/**
	 * @return the nomPrograma
	 */
	public String getNomPrograma() {
		return nomPrograma;
	}

	/**
	 * @param nomPrograma the nomPrograma to set
	 */
	public void setNomPrograma(String nomPrograma) {
		this.nomPrograma = nomPrograma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPrograma;
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
		Programa other = (Programa) obj;
		if (idPrograma != other.idPrograma)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return nomPrograma;
	}
	
}
