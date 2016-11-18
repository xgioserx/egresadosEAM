/**
 * 
 */
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

	@NamedQuery(name = Pais.LISTAR_PAISES, query = "SELECT p FROM Pais p ORDER BY p.nomPais") 
	})
@Entity
@Table(name = "TB_Pais")
public class Pais implements Serializable{

	/* id del pais*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_pais")
	private int idPais;
	
	/* nombre del pais*/
	@Column(name = "nom_pais")
	private String nomPais;
	

	/* Listar Paises*/
	public static final String LISTAR_PAISES = "Paises.Listar";
	
	public Pais() {
		super();	
	}

	/**
	 * @param id
	 * @param nomPais
	 */
	public Pais(int id, String nomPais) {
		super();
		this.idPais = id;
		this.nomPais = nomPais;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return idPais;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idPais = id;
	}

	/**
	 * @return the nomPais
	 */
	public String getNomPais() {
		return nomPais;
	}

	/**
	 * @param nomPais the nomPais to set
	 */
	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}

	@Override
	public String toString() {
		return nomPais;
	}
	
	
}
