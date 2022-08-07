package br.edu.infnet.appagenda.model.domain;

import java.time.LocalDateTime;

public class Agenda {
	public LocalDateTime data;
	public boolean confirmado;
	public boolean realizado;
	
	@Override
	public String toString() {
		return data + ";" + confirmado + ";" + realizado;
	}
}
