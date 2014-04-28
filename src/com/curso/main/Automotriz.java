package com.curso.main;

import com.curso.objetos.Automovil;
import com.curso.objetos.EmpresaFiat;
import com.curso.objetos.EmpresaFord;

public class Automotriz 
{
	public static void main(String[] args) 
	{
//		EmpresaFord empFord = new EmpresaFord();
//
//		Automovil auto1 = new Automovil("focus", 100);
//		double costoVenta = auto1.damePrecioVenta();
//		
//		System.out.println("Costo Venta: " + costoVenta);

//		Ian puto
		
		EmpresaFiat ef = new EmpresaFiat();
		EmpresaFiat e2 = new EmpresaFiat();
		
		Automovil a1 = new Automovil("focus", 500);
		Automovil a2 = new Automovil("vento", 1000);
		Automovil a3 = new Automovil("fitito", 100);
		Automovil a6 = new Automovil("fitito", 100);
		Automovil a7 = new Automovil("vento", 1000);
		Automovil a8 = new Automovil("vento", 1000);
		
		Automovil a4 = new Automovil("fiesta", 150);
		Automovil a5 = new Automovil("duna", 100000000);
		
		ef.agregarAuto(a1);
		ef.agregarAuto(a2);
		ef.agregarAuto(a3);
		ef.agregarAuto(a6);
		e2.agregarAuto(a4);
		e2.agregarAuto(a5);
		
		int cant_e2 = e2.dameCantidadAutos();
		int cant_ef = ef.dameCantidadAutos();
		System.out.println(cant_e2);
		System.out.println(cant_ef);
		
		int cantFititos = ef.cantidadPorNombre("fitito");
		System.out.println(cantFititos); //--> TIENE QUE DEVOLVER 2
		
		int cantVentos= ef.cantidadPorNombre("VEntO");
		System.out.println(cantVentos); //--> TIENE QUE DEVOLVER 3
	}
}
