package br.com.fiap.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class AtualizaTeste {
	public static void main(String[] args) {
		
	
	
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager manager = fabrica.createEntityManager();
	
	//Atualizar um cliente
	//Instanciar um cliente com um Id que existe no Banco
	Cliente cliente = new Cliente(1, "Bolsonaro", new GregorianCalendar(1970, Calendar.AUGUST, 2), "456.564.645-78", Genero.MASCULINO, null, false);
	manager.merge(cliente);
	
	manager.getTransaction().begin();
	manager.getTransaction().commit();
	
	
	manager.close();
	fabrica.close();
	}
}
