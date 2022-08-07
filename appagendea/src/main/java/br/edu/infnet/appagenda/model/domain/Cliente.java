package br.edu.infnet.appagenda.model.domain;

public class Cliente {
	public int codigo;
	public String nome;
	public String telefone;
	
	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + telefone;
	}
}
