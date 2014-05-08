package com.curso.ejemplos;

import java.lang.reflect.GenericSignatureFormatError;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

import org.ietf.jgss.GSSException;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Excepciones 
{
	public static void main(String[] args) 
	{
		//excepcionNull1("");
		//excepcionNull2(null,"PEPE");
		excepcion3();
	}
	
	public static void excepcionNull1(String nombre)
	{ 
		try{
			String x = nombre.replace("0","1");  
			System.out.println(x);
			
		}catch(NullPointerException e)
		{
			System.out.println("HUBO UN ERROR!!!!!!!");
		}
		
	}
	public static void excepcionNull2(List<String> lista, String nombre)
	{ 
		try{
			lista.add(nombre);
			
		}catch(NullPointerException e)
		{
			String error =  e.getMessage();
			System.out.println("Hubo un error: " + error);
		}
		
	}	
	
	public static void excepcion3()
	{ 
		try{
//			List<String> lista = new ArrayList<String>();
//			lista.add("gaston");
//			lista.add("ian");
//			lista.add("brenda");
//			
//			for (int x=0; x<5; x++) {
//				System.out.println(lista.get(x));
//			}
			
			String[] x = new String[3];
			String[] noms = new String[]{"A","B","C"};
			System.out.println(noms[0]);
			System.out.println(noms[1]);
			System.out.println(noms[2]);
			System.out.println(noms[3]);
			
		}catch(NullPointerException npe)
		{
			System.out.println("En NULO");
		}catch(Exception e)
		{
			String error =  e.getMessage();
			System.out.println("Hubo un error: " + error);
			e.printStackTrace();
		}
	}
}