package exercicios;

import java.util.Scanner;

public class Ex1 {
	public static void main (String args [])
	{
		int anos,meses,dias,total;
		
		try (Scanner ler = new Scanner (System.in))
		{
		System.out.println("Ol�, escreva sua idade expressa em anos: ");
		anos = ler.nextInt();
		System.out.println("Legal, agora escreva sua idade expressa em meses: ");
		meses = ler.nextInt();
		System.out.println("Quase l�, agora escreva sua idade expressa em dias: ");
		dias = ler.nextInt();
		}
		total = (anos*365)+(meses*30)+dias;
				
		System.out.println("Uau! Voc� j� viveu "+total+" dias!");
	}
	
}
