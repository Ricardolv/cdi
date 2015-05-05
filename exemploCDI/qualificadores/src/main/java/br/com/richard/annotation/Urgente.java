package br.com.richard.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

//anotocao do proprio CDI
@Qualifier 
//uso em tempo real da aplicação
@Retention(RetentionPolicy.RUNTIME) 
//definindo onde usar esta anotação pode ser usada, no caso, pode ser usada em uma classe, metodo, atributos e parametros.
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER }) 
public @interface Urgente {

}