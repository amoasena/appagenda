package br.edu.infnet.appagenda.model.domain;

public class Cliente {
	public int codigo;
	public String nome;
	public String telefone;

	
	public Cliente(int codigo, String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + telefone;
	}
	
	public void impressao() {
		System.out.println("#procedimento");
		System.out.println(this);		
	}
	
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
