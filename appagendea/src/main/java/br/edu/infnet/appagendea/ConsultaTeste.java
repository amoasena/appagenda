package br.edu.infnet.appagendea;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Consulta;

@Component
public class ConsultaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#consulta");
		
		Consulta consulta1 = new Consulta();
		consulta1.nomeMedico = "Elis Regina";
		consulta1.especialidade = "Pediatra";
		consulta1.tempoDuracao = 20;
		System.out.println(consulta1.toString());
		
		Consulta consulta2 = new Consulta();
		consulta1.nomeMedico = "Araci de Almeida";
		consulta1.especialidade = "Geriatria";
		consulta2.tempoDuracao = 30;
		System.out.println(consulta2.toString());
		
		Consulta consulta3 = new Consulta();
		consulta1.nomeMedico = "Silvio Sants";
		consulta1.especialidade = "Oftalmologista";
		consulta3.tempoDuracao = 15;
		System.out.println(consulta3.toString());
	}
}
