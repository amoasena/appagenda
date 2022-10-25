package br.edu.infnet.appagenda.model.domain;

public class Consulta extends Servico{
	public String nomeMedico;
	public String especialidade;
	public int tempoDuracao;
	
	@Override
	public String toString() {
		return  super.toString() + ";" + nomeMedico + ";" + especialidade + ";" + tempoDuracao;
	}
	
	@Override
	public float calcularValorServico() {
		
		if (tempoDuracao > 30)
		{
			return super.calcularValorServico() + (super.calcularValorServico() * 0.10f);
		}
		else
		{
			return super.calcularValorServico();
		}
	}
	
	@Override
	public void impressao() {
		System.out.println("#consulta");
		System.out.println(this);
	}
	
	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
}
