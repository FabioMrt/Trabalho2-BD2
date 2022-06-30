package br.edu.univas.bd2.run;

import br.edu.univas.bd2.dao.QuartoDAO;
import br.edu.univas.bd2.dao.QuartoDetalhesDAO;
import br.edu.univas.bd2.dao.ReservasDAO;
import br.edu.univas.bd2.entities.Quarto;
import br.edu.univas.bd2.entities.QuartoDetalhes;
import br.edu.univas.bd2.entities.Reservas;

public class Consulta {

	public static void main(String[] args) {
				
		//Consulta reservas
		ReservasDAO reservasDAO = new ReservasDAO();
		int pk_Res = 14;
		Reservas reserva = reservasDAO.consultar(pk_Res);
		if(reserva != null) {
			System.out.println(reserva.toString());
		}
		
		//Consulta quartos
		QuartoDAO quartoDAO = new QuartoDAO();
		int pk_Quarto = 18;
		Quarto quarto = quartoDAO.consultar(pk_Quarto);
		if(quarto != null) {
			System.out.println(quarto.toString());			
		}
		
		//Consulta Detalhes do Quarto
		QuartoDetalhesDAO detalhesDAO = new QuartoDetalhesDAO();
		int pk_Detalhes = 20;
		QuartoDetalhes detalhes = detalhesDAO.consultar(pk_Detalhes);
		if(detalhes != null) {
			System.out.println(detalhes.toString());			
		}
	}

}
