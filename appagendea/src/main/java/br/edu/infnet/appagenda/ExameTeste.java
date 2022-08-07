package br.edu.infnet.appagenda;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Exame;

@Component
@Order(4)
public class ExameTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#exame");
		
		Exame exame1 = new Exame();
		exame1.setCodigo(1);
		exame1.setAtivo(true);
		exame1.setSuspensao(null);
		exame1.setPeriodoSuspensao(0);
		exame1.setDescricao("Sangue Completo");
		System.out.println(exame1);
		
		Exame exame2 = new Exame();
		exame2.setCodigo(2);
		exame2.setAtivo(false);
		exame2.setSuspensao(null);
		exame2.setPeriodoSuspensao(0);
		exame2.setDescricao("Ultrassonografia");
		System.out.println(exame2);
		
		Exame exame3 = new Exame();
		exame3.setCodigo(3);
		exame3.setAtivo(false);
		exame3.setSuspensao(LocalDateTime.now());
		exame3.setPeriodoSuspensao(40);
		exame3.setDescricao("Eletrocardiograma");
		System.out.println(exame3);
	}
}
