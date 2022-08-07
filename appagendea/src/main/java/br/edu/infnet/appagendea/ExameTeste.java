package br.edu.infnet.appagendea;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Exame;

@Component
public class ExameTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#exame");
		
		Exame exame1 = new Exame();
		exame1.descricao = "Sangue Completo";
		System.out.println(exame1.toString());
		
		Exame exame2 = new Exame();
		exame2.descricao = "Ultrassonografia";
		System.out.println(exame2.toString());
		
		Exame exame3 = new Exame();
		exame3.descricao = "Eletrocardiograma";
		System.out.println(exame3.toString());
	}
}
