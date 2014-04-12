package com.curso.objetos;

public class EmpresaFord extends Empresa{
	
	private int cantFiesta= 0;
	private int cantFocus = 0;
	private final int VALOR_FIESTA = 3000;
	private final int VALOR_FOCUS = 1350;
	 
	private void hacerFiesta(){
 		 
 		 cantFiesta = cantFiesta + 1;
 		 patrimonio = patrimonio - VALOR_FIESTA;
 		 
 	}
	public void venderFiesta()
	{ 
 		if(cantFiesta > 0)
 		{
 			cantFiesta = cantFiesta -1;
 			patrimonio= patrimonio + 4000;
 		}
    
 	}
	public boolean podesVenderFiesta()
	{
		if (cantFiesta > 0){
			return true;
			
		}
		else {
			return false;
		}
	}
 	 
	public int cantFiesta(){
 		
		return cantFiesta;
	}
 	 
 	 
	private void hacerFocus (){
 		 
 		 cantFocus= cantFocus +1;
 		 patrimonio= patrimonio - VALOR_FOCUS;
 		 
 	}
 	 
	public void venderFocus(){
 		 
 		 cantFocus= cantFocus -1;
 		 patrimonio= patrimonio +2350;
 		System.out.println("Se vendio Focus");
	}
	public int cantFocus(){
	
		return cantFocus; 
    }
	
	
	
	public void hacerAuto(String auto){
		if (auto.equals("Fiesta")){
			hacerFiesta();
			System.out.println("se hizo fiesta");
		}
		else if (auto.equals("Focus")){
			hacerFocus();
			System.out.println("se hizo focus");
		
		} else
			System.out.println("no se hizo el auto: " + auto);
		 
	}

	public void venderAuto(String auto){
		if (auto.equals("Fiesta")){
			venderFiesta();
			System.out.println("se vendio fiesta");
		}
		else if (auto.equals("Focus")){
			venderFocus();
			System.out.println("se vendio focus");
		
		} else
			System.out.println("no se vendio el auto: " + auto);
		 
	}
	public void ventaTotalFocus()
	{
		while(cantFocus>0)
		{ 
			venderFocus();
	
		}
	
	}
	
	/**
	 * Mientras haya plata, que produzca autos
	 * @return
	 */
	public void produccionTotalFocus() 
	{
		while(patrimonio >= VALOR_FOCUS)
		{
			hacerFocus();
		}
		
	}
	
	
}