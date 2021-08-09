package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.Cedulas;
import Entity.Chancelas;

public class CedulasDao {
	// excluir
	public String salvar(Cedulas cedulas) throws Exception {		
		try {			
			EntityManager em = Fabrica.getEntityManager();			
			em.getTransaction().begin();
			em.persist(cedulas);
			em.getTransaction().commit();			
			return "Ok";			
		} catch(Exception e) {
			throw new Exception("Erro gravando Cedulas: "+e.getMessage());
		}
	}
	
	// alterar
	public String alterar(Cedulas cedulas) throws Exception {
		try {			
			EntityManager em = Fabrica.getEntityManager();			
			em.getTransaction().begin();
			em.merge(cedulas);
			em.getTransaction().commit();			
			return "Ok";			
		} catch(Exception e) {
			throw new Exception("Erro gravando Cedulas: "+e.getMessage());
		}
	}

	// excluir
	public String deletar(Cedulas cedulas) throws Exception {
		try {			
			EntityManager em = Fabrica.getEntityManager();
			Cedulas g = em.find(Cedulas.class, cedulas.getId());
			em.getTransaction().begin();
			em.remove(g);
			em.getTransaction().commit();			
			return "Ok";			
		} catch(Exception e) {
			throw new Exception("Erro gravando Cedulas: "+e.getMessage());
		}
	}

	// consultar
	public List<Cedulas> consultar() throws Exception {		
		EntityManager em = Fabrica.getEntityManager();
		Query q = em.createQuery("select p from Cedulas p");
		return q.getResultList();
	}	
	
	public List<Cedulas> consultarnome() throws Exception {
		EntityManager em = Fabrica.getEntityManager();
		Query q = em.createQuery("select g from Cedulas g"
				+ " order by nomeCedula");

		return q.getResultList();
	}
	
	public List<Cedulas> consultarCedula() throws Exception {
		EntityManager em = Fabrica.getEntityManager();
		Query q = em.createQuery("select g from Cedulas g"
				+ " where seriesCedula like 'AA000000001 %'");

		return q.getResultList();
	}
	
}
