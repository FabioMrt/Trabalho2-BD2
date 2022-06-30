package br.edu.univas.bd2.run;

import java.util.Date;

import br.edu.univas.bd2.dao.QuartoDAO;
import br.edu.univas.bd2.dao.QuartoDetalhesDAO;
import br.edu.univas.bd2.dao.ReservasDAO;
import br.edu.univas.bd2.entities.Quarto;
import br.edu.univas.bd2.entities.QuartoDetalhes;
import br.edu.univas.bd2.entities.Reservas;

public class Update {

	public static void main(String[] args) {
		
		
		ReservasDAO reservasDAO = new ReservasDAO();
		
		int pk_Res = 15;
		Reservas reserva = reservasDAO.consultar(pk_Res);
		if(reserva != null) {
			reserva.setNome("João");
			reserva.setcpf("12341251");
			reserva.setdataReserva(new Date());
			reservasDAO.atualizar(reserva);
		}
		else {
			System.out.println("reserva não encontrada");
		}
		
		QuartoDAO quartoDAO = new QuartoDAO();
		
		int pk_quarto = 16;
		Quarto quarto = quartoDAO.consultar(pk_quarto);
		if(quarto != null) {
			quarto.sethotel("Hotel X");
			quartoDAO.atualizar(quarto);
		}
		else {
			System.out.println("quarto não encontrado");
		}
		
		QuartoDetalhesDAO quartoDetalhesDAO = new QuartoDetalhesDAO();
	
		int pk_Detalhes = 21;
		QuartoDetalhes detalhes = quartoDetalhesDAO.consultar(pk_Detalhes);
		if(detalhes != null) {
			detalhes.setvalorDiaria("300");
			detalhes.setqtd_camas(1);
			detalhes.setnumeroQuarto(10);
			quartoDetalhesDAO.atualizar(detalhes);
		}
		else {
			System.out.println("Detalhes não encontrados!");
		}
	}

}
