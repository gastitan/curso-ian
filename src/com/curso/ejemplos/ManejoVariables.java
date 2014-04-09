package com.curso.ejemplos;

import com.curso.objetos.Empresa;

public class ManejoVariables {

	public static void main(String[] args) {
		Empresa a = new Empresa();
		Empresa b = a;
		Empresa c = b;
		Empresa d = a;
		
		c.nombre = "Sony";
		c.direccion = "9 de Julio 100";
		c.patrimonio = 1000;
		c.fundacionEmpresa = 1997;
		
		System.out.println("Nombre: " + b.nombre);
		System.out.println("Direccion: " + b.direccion);
		System.out.println("Patrimonio: " + b.patrimonio);
		System.out.println("Fundacion: " + b.fundacionEmpresa);
	}

}
