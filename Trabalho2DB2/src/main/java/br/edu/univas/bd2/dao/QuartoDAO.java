package br.edu.univas.bd2.dao;

import javax.persistence.EntityManager;

import br.edu.univas.bd2.entities.Quarto;
import br.edu.univas.bd2.utils.HibernateUtil;

public class QuartoDAO {
	
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public void persistir(Quarto quarto) {
		em.getTransaction().begin();
		em.persist(quarto);
		em.getTransaction().commit();
		System.out.println("Persistência realizada com sucesso!");
	}
	
	public Quarto consultar(Integer primaryKey) {
		Quarto objquarto = em.find(Quarto.class, primaryKey);
		
		if(objquarto == null) {
			System.out.println("Não existe quarto com primaryKey " + primaryKey + ". objquarto é null!");
		}
		else {
			System.out.println("Consulta realizada com sucesso!");
		}
		return objquarto;
	}
	
	public void atualizar(Quarto quarto) {
		if(quarto != null) {
			em.getTransaction().begin();
			em.merge(quarto);
			em.getTransaction().commit();
			System.out.println("quarto atualizada com sucesso!");
		}
		else {
			System.out.println("Erro! quarto é null!");
		}
	}
	
	public void deletar(Integer primaryKey) {
		Quarto objquarto = em.find(Quarto.class, primaryKey);
		if(objquarto != null) {
			em.getTransaction().begin();
			em.remove(objquarto);
			em.getTransaction().commit();
			
			System.out.println("Exclusão realizada com sucesso!");
		}
		else {
			System.out.println("Objeto com a primaryKey: " + primaryKey + " não encontrado!");
		}
	}

}
