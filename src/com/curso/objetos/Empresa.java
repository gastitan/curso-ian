package com.curso.objetos;


public class Empresa {
	public String nombre;
	public String direccion;
	public int cantidadEmpleados;
	public String rubro;
	public int fundacionEmpresa;
	public int sueldoEmpleados = 200;
	public double patrimonio = 0;
	
	public void reducirPatrimonio(double costo)
	{
		patrimonio = patrimonio - costo;
	}
	public Empresa (double patrimonio){
		this.patrimonio = patrimonio;
	}
	public Empresa (String nombre, double patrimonio){
		this.patrimonio = patrimonio;
		this.nombre = nombre;
	}
	public Empresa()
	{}
	
	public void ianPuto()
	{
	}
}
