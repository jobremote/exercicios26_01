package exercicios;

import java.util.Scanner;

public class Ex7 {
	
	public static void main (String args[])
	{
	double a,b,c,d,e,f,x,y;
	
	try (Scanner ler = new Scanner (System.in))
	{
	System.out.println("Insira o valor de a: ");
	a = ler.nextDouble();
	System.out.println("Insira o valor de b: ");
	b = ler.nextDouble();
	System.out.println("Insira o valor de c: ");
	c = ler.nextDouble();
	System.out.println("Insira o valor de d: ");
	d = ler.nextDouble();
	System.out.println("Insira o valor de e: ");
	e = ler.nextDouble();
	System.out.println("Insira o valor de f: ");
	f = ler.nextDouble();
	
	x = ((c*e-b*f)/(a*e-b*d));
	y = ((a*f-c*d)/(a*e-b*d));
	
	}
	
	System.out.println("O valor de x = "+x+" e o valor de y = "+y);
	
	}

}
