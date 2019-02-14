package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Carro;

//Uma interface pode herdar de uma ou mais interfaces
public interface CarroDao {
	
	//somente as assinaturas dos métodos 
	List<Carro> buscarCarros();
	void criar (Carro carro);

}
