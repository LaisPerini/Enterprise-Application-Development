package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Cliente;

public class Teste {
	public static void main(String[] args) {
		// Instanciar um cliente
		Cliente c = new Cliente();

		// API de Reflection para recuperar os métodos
		Method[] metodos = c.getClass().getDeclaredMethods();
		for (int i = 0; i < metodos.length; i++) {
			System.out.println(metodos[i].getName());
		}

		// Recuperar os atributos
		Field[] atributos = c.getClass().getDeclaredFields();
		for (Field item : atributos) {
			System.out.println(item.getName());
			// Recuperar a anotação @Coluna
			Coluna anotacao = item.getAnnotation(Coluna.class);
			System.out.println("Coluna: " + anotacao.nome());
			System.out.println("Obrigatório: " + anotacao.obrigatorio());
		}

		// Exibir o nome da classe
		System.out.println(c.getClass().getName());

	}

}
