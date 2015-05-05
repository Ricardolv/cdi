package br.com.richard.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.richard.annotation.Urgente;
import br.com.richard.service.Mensageiro;

/**
 * Uso de qualificadores
 */
@Named
@RequestScoped
public class EnvioMensagemBean {
	
	/**
	 * Neste caso o annotation @Default - sendo usado ou nenhuma declaração no o metodo enviarMensagem da classe do MensageiroCorreo será disparado 
     * pois como default não definimos nenhum annotation.
	 */
	//@Default 
	
	/**
	 * Mas se declararmos o annotation @Urgente o metodo enviarMensagem da classe do MensageiroSMS será disparado 
	 * pois foi qualificado segundo o annotation declarado.
	 */
	@Urgente
	@Inject
	private Mensageiro mensageiro;
	
	private String texto;
	
	public void enviarMensagem() {
		mensageiro.enviarMensagem(texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
}