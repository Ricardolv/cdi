package br.com.richard.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.richard.service.CalculadoraPreco;

/**
 * Podemos injetar em três pontos :
 */
@Named("meuBean")
@RequestScoped
public class PrecoProdutoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	/**
	 * Injetando pelo atributo
	 */
	private CalculadoraPreco calculadoraPreco;
	
	/**
	 * Injetando pelo construtor
	 * @param calculadoraPreco
	 */
	@Inject
	public PrecoProdutoBean(CalculadoraPreco calculadoraPreco) {
		this.calculadoraPreco = calculadoraPreco;
	}

	public double getPreco() {
		return calculadoraPreco.calculaPreco(13, 33.45);
	}
	
	/**
	 * Injetando pelo metodo set do atributo
	 */
	//@Inject
	//public void setCalculadoraPreco(CalculadoraPreco calculadoraPreco) {
	//	System.out.println("setCalculadora:" + calculadoraPreco);
	//	this.calculadoraPreco = calculadoraPreco;
	//}
	
}