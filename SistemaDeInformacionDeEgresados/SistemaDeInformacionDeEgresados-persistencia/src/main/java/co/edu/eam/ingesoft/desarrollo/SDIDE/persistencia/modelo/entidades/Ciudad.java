package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries({
	@NamedQuery(name = Ciudad.LISTAR_CIUDADES, query = "SELECT c FROM Ciudad c ORDER BY c.nombre") 
	})

@Entity
@Table(name="TB_Ciudad")
public class Ciudad implements Serializable {

	/* Id de la Ciudad */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ciudad",length=10)
	private int idCiudad;
	
	/* ciudad del departamento */
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_departamento",nullable= false)
	private Departamento idDepartamento;
	
	/* Nombre de la ciudad */
	@Column(name="nombre",length=20)
	private String nombre;
	
	/* Lista las ciudades */
	public static final String LISTAR_CIUDADES = "Ciudades.Listar";

	
	public Ciudad(){
		
	}


	/**
	 * @param idDepartamento
	 * @param nombre
	 */
	public Ciudad(Departamento idDepartamento, String nombre) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
	}


	/**
	 * @return the idCiudad
	 */
	public int getIdCiudad() {
		return idCiudad;
	}


	/**
	 * @param idCiudad the idCiudad to set
	 */
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}


	/**
	 * @return the idDepartamento
	 */
	public Departamento getIdDepartamento() {
		return idDepartamento;
	}


	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return nombre;
	}
	
}
