package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.Cedulas;
import Entity.Chancelas;

public class ChancelasDao {
	public String salvar(Chancelas chancela) throws Exception {
		try {
			EntityManager em = Fabrica.getEntityManager();
			em.getTransaction().begin();
			em.persist(chancela);
			em.getTransaction().commit();
			return "Ok";
		} catch (Exception e) {
			throw new Exception("Erro gravando Chancelas: " + e.getMessage());
		}
	}

	// alterar
	public String alterar(Chancelas chancela) throws Exception {
		try {
			EntityManager em = Fabrica.getEntityManager();
			em.getTransaction().begin();
			em.merge(chancela);
			em.getTransaction().commit();
			return "Ok";
		} catch (Exception e) {
			throw new Exception("Erro gravando Chancelas: " + e.getMessage());
		}
	}

	// excluir
	public String deletar(Chancelas chancela) throws Exception {
		try {
			EntityManager em = Fabrica.getEntityManager();
			Chancelas g = em.find(Chancelas.class, chancela.getId());
			em.getTransaction().begin();
			em.remove(g);
			em.getTransaction().commit();
			return "Ok";
		} catch (Exception e) {
			throw new Exception("Erro gravando Chancelas: " + e.getMessage());
		}
	}

	// consultar
	public List<Chancelas> consultar() throws Exception {
		EntityManager em = Fabrica.getEntityManager();
		Query q = em.createQuery("select p from Chancelas p");
		return q.getResultList();
	}

	public List<Chancelas> consultarGuido(Chancelas chancela) throws Exception {
		EntityManager em = Fabrica.getEntityManager();
		Query q = em.createQuery("select g from Chancelas g"
				+ " where assinaturaChancela = :assinaturaChancela");
		q.setParameter("assinaturaChancela", chancela.getAssinaturaChancela());

		return q.getResultList();
	}

}
