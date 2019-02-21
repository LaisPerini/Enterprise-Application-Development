package br.com.fiap.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.com.fiap.bean.Carro;
import br.com.fiap.bean.Transmissao;

public class Teste {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.setCambio(Transmissao.SEMI_AUTOMATICO);
		Calendar data = Calendar.getInstance(); //DATA ATUAL
		Calendar data2 = new GregorianCalendar(2000,Calendar.JANUARY,19);
											   //ANO, MES, DIA
		
		c.setDataLancamento(data);
		
		//Formatar a data
		//MM -> Mês  mm -> Minutos
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, hh:mm:ss");
		System.out.println(sdf.format(data.getTime()));
		//utilizar o get Time para trazer a data que esta dentro do Calendar
		System.out.println(sdf.format(data2.getTime()));
		
		new Date("");
	}

}
