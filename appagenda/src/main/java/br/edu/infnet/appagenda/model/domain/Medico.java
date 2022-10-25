package br.edu.infnet.appagenda.model.domain;

public class Medico {
	public int codigo;
	public String nome;
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String CRM;
	
	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + CRM;
	}
}
