package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.enumeraciones.TipoEmpresa;


@NamedQueries({
	@NamedQuery(name = Empresa.LISTAR_EMPRESAS, query = "SELECT e FROM Empresa e ORDER BY e.razonSocial") 
	})

@Entity
@Table(name="TB_Empresa")
public class Empresa  implements Serializable{
	
	/* Id de la Empresa*/
	@Id
	@Column(name="id_empresa",length=10)
	private String idEmpresa;
	
	/* Sector Laboral de la empresa*/
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_sectorLaboral",nullable=false)
	private SectorLaboral idSectorLaboral;
	
	/* Contacto de la Empresa */
	@OneToOne(mappedBy="empresa")
	private Contacto contacto;
	
	/* ciudad de la empresa */
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_ciudad",nullable=false)
	private Ciudad idCiudad;

	/* departamento de la empresa */
	@ManyToOne(cascade = {})
	@JoinColumn(name = "ciudad_departamento",nullable=false)
	private Departamento idDepartamento;

	/* pais de la empresa */
	@ManyToOne(cascade = {})
	@JoinColumn(name = "departamento_pais",nullable=false)
	private Pais idPais;
	
	/* Razon social */
	@Column(name="razon_social",nullable=false,length=20)
	private String razonSocial;
		
	/* Telefono */
	@Column(name="telefono",length=20)
	private String telefono;
	
	/* Tipo Empresa */
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_empresa",nullable=false,length=20)
	private TipoEmpresa tipo;
	
	/* Direccion */
	@Column(name="direccion",nullable=false,length=20)
	private String direccion;
	
	
	/* Sitio web */
	@Column(name="sitio_web",length=20)
	private String sitioWeb;

	/* Lista las Empresas*/
	public static final String LISTAR_EMPRESAS = "Empresas.Listar";
	
	public Empresa(){
		
	}

	/**
	 * @param idEmpresa
	 * @param idSectorLaboral
	 * @param contacto
	 * @param idCiudad
	 * @param idDepartamento
	 * @param idPais
	 * @param razonSocial
	 * @param fax
	 * @param telefono
	 * @param tipo
	 * @param direccion
	 * @param sitioWeb
	 */
	public Empresa(String idEmpresa, SectorLaboral idSectorLaboral, Ciudad idCiudad,
			Departamento idDepartamento, Pais idPais, String razonSocial, String telefono, TipoEmpresa tipo,
			String direccion, String sitioWeb) {
		super();
		this.idEmpresa = idEmpresa;
		this.idSectorLaboral = idSectorLaboral;
		this.idCiudad = idCiudad;
		this.idDepartamento = idDepartamento;
		this.idPais = idPais;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.tipo = tipo;
		this.direccion = direccion;
		this.sitioWeb = sitioWeb;
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
	 * @return the idSectorLaboral
	 */
	public SectorLaboral getIdSectorLaboral() {
		return idSectorLaboral;
	}

	/**
	 * @param idSectorLaboral the idSectorLaboral to set
	 */
	public void setIdSectorLaboral(SectorLaboral idSectorLaboral) {
		this.idSectorLaboral = idSectorLaboral;
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
	 * @return the idDepartamento
	 */
	public Departamento getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/**
	 * @return the idPais
	 */
	public Pais getIdPais() {
		return idPais;
	}

	/**
	 * @param idPais the idPais to set
	 */
	public void setIdPais(Pais idPais) {
		this.idPais = idPais;
	}

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
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
	 * @return the tipo
	 */
	public TipoEmpresa getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the sitioWeb
	 */
	public String getSitioWeb() {
		return sitioWeb;
	}

	/**
	 * @param sitioWeb the sitioWeb to set
	 */
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
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
		Empresa other = (Empresa) obj;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		return true;
	}


	@Override
    public String toString() {
        return razonSocial;
    }
	
}
