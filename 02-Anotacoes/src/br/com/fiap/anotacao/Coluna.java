package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//mantem a notação até a execução
@Target(ElementType.FIELD) //somente para os atributos
public @interface Coluna {

	String nome();
	boolean obrigatorio();
	
}
