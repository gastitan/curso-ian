package com.curso.objetos;

public class EmpresaPeugeot extends Empresa {
	
	private int cant206= 0;
	
	public void hacer206(){
		
		cant206= cant206 +1;
		patrimonio= -4000;
	
	}
	public void vender206(){
		
		cant206= cant206 -1;
		patrimonio= patrimonio +7000;
	
	}
	public int cant206(){
		
		return cant206;
	}
	

	
	private int cant307= 0;
	
	public void hacer307(){
		
		cant307= cant307 +1;
		patrimonio= patrimonio -2700;
		
	}
	public void vender307(){
		
		cant307= cant307 -1;
		patrimonio= patrimonio +3200;
		
	}
	
	public int cant307(){
		return cant307;
		
	}
	
	public void robarLaEmpresa(){
		cant206= 0;
		cant307= 0;
		patrimonio= 0;
		
	}
	
	
	
	public static void main(String[] asdas) 
	{
		EmpresaPeugeot e1 = new EmpresaPeugeot();
		
		crearEmpresa(e1, "Peugeot", "caseros 3000", 3500);

		e1.robarLaEmpresa();
		
		System.out.println(e1.patrimonio);
		System.out.println(e1.cant206());
		System.out.println(e1.cant307());
		
	}
	
	private static void crearEmpresa(Empresa emp, String nombre, String direccion, int patrimonio)
	{
		emp.nombre = nombre;
		emp.direccion = direccion;
		emp.patrimonio = patrimonio;
		
	}
	
	
	
	}
