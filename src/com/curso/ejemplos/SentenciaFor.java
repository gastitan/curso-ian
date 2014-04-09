package com.curso.ejemplos;

public class SentenciaFor {

	public static void main(String[] args) 
	{
		funcion3();
		
	}
	
	public static void funcion1()
	{
		int x=15;
		
		for(x=0; x < 10; x++)
		{
			System.out.println(x);
		}
		
		System.out.println(x);
	}
	
	public static void funcion2()
	{
		for(int x=0; x < 20; x++)
		{
			System.out.println(x);
			if(x==13)
			{
				System.out.println("es yeta");
				break;
			}
		}
	}
	
	public static void funcion3()
	{
		for(int y=0; y<5; y++)
		{
			for(int x=0; x < 10; x++)
			{
				if(x == 5)
				{
					break;
				}
				System.out.println(y + " - " + x);
			}
		}
	}
}
