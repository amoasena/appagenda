package br.edu.infnet.appagenda.model.domain;

import java.time.LocalDateTime;

public class Agenda {
	private LocalDateTime data;
	private LocalDateTime horario;
	private boolean confirmado;
	private boolean realizado;

	@Override
	public String toString() {
		return data + ";" + horario + ";" + confirmado + ";" + realizado;
	}
	
	public void impressao() {
		System.out.println("#procedimento");
		System.out.println(this);		
	}
	
	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime data) {
		this.horario = data;
	}
	
	public boolean isConfirmado() {
		return confirmado;
	}

	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public boolean isRealizado() {
		return realizado;
	}

	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
	}
}
