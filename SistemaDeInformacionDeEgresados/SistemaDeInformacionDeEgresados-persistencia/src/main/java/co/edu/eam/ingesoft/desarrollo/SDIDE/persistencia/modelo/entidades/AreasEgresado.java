package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name = AreasEgresado.BUSCAR_AREA_EGRESADO, query = "SELECT ae FROM AreasEgresado ae WHERE ae.idEgresado = ?1 AND ae.idAreaInteres = ?2")	
})

@IdClass(AreasEgresadoPK.class)
@Entity
@Table(name="TB_AreaEgresado")
public class AreasEgresado implements Serializable {

	/* id del Egresado */
	@Id
	@ManyToOne
	@JoinColumn(name="id_egresado")
	private Egresado idEgresado;
	
	
	/* id del Area de interes */
	@Id
	@ManyToOne
	@JoinColumn(name="id_areaInteres")
	private AreaInteres idAreaInteres;
	
	
	/* Buscar areas del Egresado por nombre */
	public static final String BUSCAR_AREA_EGRESADO = "AreasEgresado.buscar";
	
	public AreasEgresado(){
		
	}

	/**
	 * @param idEgresado
	 * @param idAreaInteres
	 */
	public AreasEgresado(Egresado idEgresado, AreaInteres idAreaInteres) {
		super();
		this.idEgresado = idEgresado;
		this.idAreaInteres = idAreaInteres;
	}

	/**
	 * @return the idEgresado
	 */
	public Egresado getIdEgresado() {
		return idEgresado;
	}

	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(Egresado idEgresado) {
		this.idEgresado = idEgresado;
	}

	/**
	 * @return the idAreaInteres
	 */
	public AreaInteres getIdAreaInteres() {
		return idAreaInteres;
	}

	/**
	 * @param idAreaInteres the idAreaInteres to set
	 */
	public void setIdAreaInteres(AreaInteres idAreaInteres) {
		this.idAreaInteres = idAreaInteres;
	}

	
	
}
