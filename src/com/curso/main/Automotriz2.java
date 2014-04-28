package com.curso.main;

import com.curso.objetos.Empresa;
import com.curso.objetos.EmpresaFiat;

public class Automotriz2 
{
	public static void main(String[] args) 
	{
		Empresa E1 = new EmpresaFiat("IAN MOTORS",200.50);	
		Empresa E2 = new EmpresaFiat (300.50);
		Empresa E3 = new EmpresaFiat ("GAS MOTORS",-500.90);
		
		System.out.println(E1.nombre);
		System.out.println(E1.patrimonio);
		System.out.println(E2.nombre);
		System.out.println(E2.patrimonio);
		System.out.println(E3.nombre);
		System.out.println(E3.patrimonio);
		
	}
}
