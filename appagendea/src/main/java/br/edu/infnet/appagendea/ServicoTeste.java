package br.edu.infnet.appagendea;

import java.time.LocalDateTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Servico;

@Component
public class ServicoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#servico");
		
		Servico servico1 = new Servico();
		servico1.codigo = 1;
		servico1.ativo = true;
		servico1.suspensao = null;
		servico1.periodoSuspensao = 0;
		System.out.println(servico1.toString());
		
		Servico servico2 = new Servico();
		servico2.codigo = 2;
		servico2.ativo = false;
		servico2.suspensao = null;
		servico2.periodoSuspensao = 0;
		System.out.println(servico2.toString());
		
		Servico servico3 = new Servico();
		servico3.codigo = 3;
		servico3.ativo = false;
		servico3.suspensao = LocalDateTime.now();
		servico3.periodoSuspensao = 40;
		System.out.println(servico3.toString());
		
	}
}
