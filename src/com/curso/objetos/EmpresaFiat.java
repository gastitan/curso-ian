package com.curso.objetos;
import java.util.ArrayList;
import java.util.List;


public class EmpresaFiat extends Empresa 
{
	List<Automovil> autos=new ArrayList<Automovil>();

	public EmpresaFiat()
	{
	}
	public EmpresaFiat(double patr)
	{
		super("SIN NOMBRE", patr);
	}
	public EmpresaFiat(String nom, double patr)
	{
		super(nom, patr);
	}
	
	public int dameCantidadAutos(){
		
		return autos.size();
	}
	public void agregarAuto(Automovil auto){
		
		autos.add(auto);
	}
}
