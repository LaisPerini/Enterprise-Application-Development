package br.com.fiap.dao;

import java.io.Serializable;
import java.util.List;

import br.com.fiap.bean.Carro;

//Uma classe pode herdar de uma classe
//Uma classe pode implementar uma ou mais interfaces

public class CarroDAOMySql implements CarroDAO, Serializable {

	@Override
	public List<Carro> buscarCarros() {
		return null;
	}

	@Override
	public void criar(Carro carro) {
		
	}
	
	
	

}
