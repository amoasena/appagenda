package br.edu.infnet.appagenda.model.domain;

public class Exame extends Servico{
	public String descricao;

	@Override
	public String toString() {
		return  super.toString() + ";" + descricao;
	}

	@Override
	public void impressao() {
		System.out.println("#exame");
		System.out.println(this);		
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
