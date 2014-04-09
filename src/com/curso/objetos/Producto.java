package com.curso.objetos;

public class Producto
{
	public int precio;
	public double costoFabricacion;
	
	public double getCostoFabricacion()
	{
		return costoFabricacion;
	}
	public void setCostoFabricacion(double costo)
	{
		costoFabricacion = costo;
	}
	public double getPrecio()
	{
		return costoFabricacion * 1.5;
	}
}