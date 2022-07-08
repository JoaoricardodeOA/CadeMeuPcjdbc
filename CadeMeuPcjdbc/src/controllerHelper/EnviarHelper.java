package controllerHelper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import exceptions.CamposInvalidosException;
import model.Equipamento;
import model.Ocorrencia;
import view.EnviarView;

public class EnviarHelper {
	private final EnviarView view;

	public EnviarHelper(EnviarView view) {
		this.view = view;
	}
	public Equipamento lerEquipamento() {
		 try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String serial = view.getTextSerial().getText().toLowerCase();
		 	String patrimonio = view.getTextPatrimonio().getText().toLowerCase();
		 	String empresa =view.getComboBox_1().getSelectedItem().toString().toLowerCase();
		 	String modelo = view.getComboBox().getSelectedItem().toString().toLowerCase();
		 	String tipo = view.getComboBox_2().getSelectedItem().toString().toLowerCase();
		 	String responsavel = view.getTextResponsavel().getText().toLowerCase();
			Date idade = formatter.parse(view.getTextData().getText());
			 if(serial == null||patrimonio== null||modelo==null||tipo==null||responsavel==null||empresa==null) {
				 view.exibeMensagem("campos = serial, patrimonio, idade, modelo, tipo, responsavel e empresa precisam ser preenchidos");
				 return null;
			 }
			 Equipamento equipamento = new Equipamento(serial,patrimonio,idade,modelo,tipo,responsavel,empresa);
			 return equipamento;
			 } catch (ParseException e) {
				// TODO Auto-generated catch block
				 view.exibeMensagem("Idade em formato incorreto");
			}
		 return null;

			
	 }
	public Ocorrencia lerOcorrencia(Equipamento equipamento) {
		 try {
			String prestador = view.getComboBox_3().getSelectedItem().toString().toLowerCase();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String problema = view.getTextProblema().getText().toLowerCase();
			boolean fonte = view.getChckbxNewCheckBox().isSelected();
			String nf = view.getTextNF().getText().toLowerCase();
			String os = view.getTextOS().getText().toLowerCase();	
			double valor =Double.parseDouble(view.getTextValor().getText().replace(",", "."));
			Date data = formatter.parse(view.getTextData().getText()); 
			Ocorrencia ocorrencia = new Ocorrencia(prestador, data, equipamento, problema, fonte );
			ocorrencia.setValor(valor);
			ocorrencia.setnF(nf);
			ocorrencia.setoS(os);
			if(prestador == null||problema== null) {
				 view.exibeMensagem("campos = prestador, problema, data e valor precisam ser preenchidos");
				 return null;
			 }
			return ocorrencia;
		}catch(ParseException e) {
			view.exibeMensagem("Data em formato incorreto");
		}catch(NumberFormatException a) {
			view.exibeMensagem("Valor em formato incorreto");
		}
		return null;
	}
	public void preencherComboBoxModelo(List<String> list) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBox().getModel();
		comboBoxModel.removeAllElements();
		if(list != null) {
			for (String string : list) {
				comboBoxModel.addElement(string);
			}
		}
		
	}
	public void preencherComboBoxEmpresa(List<String> list) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBox_1().getModel();
		comboBoxModel.removeAllElements();
		if(list != null) {
			for (String string : list) {
				comboBoxModel.addElement(string);
			}
		}
		
	}
	public void preencherComboBoxTipo(List<String> list) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBox_2().getModel();
		comboBoxModel.removeAllElements();
		if(list != null) {
			for (String string : list) {
				comboBoxModel.addElement(string);
			}
		}
		
	}
	public void preencherComboBoxPrestador(List<String> list) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBox_3().getModel();
		comboBoxModel.removeAllElements();
		if(list != null) {
			for (String string : list) {
				comboBoxModel.addElement(string);
			}
		}
		
	}
}
