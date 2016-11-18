package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name = AreaInteres.BUSCAR_NOMBRE_AREA, query = "SELECT ai FROM AreaInteres ai WHERE ai.nombre=?1"),
	@NamedQuery(name = AreaInteres.LISTAR_AREA, query = "SELECT ai FROM AreaInteres ai ORDER BY ai.nombre")
	
})

@Entity
@Table(name = "TB_AreaInteres")
public class AreaInteres implements Serializable {

	/* Id del area de interes */
	@Id
	@Column(name = "id_area",length=10)
	private int idArea;

	/* nombre del area de Interes */
	@Column(name = "nombre_area",nullable=false,length=20)
	private String nombre;

	/* listado de las areas de interes*/
	public static final String LISTAR_AREA = "AreaInteres.Listar";
	
	/* Buscar areas de interes por nombre */
	public static final String BUSCAR_NOMBRE_AREA = "AreaInteres.buscarNombre";
	
	public AreaInteres() {

	}

	public AreaInteres(int idArea, String nombre) {
		super();
		this.idArea = idArea;
		this.nombre = nombre;
	}

	/**
	 * @return the idArea
	 */
	public int getIdArea() {
		return idArea;
	}

	/**
	 * @param idArea
	 *            the idArea to set
	 */
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}
