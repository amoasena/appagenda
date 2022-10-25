package br.edu.infnet.appagenda.model.domain;

import java.time.LocalDateTime;

public abstract class Servico {
	public int codigo;
	public boolean ativo;
	public LocalDateTime suspensao;
	public int periodoSuspensao;
	public float valorCH;
	public int quantidadeCH;
	
	public float calcularValorServico()
	{
		return valorCH * quantidadeCH;
	}
	
	@Override
	public String toString() {
		return codigo + ";" + ativo + ";" + suspensao + ";" + periodoSuspensao + ";" + valorCH + ";" + quantidadeCH + ";" + calcularValorServico();
	}
	
	public abstract void impressao();

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

	public float getValorCH() {
		return valorCH;
	}

	public void setValorCH(float valorCH) {
		this.valorCH = valorCH;
	}

	public int getQuantidadeCH() {
		return quantidadeCH;
	}

	public void setQuantidadeCH(int quantidadeCH) {
		this.quantidadeCH = quantidadeCH;
	}
}
