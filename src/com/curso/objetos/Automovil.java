package com.curso.objetos;

public class Automovil {

	public String nombre;
	public double costo;
	public String modelo;
	
	public Automovil(String nom, double cos)
	{
		nombre = nom;
		costo = cos;
	}

	
	/**
	 * Método que devuelve el precio de venta del automovil
	 * El mismo se calcula con "costo" + 20%
	 * @return
	 */
	public double damePrecioVenta()
	{
		return (120*costo / 100);
		
		
	}
	
}
