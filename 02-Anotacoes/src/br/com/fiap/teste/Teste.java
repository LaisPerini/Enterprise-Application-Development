package br.com.fiap.teste;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;
import br.com.fiap.beans.Cliente;

public class Teste {
	
	public static void main (String[]args) {
		//Instanciar um Cliente
		
		Cliente cliente = new Cliente();
		
		//API DEReflection para recuperar os métodos
		
		Method[] metodos = cliente.getClass().getDeclaredMethods();
		for (int i = 0; i<metodos.length;i++) {
			System.out.println(metodos[i].getName());
		}
		
		//Recuperar os atributos 
		Field[] atributos = cliente.getClass().getDeclaredFields();
		for(Field item : atributos) {
			System.out.println(item.getName());
			
			//RECUPERAR A ANOTAÇÃO @Coluna
			Coluna anotacao = item.getAnnotation(Coluna.class);
			System.out.println("Coluna: " + anotacao.nome());
			System.out.println("Obrigatorio: " + anotacao.obrigatorio());
		}
		
		//Exibir o nome da Classe 
		System.out.println(cliente.getClass().getName());
		
		//RECUPERAR A ANOTACAO DA CLASSE @TABELA
		Tabela anotacao = cliente.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM " + anotacao.nome());
				
		
		
		
	}

}
