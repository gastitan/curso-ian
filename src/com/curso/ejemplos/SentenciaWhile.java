package com.curso.ejemplos;

public class SentenciaWhile 
{
	public static void main(String[] args) 
	{
		int x = 0;
		while(x<10)
		{
			System.out.println(x);
			x++;
		}
		
		String a = "aaaaa";
		while(!a.equals("aaaaa"))
		{
			System.out.println(a);
			a = a + "a";
		}
		

	}
	

}
