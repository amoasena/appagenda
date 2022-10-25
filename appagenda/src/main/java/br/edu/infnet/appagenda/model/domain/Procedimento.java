package br.edu.infnet.appagenda.model.domain;

public class Procedimento extends Servico{
	public String descricao;
	public boolean auxiliares;

	@Override
	public float calcularValorServico() {
		
		return auxiliares ? (valorCH * quantidadeCH) + 250 : (valorCH * quantidadeCH);
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + descricao;
	}

	@Override
	public void impressao() {
		System.out.println("#procedimento");
		System.out.println(this);		
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean getAuxiliares() {
		return auxiliares;
	}

	public void setAuxiliares(boolean auxiliares) {
		this.auxiliares = auxiliares;
	}
}
