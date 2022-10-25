package br.edu.infnet.appagenda.model.test;

import br.edu.infnet.appagenda.model.domain.Servico;

public class appServico {

	private String mensagem;
	
	public appServico(String mensagem)
	{
		this.mensagem = mensagem;
	}
	
	public void relatorio (Servico servico)
	{
		System.out.println(mensagem);
		servico.impressao();		
	}
}
