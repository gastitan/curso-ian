package com.curso.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosAdmin 
{
	public static void leerArchivo()
	{
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("/home/gastitan/Documentos/ian/archivo.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void escribirArchivo()
	{
		try {
			String contenido = "Ian tiene 500 pesos (mentira)";
 
			File archivo = new File("/home/gastitan/Documentos/ian/archivo.txt");
 
			// if file doesnt exists, then create it
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
 
			FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();
 
			System.out.println("Hecho!");
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
