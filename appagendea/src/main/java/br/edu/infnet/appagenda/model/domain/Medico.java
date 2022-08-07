package br.edu.infnet.appagenda.model.domain;

public class Medico {
	public int codigo;
	public String nome;
	public String CRM;
	
	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + CRM;
	}
}
