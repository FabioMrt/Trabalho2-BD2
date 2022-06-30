package br.edu.univas.bd2.dao;

import javax.persistence.EntityManager;

import br.edu.univas.bd2.entities.Reservas;
import br.edu.univas.bd2.utils.HibernateUtil;

public class ReservasDAO {
	
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public void persistir(Reservas reservas) {
		em.getTransaction().begin();
		em.persist(reservas);
		em.getTransaction().commit();
		System.out.println("Persistência realizada com sucesso!");
	}
	
	public Reservas consultar(Integer primaryKey) {
		Reservas objRes = em.find(Reservas.class, primaryKey);
		
		if(objRes == null) {
			System.out.println("Não existe reservas com primaryKey " + primaryKey + ". objRes é null!");
		}
		else {
			System.out.println("Consulta realizada com sucesso!");
		}
		return objRes;
	}
	
	public void atualizar(Reservas reservas) {
		if(reservas != null) {
			em.getTransaction().begin();
			em.merge(reservas);
			em.getTransaction().commit();
			System.out.println("reservas atualizado com sucesso!");
		}
		else {
			System.out.println("Erro! reservas é null!");
		}
	}
	
	public void deletar(Integer primaryKey) {
		Reservas objRes = em.find(Reservas.class, primaryKey);
		if(objRes != null) {
			em.getTransaction().begin();
			em.remove(objRes);
			em.getTransaction().commit();
			
			System.out.println("Exclusão realizada com sucesso!");
		}
		else {
			System.out.println("Objeto com a primaryKey: " + primaryKey + " não encontrado!");
		}
	}

}
