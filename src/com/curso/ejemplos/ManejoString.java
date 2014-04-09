package com.curso.ejemplos;

public class ManejoString {
	public static void main(String[] args) 
	{
		funcion8();
	}
	
	public static void funcion1()
	{
		String a = "gaston";
		String b = "ian";

		a = a.concat(" es un capo");
		b = b.concat(" es un puto");

		System.out.println(a);
		System.out.println(b);
	}
	
	public static void funcion2()
	{
		String c = "brenda tortillera";

		boolean esta = c.contains("torti");
		boolean esta2 = c.contains("tortis");
		
		System.out.println(esta);
		System.out.println(esta2);
	}	
	
	public static void funcion3()
	{
		String b = "ian";

		boolean ok = b.equals("IAN");
		boolean ok2 = b.equalsIgnoreCase("IAN");
		System.out.println(ok);
		System.out.println(ok2);
		
		b = b.toUpperCase();
		boolean ok3 = b.equals("IAN");
		System.out.println(ok3);
	}
	
	public static void funcion4()
	{
		String b = "ian";
		String x = "hLasFd erssDFR sdefsEEF";

		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
	}
	
	public static void funcion5()
	{
		String b = "hola ";

		System.out.println(b.equals("hola"));
		System.out.println(b.toLowerCase().equals("hola"));
		System.out.println(b.toUpperCase().equals("HOLA"));
		
		System.out.println(b.trim().equals("hola"));
		
		String x = "								hola mundo                   ";
		System.out.println(x.trim());
	}
	
	public static void funcion6()
	{
		String b = "hola_mundo";

		String x = b.replace("_", " ");
		System.out.println(b);
		System.out.println(x);
		
		String y = "                            hola mundo                            ";
		System.out.println(y.replace(" ", ""));
		
		String w = "                            hola_mundo                            ";
		w = w.replace(" ", "");
		System.out.println(w.replace("_", " "));
		
	}
	
	public static void funcion7()
	{
		String a = "gaston,040587,frias ";
		String b = "ian   ,020497,lazzar";
		String c = "brenda,030303,lazaro";

//		System.out.println(a.length());
//		System.out.println(b.length());
//		System.out.println(c.length());
		
		//a = a.substring(7,13);
		System.out.println(a.substring(7,13));
		System.out.println(b.substring(7,13));
		System.out.println(c.substring(7,13));
		
	}
	
	public static void funcion8()
	{
		imprimirPrimerCaracter("");
		imprimirPrimerCaracter("vava");
	}
	
	public static void imprimirPrimerCaracter(String texto)
	{
		if(texto.isEmpty())
			System.out.println("no hay texto");
		else
			System.out.println(texto.substring(0, 1));
	}
}
