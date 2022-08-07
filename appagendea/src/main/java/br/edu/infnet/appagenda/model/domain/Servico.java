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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getSuspensao() {
		return suspensao;
	}

	public void setSuspensao(LocalDateTime suspensao) {
		this.suspensao = suspensao;
	}

	public int getPeriodoSuspensao() {
		return periodoSuspensao;
	}

	public void setPeriodoSuspensao(int periodoSuspensao) {
		this.periodoSuspensao = periodoSuspensao;
	}
	
}
