package br.edu.univas.bd2.dao;

import javax.persistence.EntityManager;

import br.edu.univas.bd2.entities.QuartoDetalhes;
import br.edu.univas.bd2.utils.HibernateUtil;

public class QuartoDetalhesDAO {
	
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public void persistir(QuartoDetalhes detalhes) {
		em.getTransaction().begin();
		em.persist(detalhes);
		em.getTransaction().commit();
		System.out.println("Persistência realizada com sucesso");
	}
	
	public QuartoDetalhes consultar(Integer primaryKey) {
		QuartoDetalhes objDet = em.find(QuartoDetalhes.class, primaryKey);
		
		if(objDet == null) {
			System.out.println("Não existe detalhes com primaryKey " + primaryKey + ". objDet é null!");
		}
		else {
			System.out.println("Consulta realizada com sucesso");
		}
		return objDet;
	}
	
	public void atualizar(QuartoDetalhes detalhes) {
		if(detalhes != null) {
			em.getTransaction().begin();
			em.merge(detalhes);
			em.getTransaction().commit();
			System.out.println("Detalhes atualizados com sucesso");
		}
		else {
			System.out.println("Erro! Detalhes é null!");
		}
	}
	
	public void deletar(Integer primaryKey) {
		QuartoDetalhes objDet = em.find(QuartoDetalhes.class, primaryKey);
		if(objDet != null) {
			em.getTransaction().begin();
			em.remove(objDet);
			em.getTransaction().commit();
			
			System.out.println("Excluído com sucesso!");
		}
		else {
			System.out.println("Objeto com a primaryKey: " + primaryKey + " não encontrado!");
		}
	}

}
