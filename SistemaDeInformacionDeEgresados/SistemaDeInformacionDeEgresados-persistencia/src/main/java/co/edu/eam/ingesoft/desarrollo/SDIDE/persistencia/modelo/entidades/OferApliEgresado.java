package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.jar.Attributes.Name;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@IdClass(OferApliEgresadoPK.class)
@Entity
@Table(name="TB_AplicEgresado")
public class OferApliEgresado implements Serializable {

	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_egresado")
	private Egresado idEgresado;
	
	@Id
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_oferta")
	private OfertaLaboral idOferta;
	
	public OferApliEgresado(){
		
	}

	/**
	 * @param idEgresado
	 * @param idOferta
	 */
	public OferApliEgresado(Egresado idEgresado, OfertaLaboral idOferta) {
		super();
		this.idEgresado = idEgresado;
		this.idOferta = idOferta;
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
	 * @return the idOferta
	 */
	public OfertaLaboral getIdOferta() {
		return idOferta;
	}

	/**
	 * @param idOferta the idOferta to set
	 */
	public void setIdOferta(OfertaLaboral idOferta) {
		this.idOferta = idOferta;
	}

	
	
	
}
