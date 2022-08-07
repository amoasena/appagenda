package br.edu.infnet.appagendea;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#cliente");
		
		Cliente cliente1 = new Cliente();
		cliente1.codigo = 1;
		cliente1.nome = "José Aparecido";
		cliente1.telefone = "24-99999-8888";
		System.out.println(cliente1.toString());
		
		Cliente cliente2 = new Cliente();
		cliente2.codigo = 2;
		cliente1.nome = "Maria das Graças";
		cliente1.telefone = "24-99999-7777";
		System.out.println(cliente2.toString());
		
		Cliente cliente3 = new Cliente();
		cliente3.codigo = 3;
		cliente1.nome = "Jovelina Pérola Negra";
		cliente1.telefone = "24-99999-6666";
		System.out.println(cliente3.toString());
		
	}
}
