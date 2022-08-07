package br.edu.infnet.appagenda.model.domain;

import java.time.LocalDateTime;

public class Servico {
	public int codigo;
	public boolean ativo;
	public LocalDateTime suspensao;
	public int periodoSuspensao;
	
	@Override
	public String toString() {
		return codigo + ";" + ativo + ";" + suspensao + ";" + periodoSuspensao;
	}
	
}
