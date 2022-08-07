package br.edu.infnet.appagenda;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagenda.model.domain.Consulta;

@Component
@Order(4)
public class ConsultaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#consulta");
		
		Consulta consulta1 = new Consulta();
		consulta1.setCodigo(1);
		consulta1.setAtivo(true);
		consulta1.setSuspensao(null);
		consulta1.setPeriodoSuspensao(0);
		consulta1.setNomeMedico("Elis Regina");
		consulta1.setEspecialidade("Pediatra");
		consulta1.setTempoDuracao(20);
		System.out.println(consulta1);
		
		Consulta consulta2 = new Consulta();
		consulta2.setCodigo(2);
		consulta2.setAtivo(false);
		consulta2.setSuspensao(null);
		consulta2.setPeriodoSuspensao(0);
		consulta2.setNomeMedico("Araci de Almeida");
		consulta2.setEspecialidade("Geriatria");
		consulta2.setTempoDuracao(30);
		System.out.println(consulta2);
		
		Consulta consulta3 = new Consulta();
		consulta3.setCodigo(3);
		consulta3.setAtivo(false);
		consulta3.setSuspensao(LocalDateTime.now());
		consulta3.setPeriodoSuspensao(40);
		consulta3.setNomeMedico("Silvio Sants");
		consulta3.setEspecialidade("Oftalmologista");
		consulta3.setTempoDuracao(15);
		System.out.println(consulta3);
	}
}
