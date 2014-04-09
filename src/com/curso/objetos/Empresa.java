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
	
}
