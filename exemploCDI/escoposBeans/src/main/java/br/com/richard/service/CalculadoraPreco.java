package br.com.richard.service;

import java.io.Serializable;

import javax.annotation.PostConstruct;

public class CalculadoraPreco implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		System.out.println("Init calculadora preco Bean");
	}
	
	public double calculaPreco(int quantidade, double precoUnitario) {
		return quantidade * precoUnitario;
	}

}