package br.com.richard.service;

import br.com.richard.annotation.Urgente;

@Urgente
public class MensageiroSMS implements Mensageiro {

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem SMS: " + texto);
	}

}
