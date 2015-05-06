package br.com.richard.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.enterprise.inject.Produces;

import br.com.richard.annotation.Brasil;

public class FormatadorData {

	@Produces @Brasil
	public DateFormat getFormatadorDataBrasil() {
		return new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt","BR"));
	}
	
	@Produces
	public DateFormat getFormatadorDataEUA() {
		return new SimpleDateFormat("MMMM 'de' dd 'de' yyyy", Locale.US);
	}
}
