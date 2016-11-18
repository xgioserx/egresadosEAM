package co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.definiciones.IDAOEmpresa;
import co.edu.eam.ingesoft.desarrollo.SDIDE.persistencia.modelo.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * @author  Xgioserx
 */
public class DAOEmpresaJPA implements IDAOEmpresa {

	public void crear(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		en.getTransaction().begin();
		en.persist(e);
		en.getTransaction().commit();
		
	}

	public void editar(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.merge(e);
        en.getTransaction().commit();
		
	}

	public Empresa buscar(String id) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		return en.find(Empresa.class, id);
	}

	public void eliminar(Empresa e) throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
        en.getTransaction().begin();
        en.remove(en.merge(e));
        en.getTransaction().commit();
		
	}

	public List<SectorLaboral> listarSectorLab() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(SectorLaboral.LISTAR_SECTORES);
		List<SectorLaboral> lista = q.getResultList();
		return lista;
	}

	public List<Empresa> listarEmpresas() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Empresa.LISTAR_EMPRESAS);
		List<Empresa> lista = q.getResultList();
		return lista;
	}

	public List<Pais> listarPaises() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Pais.LISTAR_PAISES);
		List<Pais> lista = q.getResultList();
		return lista;
	}

	public List<Departamento> listarDepartamentos() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Departamento.LISTAR_DEPARTAMENTOS);
		List<Departamento> lista = q.getResultList();
		return lista;
	}

	public List<Ciudad> listarCiudades() throws Exception {
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Ciudad.LISTAR_CIUDADES);
		List<Ciudad> lista = q.getResultList();
		return lista;
	}
	


	
}
