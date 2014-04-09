package com.curso.main;

import com.curso.objetos.Empresa;

public class PoloIndustrial {
	
	public static void main(String[] asdasda){
		Empresa empresa1=crearEmpresa("Empresa1", "parodi 4867", 1000, "Comida", 1970);
		Empresa empresa2=crearEmpresa("Empresa2", "san martin 1111", 10000, "Prendas", 1965);
		Empresa empresa3=crearEmpresa("Empresa3", "mitre 1665", 300, "Comida", 2000);
		
		//descripcionEmpresa(empresa1.nombre, empresa1.direccion, empresa1.cantidadEmpleados, empresa1.rubro, empresa1.fundacionEmpresa);
		//descripcionEmpresa(empresa2.nombre, empresa2.direccion, empresa2.cantidadEmpleados, empresa2.rubro, empresa2.fundacionEmpresa);
		//descripcionEmpresa(empresa3.nombre, empresa3.direccion, empresa3.cantidadEmpleados, empresa3.rubro, empresa3.fundacionEmpresa);
//		descripcionEmpresa2(empresa1);
//		descripcionEmpresa2(empresa2);
//		descripcionEmpresa2(empresa3);
		
		System.out.println(empresa1.rubro == empresa2.rubro);
		System.out.println(empresa1.rubro == empresa3.rubro);
	}
	private static void descripcionEmpresa2(Empresa e){
		System.out.println(e.nombre);
		System.out.println(e.direccion);
		System.out.println(e.cantidadEmpleados);
		System.out.println(e.rubro);
		System.out.println(e.fundacionEmpresa);
		System.out.println("..................");	
	}
	
	private static Empresa crearEmpresa(String nombre,String direccion,int cantidadEmpleados,String rubro,int fundacionEmpresa){
		Empresa e=new Empresa();
		e.nombre= nombre;
		e.direccion= direccion;
		e.cantidadEmpleados= cantidadEmpleados;
		e.rubro= rubro;
		e.fundacionEmpresa= fundacionEmpresa;
	
			
		return e;
	}
	private static void descripcionEmpresa (String nombre,String direccion,int cantidadEmpleados,String rubro,int fundacionEmpresa){
		System.out.println(nombre);
		System.out.println(direccion);
		System.out.println(cantidadEmpleados);
		System.out.println(rubro);
		System.out.println(fundacionEmpresa);
		System.out.println("..................");
	}
}
