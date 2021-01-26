package exercicios;

import java.util.Scanner;

public class Ex3 {
	
	public static void main (String args[])
	{
		int horas,minutos,segundos,restoSegundos;
		
		try (Scanner ler = new Scanner (System.in))
		{
		System.out.println("Olá, escreva a duração do evento expressa em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		restoSegundos = segundos-(horas*3600)-(minutos*60);
		
		}
		
		System.out.println("Legal, o evento irá durar precisamente "+horas+" hora(s), "+minutos+" minuto(s) e "+restoSegundos+" segundo(s)!");
		
	}

}
