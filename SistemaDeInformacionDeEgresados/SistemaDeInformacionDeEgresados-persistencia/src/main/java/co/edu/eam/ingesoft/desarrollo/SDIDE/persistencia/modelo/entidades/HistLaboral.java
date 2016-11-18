package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name="TB_HistLaboral")
@IdClass(HistLaboralPK.class)
public class HistLaboral implements Serializable {
	

	/*id del Egresado */
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_engresado")
	private InfoLaboral infoLaboral;
	
	/* Empresa del empleado*/
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_empresa")
	private Empresa idEmpresa;
	
	
	public HistLaboral() {
		super();
		
	}
	/**
	 * @param infoLaboral
	 * @param idEmpresa
	 */
	public HistLaboral(InfoLaboral infoLaboral,Empresa idEmpresa) {
		super();
		this.infoLaboral = infoLaboral;
		this.idEmpresa = idEmpresa;
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


	
	
}
