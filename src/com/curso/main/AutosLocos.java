package com.curso.main;

import com.curso.objetos.Empresa;
import com.curso.objetos.EmpresaFiat;
import com.curso.objetos.EmpresaFord;


public class AutosLocos 
{
	public static void main(String[] args) 
	{
		EmpresaFiat empFiat1 = new EmpresaFiat();
//		EmpresaFord empFord1 = new EmpresaFord();
		
//		crearEmpresa(empFord1, "Ford", "Pedernera 223", 1000);
		crearEmpresa(empFiat1, "Fiat", "Pedernera 222", 1000);
		
		mostrarFiat(empFiat1);
		System.out.println("#######################");
		
//		empFiat1.hacerPalio();
		mostrarFiat(empFiat1);
		System.out.println("#######################");
		
//		empFiat1.hacerPalio();
		mostrarFiat(empFiat1);
		System.out.println("#######################");
		
//		empFiat1.venderPalio();
		mostrarFiat(empFiat1);
		System.out.println("#######################");
		
//		empFiat1.venderPalio();
		mostrarFiat(empFiat1);
		
	}
	
	private static void crearEmpresa(Empresa emp, String nom, String dire, int patrimonio)
	{
		emp.nombre = nom;
		emp.direccion = dire;
		emp.patrimonio = patrimonio;
		
	}
	
	private static void mostrarFiat(EmpresaFiat e)
	{
//		System.out.println(e.nombre);
//		System.out.println(e.direccion);
		System.out.println("Plata: " + e.patrimonio);
//		System.out.println("Cantidad Palios: " + e.getCantPalios());
	}
	
}
