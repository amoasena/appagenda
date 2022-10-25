package br.edu.infnet.appagenda;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#cliente");
		
		Cliente cliente1 = new Cliente(1, "José Aparecido", "24-99999-8888");
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente(2, "Maria das Graças", "24-99999-7777");
		System.out.println(cliente2);
		
		Cliente cliente3 = new Cliente(3, "Jovelina Pérola Negra", "24-99999-6666");
		System.out.println(cliente3.toString());
		
	}
}
