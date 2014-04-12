package com.curso.ejemplos;

public class ManejoArrays 
{
	public static void main(String[] args) 
	{
		funcion3();
	}
	
	public static void funcion1()
	{
		int[] x = new int[10];
		
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 100;
		x[4] = 200;
		x[5] = 300;
		x[6] = 100;
		x[7] = 200;
		x[8] = 300;
		x[9] = 100;
				
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
	}
	
	public static void funcion2()
	{
		String[] x = new String[10];
		
		x[0] = "gaston";
		x[1] = "ian";
		x[2] = "300";
		x[3] = "kuka";
		x[4] = "brenda";
				
		for(int i=0; i<x.length; i++)
		{
//			if(x[i] != null)
				System.out.println(x[i].toUpperCase());
		}
	}
	
	public static void funcion3()
	{
		String a = "gaston,040587,frias ";
		String b = "ian   ,020497,lazzar";
		
		String[] x = a.split("a");
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i].toUpperCase());
		}
	}
}
