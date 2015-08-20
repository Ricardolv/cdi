package br.com.richard.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.richard.modal.Funcionario;
import br.com.richard.service.CalculadoraDeImpostos;
import br.com.richard.service.CalculadoraDeSalarios;

public class Testes {

	@Test
	public void testaCalculoIRNaSegundaFaixaDeContribuicao(){

		Funcionario funcionario = new Funcionario();
		CalculadoraDeSalarios calculadoraSalarios = new CalculadoraDeSalariosMock(3000.0);
		CalculadoraDeImpostos calculadoraImpostos = new CalculadoraDeImpostos(calculadoraSalarios);
		
		//a calculadora de IR usa outra classe para calcular o salário
		double imposto = calculadoraImpostos.calculaImpostoDeRenda(funcionario);
		
		Assert.assertEquals(129.4, imposto, 0.0001);
	}

}
