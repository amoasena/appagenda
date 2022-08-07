package br.edu.infnet.appagenda.model.domain;

public class Procedimento extends Servico{
	public String descricao;

	@Override
	public String toString() {
		return super.toString() + ";" + descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
