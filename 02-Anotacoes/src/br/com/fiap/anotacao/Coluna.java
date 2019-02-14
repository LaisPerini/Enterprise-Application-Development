package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)// MANTEM A ANOTACAO AT� A EXECU��O
@Target(ElementType.FIELD) //SOMENTE PARA ATRIBUTOS 
public @interface Coluna {
	
	String nome ();
	
	boolean obrigatorio();
	

}
