package br.edu.infnet.appagendea;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Procedimento;

@Component
public class ProcedimentoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#procedimento");
		
		Procedimento procedimento1 = new Procedimento();
		procedimento1.descricao = "Cauterização";
		System.out.println(procedimento1.toString());
		
		Procedimento procedimento2 = new Procedimento();
		procedimento2.descricao = "Curativo";
		System.out.println(procedimento2.toString());
		
		Procedimento procedimento3 = new Procedimento();
		procedimento3.descricao = "Sutura";
		System.out.println(procedimento3.toString());
		
	}
}
