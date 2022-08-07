package br.edu.infnet.appagenda.model.domain;

import java.time.LocalDateTime;

public class Agenda {
	private LocalDateTime data;
	private boolean confirmado;
	private boolean realizado;
	
	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
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

	@Override
	public String toString() {
		return data + ";" + confirmado + ";" + realizado;
	}
}
