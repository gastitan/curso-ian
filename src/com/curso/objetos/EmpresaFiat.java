package com.curso.objetos;
import java.util.ArrayList;
import java.util.List;


public class EmpresaFiat extends Empresa 
{
	List<Automovil> autos=new ArrayList<Automovil>();

	
public int dameCantidadAutos(){
	
	return autos.size();
}
	public void agregarAuto(Automovil auto){
		
		autos.add(auto);
		
		
	}
}
