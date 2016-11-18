package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = SectorLaboral.LISTAR_SECTORES, query = "SELECT sl FROM SectorLaboral sl ORDER BY sl.nomSector") })

@Entity
@Table(name="TB_SectorLaboral")
public class SectorLaboral implements Serializable {
	
	/* Id del sector laboral*/
	@Id
	@Column(name="id_sectorLaboral")
	private int idSectorLaboral;
	
	/* nombre del sector laboral */
	@Column(name="nom_sectorLaboral")
	private String nomSector;
	
	
	/* lista el sector laboral */
	public static final String LISTAR_SECTORES = "SectorLaboral.Listar";

	public SectorLaboral(){
		
	}

	/**
	 * @param nomSector
	 */
	public SectorLaboral(String nomSector) {
		super();
		this.nomSector = nomSector;
	}

	/**
	 * @return the idSectorLaboral
	 */
	public int getIdSectorLaboral() {
		return idSectorLaboral;
	}

	/**
	 * @param idSectorLaboral the idSectorLaboral to set
	 */
	public void setIdSectorLaboral(int idSectorLaboral) {
		this.idSectorLaboral = idSectorLaboral;
	}

	/**
	 * @return the nomSector
	 */
	public String getNomSector() {
		return nomSector;
	}

	/**
	 * @param nomSector the nomSector to set
	 */
	public void setNomSector(String nomSector) {
		this.nomSector = nomSector;
	}


	@Override
	public String toString() {
		return nomSector;
	}
}
