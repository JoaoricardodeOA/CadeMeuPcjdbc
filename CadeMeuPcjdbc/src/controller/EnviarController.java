package controller;



import java.sql.SQLException;
import java.util.List;

import controllerHelper.EnviarHelper;
import dao.Conexao;
import model.Equipamento;
import model.Ocorrencia;
import view.EnviarView;

public class EnviarController {
	private final EnviarView view;
	private EnviarHelper helper;
	private Conexao conexao;

	public EnviarController(EnviarView view) {
		this.view = view;
		this.helper = new EnviarHelper(view);
	}
	 public void lerDados() {
		Equipamento e =  helper.lerEquipamento();
		conexao = new Conexao();
		try {
		e = conexao.lerEnviarEquipamentojdbc(e);
		if(e == null){
			view.exibeMensagem("equipamento ja em manutencao ou dados incorretos");
			return ;
		}
		Ocorrencia o = helper.lerOcorrencia(e);
		view.exibeMensagem("Dados enviados");
		conexao.lerEnviarOcorrenciajdbc(o);
		}catch(SQLException o) {
			view.exibeMensagem("Erro sql");
		}
	 }
	 public void comboBoxModelo() {
		 conexao = new Conexao();
		 try {
			 List<String> list = conexao.queryModeloComboBox();
			 
			 helper.preencherComboBoxModelo(list);
		 }catch(SQLException o) {
			view.exibeMensagem("Erro sql");
		}
	 }
	 public void comboBoxEmpresa() {
		 conexao = new Conexao();
		 try {
			 List<String> list = conexao.queryEmpresaComboBox();
			 
			 helper.preencherComboBoxEmpresa(list);
		 }catch(SQLException o) {
			view.exibeMensagem("Erro sql");
		}
	 }
	 public void comboBoxTipo() {
		 conexao = new Conexao();
		 try {
			 List<String> list = conexao.queryTipoComboBox();
			 
			 helper.preencherComboBoxTipo(list);
		 }catch(SQLException o) {
			view.exibeMensagem("Erro sql");
		}
	 }
	 public void comboBoxPrestador() {
		 conexao = new Conexao();
		 try {
			 List<String> list = conexao.queryPrestadorComboBox();
			 
			 helper.preencherComboBoxPrestador(list);
		 }catch(SQLException o) {
			view.exibeMensagem("Erro sql");
		}
	 }

}
