package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = Departamento.LISTAR_DEPARTAMENTOS, query = "SELECT d FROM Departamento d ORDER BY d.nomDepartamento")
	})
@Entity
@Table(name="TB_Departamento")
public class Departamento implements Serializable {
	
	
	/* Id del departamento*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_departamento",length=10)
	private int idDepartamento;
	
	/* departamento del pais */
	@ManyToOne(cascade = {})
	@JoinColumn(name="id_pais",nullable= false)
	private Pais idPais;
	
	/* Nombre del departamento */
	@Column(name="nom_departamento",nullable= false,length=20)
	private String nomDepartamento;
	
	/* Listar los Departamento*/
	public static final String LISTAR_DEPARTAMENTOS = "Departamentos.Listar";
	
	public Departamento(){
		
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
	 * @return the nomDepartamento
	 */
	public String getNomDepartamento() {
		return nomDepartamento;
	}

	/**
	 * @param nomDepartamento the nomDepartamento to set
	 */
	public void setNomDepartamento(String nomDepartamento) {
		this.nomDepartamento = nomDepartamento;
	}

	@Override
	public String toString() {
		return nomDepartamento;
	}
	
	
	

}
