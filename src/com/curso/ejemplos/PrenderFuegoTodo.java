package com.curso.ejemplos;

import com.curso.objetos.Empresa;
import com.curso.objetos.EmpresaFiat;

public class PrenderFuegoTodo {

	public static void main(String[] args) 
	{
		EmpresaFiat e1 = new EmpresaFiat();
		
		crearEmpresa(e1, "Fiat", "Pedernera 222", 1000);
		
		e1.hacerPalio();
		e1.venderPalio();
		e1.venderPalio();
		e1.venderPalio();
		
//		e1.prenderFuegoLaEmpresa();
		
		System.out.println(e1.patrimonio);
		System.out.println(e1.getCantPalios());
	}
	
	private static void crearEmpresa(Empresa emp, String nom, String dire, int patrimonio)
	{
		emp.nombre = nom;
		emp.direccion = dire;
		emp.patrimonio = patrimonio;
		
	}

}
