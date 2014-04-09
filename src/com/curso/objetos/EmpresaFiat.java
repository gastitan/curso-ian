package com.curso.objetos;


public class EmpresaFiat extends Empresa 
{
	private int cantPalios = 0;
	
	public void hacerPalio()
	{
		cantPalios = cantPalios + 1;
		patrimonio = patrimonio - 1000;
	}
	
	public void venderPalio(){
		cantPalios= cantPalios - 1;
		patrimonio= patrimonio + 1500;
		
	}
	public int getCantPalios()
	{
		return cantPalios;
	}
	public void prenderFuegoLaEmpresa()
	{
		cantPalios = 0;
	}
	 private int cantDuna = 0;
	 
	 public void cantDuna() { 
		 cantDuna = cantDuna + 1;
		 patrimonio = patrimonio - 1600;
		  }
	 
	 public void venderDuna(){
		 cantDuna= cantDuna - 1;
		 patrimonio = patrimonio + 2500 ;
		 }
	 public int getCantDuna(){
		return cantDuna;
		 }

	
}