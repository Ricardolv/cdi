package br.com.richard.service;

public class MensageiroCorreo implements Mensageiro {

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por correio: " + texto);
	}

}
