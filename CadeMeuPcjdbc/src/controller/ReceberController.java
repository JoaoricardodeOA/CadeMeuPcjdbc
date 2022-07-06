package controller;

import java.sql.SQLException;

import dao.Conexao;
import view.ReceberView;

public class ReceberController {
	private ReceberView view; 
	public ReceberController(ReceberView view){
		this.view = view;
	}
	public void lerDados() {
		Long id = Long.parseLong(view.getTextField().getText());
		Conexao conexao= new Conexao();
		
		try {
			conexao.lerReceberjdbc(id);
			view.exibeMensagem("Dados enviados");
		} catch (SQLException e) {
			view.exibeMensagem("erro sql");
		}
	}
}
