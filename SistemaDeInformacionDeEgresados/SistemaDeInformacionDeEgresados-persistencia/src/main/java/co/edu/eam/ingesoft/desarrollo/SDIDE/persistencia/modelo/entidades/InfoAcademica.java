package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.AreaDeConocimiento;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.NivelAcademico;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name = InfoAcademica.LISTAR_INFORMACION_ACADEMICA, query = "SELECT ia FROM InfoAcademica ia WHERE ia.egresado = ?1 ")
	})

@Entity
@Table(name="TB_InfoAcademica")
public class InfoAcademica implements Serializable{
	
	/* el egresado */
	@OneToOne
	@MapsId
	@JoinColumn(name="id_egresado", insertable = false, updatable = false)
	private Egresado egresado;

	/* codigo del egresado */
	@Id
	@Column(name = "id_egresado")
	private int codEgresado;
	
	/* Facultad del egresado*/
	@ManyToOne(cascade = {})
	@JoinColumn(name="facultad",nullable=false)
	private Facultad facultad;
	
	/* programa del egresado */
	@ManyToOne(cascade = {})
	@JoinColumn(name="programa_academico",nullable=false)
	private Programa programaAcademico;
	
	
	
	/* Fecha de grado del egresado */
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_grado",nullable=false)
	private Date fechaGrado;
	
	/* Area de conocimiento */
	@Enumerated(EnumType.STRING)
	@Column(name="area_conocimiento",length=20,nullable=false)
	private AreaDeConocimiento areaConocimiento;
	
	/* Numero del diploma */
	@Column(name="num_diploma",length=20,nullable=false)
	private String numeroDiploma;
	
	/* Nivel academico */
	@Enumerated(EnumType.STRING)
	@Column(name="nivel_academico",length=20,nullable=false)
	private NivelAcademico NivelAcademico;
	
	
	public static final String LISTAR_INFORMACION_ACADEMICA = "informacionAcademica.Listar";

	public InfoAcademica() {
		
	}

	/**
	 * @param egresado
	 * @param codEgresado
	 * @param facultad
	 * @param programaAcademico
	 * @param fechaGrado
	 * @param areaConocimiento
	 * @param numeroDiploma
	 * @param nivelAcademico
	 */
	public InfoAcademica(Egresado egresado, int codEgresado, Facultad facultad, Programa programaAcademico,
			Date fechaGrado, AreaDeConocimiento areaConocimiento, String numeroDiploma,
			co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.NivelAcademico nivelAcademico) {
		super();
		this.egresado = egresado;
		this.codEgresado = codEgresado;
		this.facultad = facultad;
		this.programaAcademico = programaAcademico;
		this.fechaGrado = fechaGrado;
		this.areaConocimiento = areaConocimiento;
		this.numeroDiploma = numeroDiploma;
		NivelAcademico = nivelAcademico;
	}

	/**
	 * @return the egresado
	 */
	public Egresado getEgresado() {
		return egresado;
	}

	/**
	 * @param egresado the egresado to set
	 */
	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
	}

	/**
	 * @return the codEgresado
	 */
	public int getCodEgresado() {
		return codEgresado;
	}

	/**
	 * @param codEgresado the codEgresado to set
	 */
	public void setCodEgresado(int codEgresado) {
		this.codEgresado = codEgresado;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * @return the programaAcademico
	 */
	public Programa getProgramaAcademico() {
		return programaAcademico;
	}

	/**
	 * @param programaAcademico the programaAcademico to set
	 */
	public void setProgramaAcademico(Programa programaAcademico) {
		this.programaAcademico = programaAcademico;
	}

	/**
	 * @return the fechaGrado
	 */
	public Date getFechaGrado() {
		return fechaGrado;
	}

	/**
	 * @param fechaGrado the fechaGrado to set
	 */
	public void setFechaGrado(Date fechaGrado) {
		this.fechaGrado = fechaGrado;
	}

	/**
	 * @return the areaConocimiento
	 */
	public AreaDeConocimiento getAreaConocimiento() {
		return areaConocimiento;
	}

	/**
	 * @param areaConocimiento the areaConocimiento to set
	 */
	public void setAreaConocimiento(AreaDeConocimiento areaConocimiento) {
		this.areaConocimiento = areaConocimiento;
	}

	/**
	 * @return the numeroDiploma
	 */
	public String getNumeroDiploma() {
		return numeroDiploma;
	}

	/**
	 * @param numeroDiploma the numeroDiploma to set
	 */
	public void setNumeroDiploma(String numeroDiploma) {
		this.numeroDiploma = numeroDiploma;
	}

	/**
	 * @return the nivelAcademico
	 */
	public NivelAcademico getNivelAcademico() {
		return NivelAcademico;
	}

	/**
	 * @param nivelAcademico the nivelAcademico to set
	 */
	public void setNivelAcademico(NivelAcademico nivelAcademico) {
		NivelAcademico = nivelAcademico;
	}


	
	
	
}
