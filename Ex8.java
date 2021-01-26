package exercicios;

import java.util.Scanner;

public class Ex8 {
	
	public static void main (String args[])
	{
		double custoConsumidor,custoFabrica;
		
		try (Scanner ler = new Scanner (System.in))
		{
		System.out.println("Insira custo de fabrica: ");
		custoFabrica = ler.nextDouble();
		
		custoConsumidor = (custoFabrica*1.28)*1.45;
		}
		
		System.out.printf("O valor total do carro é de R$ %6.2f",custoConsumidor);
	}

}
