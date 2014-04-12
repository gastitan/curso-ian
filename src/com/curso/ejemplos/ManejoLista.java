package com.curso.ejemplos;

import java.util.ArrayList;
import java.util.List;

import com.curso.objetos.Automovil;

public class ManejoLista 
{
	public static void main(String[] args) 
	{
		funcion4();
	}
	
	public static void funcion1()
	{
		List<String> lista = new ArrayList<String>();
		
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		lista.add("f");
		
		System.out.println("Todo joya");
		
		for (int i = 0; i < lista.size(); i++) 
		{
			String st = lista.get(i);
			System.out.println(st);
		}
	}

	public void funcion2()
	{
		List<Automovil> autos = new ArrayList<Automovil>();
		
		Automovil a = new Automovil("focus", 150.30);
		autos.add(a);
	}

	public static void funcion3()
	{
		List<Automovil> autos = new ArrayList<Automovil>();
		
		Automovil a = new Automovil("focus", 150);
		Automovil b = new Automovil("fiesta", 180);
		Automovil c = new Automovil("Ka", 150);
		Automovil d = new Automovil("Vectra", 180);
		Automovil e = new Automovil("Mondeo", 150);
		Automovil f = new Automovil("Fun", 180);
		
		autos.add(a);
		autos.add(b);
		autos.add(c);
		autos.add(d);
		autos.add(e);
		autos.add(f);
		
		System.out.println(autos.size());
		System.out.println(autos.get(0));
		
		for(int i=0; i< autos.size(); i++)
		{
			System.out.println(autos.get(i));
		}
		
		
	}

	public static void funcion4()
	{
		List<Automovil> autos = new ArrayList<Automovil>();
		
		Automovil a = new Automovil("focus", 150);
		Automovil b = new Automovil("fiesta", 180);
		Automovil c = new Automovil("Ka", 150);
		Automovil d = new Automovil("Vectra", 180);
		Automovil e = new Automovil("Mondeo", 150);
		Automovil f = new Automovil("Fun", 180);
		
		autos.add(a);
		autos.add(b);
		autos.add(c);
		autos.add(d);
		autos.add(e);
		autos.add(f);
		
		for(int i=0; i< autos.size(); i++)
		{
			Automovil auto = autos.get(i);
			System.out.println(auto.nombre);
		}
	}
}
