package br.com.richard.service;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public interface Mensageiro {
	
	public void enviarMensagem(String texto);

}