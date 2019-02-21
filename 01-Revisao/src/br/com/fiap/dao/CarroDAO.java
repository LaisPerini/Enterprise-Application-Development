package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Carro;

//Uma interface pode herdar de uma ou mais interfaces
public interface CarroDAO {
	
	//somente as assinaturas dos métodos
	//<> Generics
	List<Carro> buscarCarros();
	void criar(Carro carro);

}
