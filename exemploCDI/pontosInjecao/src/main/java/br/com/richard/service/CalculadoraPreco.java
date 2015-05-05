package br.com.richard.service;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class CalculadoraPreco implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public double calculaPreco(int quantidade, double precoUnitario) {
		return quantidade * precoUnitario;
	}

}