package br.edu.univas.bd2.run;

import java.util.Date;

import br.edu.univas.bd2.dao.QuartoDAO;
import br.edu.univas.bd2.dao.QuartoDetalhesDAO;
import br.edu.univas.bd2.dao.ReservasDAO;
import br.edu.univas.bd2.entities.Quarto;
import br.edu.univas.bd2.entities.QuartoDetalhes;
import br.edu.univas.bd2.entities.Reservas;

public class Persistencia {

	public static void main(String[] args) {
		ReservasDAO reservasDAO = new ReservasDAO();
		QuartoDAO quartoDAO = new QuartoDAO();
		QuartoDetalhesDAO quartoDetalhesDAO = new QuartoDetalhesDAO();
		
		QuartoDetalhes detalhes = new QuartoDetalhes();
		detalhes.setvalorDiaria("200");
		detalhes.setqtd_camas(2);
		detalhes.setnumeroQuarto(14);
	
		quartoDetalhesDAO.persistir(detalhes);
		
		Quarto quarto = new Quarto();
		quarto.sethotel("Hotel X");
		quarto.setDetalhes(detalhes);
		
		quartoDAO.persistir(quarto);
		
		Reservas reserva = new Reservas();
		reserva.setNome("Fabio");
		reserva.setcpf("123456424");
		reserva.setdataReserva(new Date());
		reserva.setQuarto(quarto);
		
		reservasDAO.persistir(reserva);
	
	}

}
