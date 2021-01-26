package exercicios;

import java.util.Scanner;

public class Ex4 {
	
	public static void main (String args[])
	{
		int a,b,c;
		double d,r,s;
		
		try (Scanner ler = new Scanner (System.in))
		{
		System.out.println("Olá, insira o valor de A: ");
		a = ler.nextInt();
		System.out.println("Olá, insira o valor de B: ");
		b = ler.nextInt();
		System.out.println("Olá, insira o valor de C: ");
		c = ler.nextInt();
		
		r=Math.pow((a+b),2);
		s=Math.pow((b+c),2);
		
		d=(r+s)/2;
		
		}
		
		System.out.println("Os valores são: \nA: "+a+"\nB: "+b+"\nC: "+c+"\nR: "+r+"\nS: "+s+"\nD= "+d);
		
	}

}
