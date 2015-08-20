package br.com.richard.teste;

import br.com.richard.modal.Funcionario;
import br.com.richard.service.CalculadoraDeSalarios;

public class CalculadoraDeSalariosMock extends CalculadoraDeSalarios {

	private double salarioFixo;

	public CalculadoraDeSalariosMock(double salarioFixo){
		this.salarioFixo = salarioFixo;
	}
	public double calculaSalario(Funcionario funcionario){
		return salarioFixo;
	}
}