package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.Carro;
import br.com.fiap.bean.Transmissao;

public class Teste {
	
	public static void main (String[]args) {
		
		Carro carro = new Carro();
		
		carro.setCambio(Transmissao.SEMI_AUTOMATICO);
		
		Calendar data = Calendar.getInstance(); // DATA ATUAL
												//ANO,MES,DIA	
		Calendar data2 = new GregorianCalendar(2000,Calendar.JANUARY,19);
		carro.setDataLancamento(data);
		
		//FORMATAR A DATA
		//MM - MES / mm - minutos
		//HH - 12 horas / hh 24 horas 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, hh:mm");
		System.out.println(sdf.format(data.getTime()));
		System.out.println(sdf.format(data2.getTime()));
	}
	

}
