package br.edu.infnet.appagendea;

import java.time.LocalDateTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Agenda;

@Component
public class AgendaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#agenda");
		
		Agenda agenda1 = new Agenda();
		agenda1.data = LocalDateTime.now();
		agenda1.confirmado = true;
		agenda1.realizado = true;
		System.out.println(agenda1.toString());
		
		Agenda agenda2 = new Agenda();
		agenda1.data = LocalDateTime.now();
		agenda1.confirmado = false;
		agenda1.realizado = false;
		System.out.println(agenda2.toString());
		
		Agenda agenda3 = new Agenda();
		agenda1.data = LocalDateTime.now();
		agenda1.confirmado = true;
		agenda1.realizado = false;
		System.out.println(agenda3.toString());
	}
}
