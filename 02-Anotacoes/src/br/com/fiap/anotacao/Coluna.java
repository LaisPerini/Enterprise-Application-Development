package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)// MANTEM A ANOTACAO ATÉ A EXECUÇÃO
@Target(ElementType.FIELD) //SOMENTE PARA ATRIBUTOS 
public @interface Coluna {
	
	String nome ();
	
	boolean obrigatorio();
	

}
