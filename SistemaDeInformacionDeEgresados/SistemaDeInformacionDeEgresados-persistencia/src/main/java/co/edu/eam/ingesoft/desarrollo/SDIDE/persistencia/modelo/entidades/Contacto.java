package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_Contacto")
public class Contacto implements Serializable {
	
	/* Id Empresa*/
	@Id
	@JoinColumn(name="id_empresa")
	private String idEmpresa;
	
	/* Empresa del contacto */
	@OneToOne
	@JoinColumn(name="id_empresa", insertable=false, updatable=false)
	@MapsId
	private Empresa empresa;
	
	/* Nombre Completo del contacto */
	@Column(name="nombre_Completo",nullable= false,length=30)
	private String nombreCompleto;
	
	@Column(name="correo",nullable= false,length=20)
	private String correo;
	
	@Column(name="cargo_empresa",nullable= false,length=20)
	private String cargoEmpresa;
	
	@Column(name="telefono",length=20)
	private String telefono;
	
	public Contacto(){
		
	}

	/**
	 * @param idEmpresa
	 * @param empresa
	 * @param nombreCompleto
	 * @param correo
	 * @param cargoEmpresa
	 * @param telefono
	 */
	public Contacto(Empresa empresa, String nombreCompleto, String correo, String cargoEmpresa, String telefono) {
		super();
		idEmpresa = empresa.getIdEmpresa();
		this.empresa = empresa;
		this.telefono = telefono;
	}



	/**
	 * @return the idEmpresa
	 */
	public String getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the cargoEmpresa
	 */
	public String getCargoEmpresa() {
		return cargoEmpresa;
	}

	/**
	 * @param cargoEmpresa the cargoEmpresa to set
	 */
	public void setCargoEmpresa(String cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return  nombreCompleto;
	}
	
}
