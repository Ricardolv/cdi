package br.com.richard.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.richard.service.CalculadoraPreco;

@Named("meuBean")
//@Dependent  //-> default ou seja não há escopo o tempo de vida é curto, ele depende de quem o injeta.
//@RequestScoped
//@SessionScoped //-> necessario que o bean seja serializado e tbm o objeto injetado precisa ser serializado.
//@ConversationScoped
//@ApplicationScoped
@SessionScoped
public class PrecoProdutoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private CalculadoraPreco calculadoraPreco;
	
	@PostConstruct
	public void init() {
		System.out.println("Init preço produto Bean");
	}
	
	public double getPreco() {
		System.out.println(calculadoraPreco.getClass());
		return calculadoraPreco.calculaPreco(13, 33.45);
	}
}