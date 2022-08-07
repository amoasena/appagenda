package br.edu.infnet.appagenda;

import java.time.LocalDateTime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Agenda;

@Component
@Order(1)
public class AgendaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#agenda");
		
		Agenda agenda1 = new Agenda();
		agenda1.setData(LocalDateTime.now());
		agenda1.setConfirmado(true);
		agenda1.setRealizado(true);
		System.out.println(agenda1);
		
		Agenda agenda2 = new Agenda();
		agenda1.setData(LocalDateTime.now());
		agenda1.setConfirmado(false);
		agenda1.setRealizado(false);
		System.out.println(agenda2);
		
		Agenda agenda3 = new Agenda();
		agenda1.setData(LocalDateTime.now());
		agenda1.setConfirmado(true);
		agenda1.setRealizado(false);
		System.out.println(agenda3);
	}
}
