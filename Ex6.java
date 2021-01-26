package exercicios;

import java.util.Scanner;

public class Ex6 {
	
	public static void main (String args[])
	{
		float x1,y1,x2,y2;
		double d;
		
		try (Scanner ler = new Scanner (System.in))
		{
		System.out.println("Insira as coordenadas do primeiro ponto: ");
		System.out.println("Px: ");
		x1 = ler.nextFloat();
		System.out.println("Py: ");
		y1 = ler.nextFloat();
		System.out.println("Insira as coordenadas do segundo ponto: ");
		System.out.println("Px: ");
		x2 = ler.nextFloat();
		System.out.println("Py: ");
		y2 = ler.nextFloat();
		
		d=Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1),2));
		
		}
		
		System.out.printf("A distância entre os pontos é de: %5.2f",d);
		
	}

}
