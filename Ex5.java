package exercicios;

import java.util.Scanner;

public class Ex5 {
	
	public static void main (String args[])
	{
		float nota1,nota2,nota3;
		double media;
		
		try (Scanner ler = new Scanner (System.in))
		{
		System.out.println("Olá, insira o valor da primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Insira o valor da segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Insira o valor da terceira nota: ");
		nota3 = ler.nextFloat();
		
		media=(nota1*0.2)+(nota2*0.3)+(nota3*0.5);
		
		}
		
		System.out.println("A média final é: "+media);		
	}
}
