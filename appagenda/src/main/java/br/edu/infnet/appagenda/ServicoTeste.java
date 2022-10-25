package br.edu.infnet.appagenda;

import java.time.LocalDateTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Servico;

@Component
@Order(2)
public class ServicoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*System.out.println("#servico");
		
		Servico servico1 = new Servico();
		servico1.setCodigo(1);
		servico1.setAtivo(true);
		servico1.setSuspensao(null);
		servico1.setPeriodoSuspensao(0);
		servico1.setValorCH(10.00f);
		servico1.setQuantidadeCH(10);
		System.out.println(servico1);
		
		Servico servico2 = new Servico();
		servico2.setCodigo(2);
		servico2.setAtivo(false);
		servico2.setSuspensao(null);
		servico2.setPeriodoSuspensao(0);
		servico2.setValorCH(20.50f);
		servico2.setQuantidadeCH(20);
		System.out.println(servico2);
		
		Servico servico3 = new Servico();
		servico3.setCodigo(3);
		servico3.setAtivo(false);
		servico3.setSuspensao(LocalDateTime.now());
		servico3.setPeriodoSuspensao(40);
		servico3.setValorCH(5.90f);
		servico3.setQuantidadeCH(1);
		System.out.println(servico3);*/
		
	}
}
