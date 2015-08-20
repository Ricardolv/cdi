package br.com.richard.service;

import java.util.Date;

import br.com.richard.modal.Escolaridade;
import br.com.richard.modal.Funcionario;

public class CalculadoraDeSalarios {

	public double calculaSalario(Funcionario funcionario){
		
		double salario = funcionario.getCargo().getSalarioBase();
		Escolaridade escolaridadeFuncionario = funcionario.getEscolaridade();
		Escolaridade escolaridadeCargo = funcionario.getCargo().getEscolaridadeDesejada();
		
		// se o funcionário tem escolaridade inferior
		// à esperada para o cargo
		if(escolaridadeFuncionario.compareTo(escolaridadeCargo) < 0){
			salario = salario * 0.8;
		}
		
		// se o funcionário tem escolaridade superior
		// à esperada para o cargo
		else if(escolaridadeFuncionario.compareTo(escolaridadeCargo) > 0) {
			salario = salario * 1.2;
		}
		
		int anoAtual = getAnoAtual();
		int anoAdmissao = funcionario.getAnoAdmissao();
		
		//dá 1% de aumento para cada ano trabalhado na empresa
		double anosTrabalhados = anoAtual - anoAdmissao;
		double aumentoAntiguidade = anosTrabalhados / 100;
		salario = salario * (1 + aumentoAntiguidade);
		
		//se tem mais de 5 anos na empresa tem aumento de 10%
		if(anosTrabalhados > 5){
			salario = salario * 1.1;
		}
		
		return salario;
	}

	@SuppressWarnings("deprecation")
	private int getAnoAtual() {
		return  new Date().getYear() ;
	}

}
