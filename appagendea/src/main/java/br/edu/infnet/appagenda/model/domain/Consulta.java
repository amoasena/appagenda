package br.edu.infnet.appagenda.model.domain;

public class Consulta {
	public String nomeMedico;
	public String especialidade;
	public int tempoDuracao;
	
	@Override
	public String toString() {
		return  nomeMedico + ";" + especialidade + ";" + tempoDuracao;
	}
}
