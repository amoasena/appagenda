package br.edu.infnet.appagenda;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Procedimento;

@Component
@Order(3)
public class ProcedimentoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#procedimento");
		
		Procedimento procedimento1 = new Procedimento();
		procedimento1.setCodigo(1);
		procedimento1.setAtivo(true);
		procedimento1.setSuspensao(null);
		procedimento1.setPeriodoSuspensao(0);
		procedimento1.setDescricao("Cauterização");
		System.out.println(procedimento1);
		
		Procedimento procedimento2 = new Procedimento();
		procedimento2.setCodigo(2);
		procedimento2.setAtivo(false);
		procedimento2.setSuspensao(null);
		procedimento2.setPeriodoSuspensao(0);
		procedimento2.setDescricao("Curativo");
		System.out.println(procedimento2);
		
		Procedimento procedimento3 = new Procedimento();
		procedimento3.setCodigo(3);
		procedimento3.setAtivo(false);
		procedimento3.setSuspensao(LocalDateTime.now());
		procedimento3.setPeriodoSuspensao(40);
		procedimento3.setDescricao("Sutura");
		System.out.println(procedimento3);
		
	}
}
