package br.edu.univas.bd2.run;

import br.edu.univas.bd2.dao.QuartoDAO;
import br.edu.univas.bd2.dao.QuartoDetalhesDAO;
import br.edu.univas.bd2.dao.ReservasDAO;

public class Delet {

	public static void main(String[] args) {
		ReservasDAO candidatosDAO = new ReservasDAO();
	
		int pk_Res = 9;
		candidatosDAO.deletar(pk_Res);
		
		QuartoDAO quartoDAO = new QuartoDAO();

		int pk_Quarto = 12;
		quartoDAO.deletar(pk_Quarto);
		
		QuartoDetalhesDAO detalhesDAO = new QuartoDetalhesDAO();
	
		int pk_detalhes = 15;
		detalhesDAO.deletar(pk_detalhes);
	}

}
