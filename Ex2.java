package exercicios;

import java.util.Scanner;

public class Ex2 {
	public static void main (String args[])
	{
		int dias,anos,meses,restoDias;

		try (Scanner ler = new Scanner (System.in))
		{
		System.out.println("Olá, escreva sua idade expressa em dias: ");
		dias = ler.nextInt();
		
		anos = dias/365;
		meses = (dias%365)/30;
		restoDias = dias-(anos*365)-(meses*30);
		}
		
		System.out.println("Legal, você tem "+anos+" anos, "+meses+" meses e "+restoDias+" dias.");
	}
}
