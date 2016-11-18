package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mysql.fabric.jdbc.FabricMySQLDataSource;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.SitucionLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.TipoEmpresa;

@NamedQueries({
	@NamedQuery(name = InfoLaboral.LISTAR_INFORMACION_LABORAL, query = "SELECT if FROM InfoLaboral if WHERE if.egresado = ?1 ")
})

@Entity
@Table(name="TB_InfoLaboral")
public class InfoLaboral implements Serializable {

	
	/* id del egresado */
	@Id
	@Column(name="id_egresado",length=10)
	private int idEgresado;	
	
	/* el egresado */
	@OneToOne
	@MapsId
	@JoinColumn(name="id_egresado", insertable=false, updatable=false)
	private Egresado egresado;
	
	/* Situacion actual del egresado*/
	@Enumerated(EnumType.STRING)
	@Column(name="situacion_laboral", nullable=false)
	private SitucionLaboral situcionLaboral;
	
	/* tipo de empresa*/
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_empresa", nullable=false)
	private TipoEmpresa tipoEmpresa;
	
	/* nombre de empresa*/
	@Column(name="nombre_empresa",length=20, nullable=false)
	private String nombreEmpresa;
	
	/* Cargo dentro de la empresa */
	@Column(name="cargo_empresa",length=20, nullable=false)
	private String cargoEmpresa;
	
	/* sector dentro de la empresa */
	@Column(name="sector_laboral",length=20, nullable=false)
	private String sectorLaboral;
	
	/* Fecha de ingreso */
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_ingreso", nullable=false)
	private Date fechaIngreso;
	
	/* Fecha de salida */
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_salida", nullable=false)
	private Date fechaSalida;
	
	
	
	/* lista la infomacion laboral*/
	public static final String LISTAR_INFORMACION_LABORAL = "informacionLaboral.Listar";
	
	public InfoLaboral(){
		
	}

	/**
	 * @param idEgresado
	 * @param egresado
	 * @param situcionLaboral
	 * @param tipoEmpresa
	 * @param nombreEmpresa
	 * @param cargoEmpresa
	 * @param sectorLaboral
	 * @param fechaIngreso
	 * @param fechaSalida
	 */
	public InfoLaboral(int idEgresado, Egresado egresado, SitucionLaboral situcionLaboral, TipoEmpresa tipoEmpresa,
			String nombreEmpresa, String cargoEmpresa, String sectorLaboral, Date fechaIngreso, Date fechaSalida) {
		super();
		this.idEgresado = idEgresado;
		this.egresado = egresado;
		this.situcionLaboral = situcionLaboral;
		this.tipoEmpresa = tipoEmpresa;
		this.nombreEmpresa = nombreEmpresa;
		this.cargoEmpresa = cargoEmpresa;
		this.sectorLaboral = sectorLaboral;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
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
	 * @return the situcionLaboral
	 */
	public SitucionLaboral getSitucionLaboral() {
		return situcionLaboral;
	}

	/**
	 * @param situcionLaboral the situcionLaboral to set
	 */
	public void setSitucionLaboral(SitucionLaboral situcionLaboral) {
		this.situcionLaboral = situcionLaboral;
	}

	/**
	 * @return the tipoEmpresa
	 */
	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	/**
	 * @param tipoEmpresa the tipoEmpresa to set
	 */
	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
	 * @return the sectorLaboral
	 */
	public String getSectorLaboral() {
		return sectorLaboral;
	}

	/**
	 * @param sectorLaboral the sectorLaboral to set
	 */
	public void setSectorLaboral(String sectorLaboral) {
		this.sectorLaboral = sectorLaboral;
	}

	/**
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	
	
}
