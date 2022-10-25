package br.edu.infnet.appagenda;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Procedimento;
import br.edu.infnet.appagenda.model.test.appServico;

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
		procedimento1.auxiliares = false;
		procedimento1.setValorCH(10);
		procedimento1.setQuantidadeCH(15);
		System.out.println(procedimento1);
		new appServico("Inclusão do procedimento de cauterização.").relatorio(procedimento1);
		
		Procedimento procedimento2 = new Procedimento();
		procedimento2.setCodigo(2);
		procedimento2.setAtivo(false);
		procedimento2.setSuspensao(null);
		procedimento2.setPeriodoSuspensao(0);
		procedimento2.setDescricao("Curativo");
		procedimento2.auxiliares = false;
		procedimento2.setValorCH(10);
		procedimento2.setQuantidadeCH(15);
		System.out.println(procedimento2);
		new appServico("Inclusão do procedimento de curativo.").relatorio(procedimento2);
		
		Procedimento procedimento3 = new Procedimento();
		procedimento3.setCodigo(3);
		procedimento3.setAtivo(false);
		procedimento3.setSuspensao(LocalDateTime.now());
		procedimento3.setPeriodoSuspensao(40);
		procedimento3.setDescricao("Sutura");
		procedimento3.auxiliares = false;
		procedimento3.setValorCH(10);
		procedimento3.setQuantidadeCH(15);
		System.out.println(procedimento3);
		new appServico("Inclusão do procedimento de sutura.").relatorio(procedimento3);
		
	}
}
