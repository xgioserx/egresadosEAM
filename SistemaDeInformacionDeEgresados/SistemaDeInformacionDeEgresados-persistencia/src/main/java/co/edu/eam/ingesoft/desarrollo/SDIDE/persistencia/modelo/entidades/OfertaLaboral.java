package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_OfertaLaboral")
public class OfertaLaboral implements Serializable {
	
	/* Id de la oferta laboral */
	@Id
	@Column(name = "id_oferta")
	private int idOferta;

	/* id Empresa de la Oferta laboral */
	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa idEmpresa;

	/* id ciudad de la Oferta laboral */
	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_ciudad", nullable = false)
	private Ciudad idCiudad;

	/* id area de interes de la Oferta laboral */
	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_area", nullable = false)
	private AreaInteres idArea;

	/* cargo de la oferta laboral */
	@Column(name = "cargo_ofrecer",length=20, nullable=false)
	private String cargoOfrecer;

	/* salario de la oferta laboral */
	@Column(name = "salario_oferta", nullable=false)
	private double salario;

	/* fecha de la oferta laboral */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_oferta", nullable=false)
	private Date fechaOferta;

	/* Resumen de la oferta laboral */
	@Column(name = "resumen_oferta",length=300, nullable=false)
	private String resumen;

	/* requisitos de la oferta laboral */
	@Column(name = "requisito_oferta",length=30, nullable=false)
	private String requisitoOferta;

	/* descripcion de la oferta laboral */
	@Column(name = "descripcion_oferta",length=300, nullable=false)
	private String descripcionOferta;

	/* Estado de la oferta laboral*/
	@Column(name = "estado", nullable=false)
	private boolean estado;

	public OfertaLaboral() {

	}

	/**
	 * @param idOferta
	 * @param idEmpresa
	 * @param idCiudad
	 * @param idArea
	 * @param cargoOfrecer
	 * @param salario
	 * @param fechaOferta
	 * @param resumen
	 * @param requisitoOferta
	 * @param descripcionOferta
	 * @param estado
	 */
	public OfertaLaboral(int idOferta, Empresa idEmpresa, Ciudad idCiudad, AreaInteres idArea, String cargoOfrecer,
			double salario, Date fechaOferta, String resumen, String requisitoOferta, String descripcionOferta,
			boolean estado) {
		super();
		this.idOferta = idOferta;
		this.idEmpresa = idEmpresa;
		this.idCiudad = idCiudad;
		this.idArea = idArea;
		this.cargoOfrecer = cargoOfrecer;
		this.salario = salario;
		this.fechaOferta = fechaOferta;
		this.resumen = resumen;
		this.requisitoOferta = requisitoOferta;
		this.descripcionOferta = descripcionOferta;
		this.estado = estado;
	}

	/**
	 * @return the idOferta
	 */
	public int getIdOferta() {
		return idOferta;
	}

	/**
	 * @param idOferta the idOferta to set
	 */
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	/**
	 * @return the idEmpresa
	 */
	public Empresa getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the idCiudad
	 */
	public Ciudad getIdCiudad() {
		return idCiudad;
	}

	/**
	 * @param idCiudad the idCiudad to set
	 */
	public void setIdCiudad(Ciudad idCiudad) {
		this.idCiudad = idCiudad;
	}

	/**
	 * @return the idArea
	 */
	public AreaInteres getIdArea() {
		return idArea;
	}

	/**
	 * @param idArea the idArea to set
	 */
	public void setIdArea(AreaInteres idArea) {
		this.idArea = idArea;
	}

	/**
	 * @return the cargoOfrecer
	 */
	public String getCargoOfrecer() {
		return cargoOfrecer;
	}

	/**
	 * @param cargoOfrecer the cargoOfrecer to set
	 */
	public void setCargoOfrecer(String cargoOfrecer) {
		this.cargoOfrecer = cargoOfrecer;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the fechaOferta
	 */
	public Date getFechaOferta() {
		return fechaOferta;
	}

	/**
	 * @param fechaOferta the fechaOferta to set
	 */
	public void setFechaOferta(Date fechaOferta) {
		this.fechaOferta = fechaOferta;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * @return the requisitoOferta
	 */
	public String getRequisitoOferta() {
		return requisitoOferta;
	}

	/**
	 * @param requisitoOferta the requisitoOferta to set
	 */
	public void setRequisitoOferta(String requisitoOferta) {
		this.requisitoOferta = requisitoOferta;
	}

	/**
	 * @return the descripcionOferta
	 */
	public String getDescripcionOferta() {
		return descripcionOferta;
	}

	/**
	 * @param descripcionOferta the descripcionOferta to set
	 */
	public void setDescripcionOferta(String descripcionOferta) {
		this.descripcionOferta = descripcionOferta;
	}

	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		OfertaLaboral other = (OfertaLaboral) obj;
		if (idOferta != other.idOferta)
			return false;
		return true;
	}
	
	
}
