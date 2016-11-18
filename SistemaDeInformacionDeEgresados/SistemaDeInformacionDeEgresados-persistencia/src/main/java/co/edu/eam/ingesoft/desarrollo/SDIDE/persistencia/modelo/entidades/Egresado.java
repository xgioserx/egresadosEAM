package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.TipoDocumento;

@Entity
@Table(name="TB_Egresado")
public class Egresado implements Serializable{

	/* Id del egresado */
	@Id	
	@Column(name="id_egresado",length=10)
	private int idEgresado;	
	
	/* nombre del egresado */
	@Column(name="nombre_egresado",nullable= false,length=30)
	private String nombre;
	
	/* apellido del egresado */
	@Column(name="apellido_egresado",nullable= false,length=30)
	private String apellido;
	
	/* Programa del egresado */
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_programa",nullable= false)
	private Programa programa;
	
	/* correo del egresado */
	@Column(name="correo_egresado",nullable= false,length=20)
	private String correo;
	
	/* telefono del egresado */
	@Column(name="telefono_egresado",length=20)
	private String telefono;
	
	/* celular del egresado */
	@Column(name="celular_egresado",length=20)
	private String celular;
	
	/* tipo de documento del egresado */
	@Column(name="tipoDocumento_egresado",nullable= false,length=20)
	private TipoDocumento tipoDoc;
	
	/* Numero de documento del Egresado */
	@Column(name="numero_documento", nullable=false,length=20)
	private String numDocumento;
	
	/* Informacion Laboral */
	@OneToOne(mappedBy="egresado")
	private InfoLaboral infoLaboral;
	
	/* Informacion Academica */
	@OneToOne(mappedBy="egresado")
	private InfoAcademica infoAcademica;
	
	public Egresado(){
		
	}

	/**
	 * @param idEgresado
	 * @param nombre
	 * @param apellido
	 * @param programa
	 * @param correo
	 * @param telefono
	 * @param celular
	 * @param tipoDoc
	 * @param numDocumento
	 * @param infoLaboral
	 * @param infoAcademica
	 */
	public Egresado(int idEgresado, String nombre, String apellido, Programa programa, String correo, String telefono,
			String celular, TipoDocumento tipoDoc, String numDocumento, InfoLaboral infoLaboral, InfoAcademica infoAcademica) {
		super();
		this.idEgresado = idEgresado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.programa = programa;
		this.correo = correo;
		this.telefono = telefono;
		this.celular = celular;
		this.tipoDoc = tipoDoc;
		this.numDocumento = numDocumento;
		this.infoLaboral = infoLaboral;
		this.infoAcademica = infoAcademica;
	}

	
	
	/**
	 * @return the tipoDoc
	 */
	public TipoDocumento getTipoDoc() {
		return tipoDoc;
	}

	/**
	 * @param tipoDoc the tipoDoc to set
	 */
	public void setTipoDoc(TipoDocumento tipoDoc) {
		this.tipoDoc = tipoDoc;
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

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the programa
	 */
	public Programa getPrograma() {
		return programa;
	}

	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
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

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}


	/**
	 * @return the numDocumento
	 */
	public String getNumDocumento() {
		return numDocumento;
	}

	/**
	 * @param numDocumento the numDocumento to set
	 */
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	/**
	 * @return the infoLaboral
	 */
	public InfoLaboral getInfoLaboral() {
		return infoLaboral;
	}

	/**
	 * @param infoLaboral the infoLaboral to set
	 */
	public void setInfoLaboral(InfoLaboral infoLaboral) {
		this.infoLaboral = infoLaboral;
	}

	/**
	 * @return the infoAcademica
	 */
	public InfoAcademica getInfoAcademica() {
		return infoAcademica;
	}

	/**
	 * @param infoAcademica the infoAcademica to set
	 */
	public void setInfoAcademica(InfoAcademica infoAcademica) {
		this.infoAcademica = infoAcademica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEgresado;
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
		Egresado other = (Egresado) obj;
		if (idEgresado != other.idEgresado)
			return false;
		return true;
	}	

		
}
