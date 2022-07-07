package model;

import java.util.Date;

public class Equipamento implements Comparable<Equipamento>{
	
	private long id;
	
	private int vezesQuebrado;
	private String serialNumber;
	private String patrimonio;
	private Date idade;
	private String modelo;
	private String tipo;
	private String reponsavel;
	private boolean manutencao;
	private String empresa;
	
	public Equipamento( String serialNumber, String patrimonio, Date idade, String modelo, String tipo, String reponsavel, String empresa) {
		this.serialNumber = serialNumber;
		this.patrimonio = patrimonio;
		this.idade = idade;
		this.modelo = modelo;
		this.tipo = tipo;
		this.reponsavel = reponsavel;
		this.empresa = empresa;
		this.manutencao = true;
		vezesQuebrado = 1;
	}
	public Equipamento(long id,int vezesQuebrado, String serialNumber, String patrimonio, Date idade, String modelo, String tipo, String reponsavel, String empresa, boolean manutencao) {
		this.id = id;
		this.vezesQuebrado = vezesQuebrado;
		this.serialNumber = serialNumber;
		this.patrimonio = patrimonio;
		this.idade = idade;
		this.modelo = modelo;
		this.tipo = tipo;
		this.reponsavel = reponsavel;
		this.empresa = empresa;
		this.manutencao = manutencao;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Equipamento() {
		
	}
	public boolean isManutencao() {
		return manutencao;
	}
	public void setManutencao(boolean manutencao) {
		this.manutencao = manutencao;
	}
	public long getId() {
		return id;
	}
	public int getVezesQuebrado() {
		return vezesQuebrado;
	}
	public void setVezesQuebrado(int vezesQuebrado) {
		this.vezesQuebrado = vezesQuebrado;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}
	public Date getIdade() {
		return idade;
	}
	public void setIdade(Date idade) {
		this.idade = idade;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getReponsavel() {
		return reponsavel;
	}
	public void setReponsavel(String reponsavel) {
		this.reponsavel = reponsavel;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "Equipamento [id=" + id + ", Vezes Quebrado=" + vezesQuebrado + ", serialNumber=" + serialNumber
				+ ", patrimonio=" + patrimonio + ", idade=" + idade + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", reponsavel=" + reponsavel + ", empresa=" + empresa  +", manuten��o" + manutencao+"]";
	}
	@Override
	public int compareTo(Equipamento o) {
		if(this.vezesQuebrado > o.vezesQuebrado) {
			return -1;
		}else if(this.vezesQuebrado < o.vezesQuebrado) {
			return 1;
		}else {
			return 0;
		}
	} 
}
