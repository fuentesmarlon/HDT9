/*
 * UVG
 * Algoritmos y Estructura de Datos
 * HT 9 - Diccionario v2
 * Autores:
 * 		Davis Alvarez -15842
 * 		Osiris Fuentes - 15240
 * 
 * GIT: https://github.com/fuentesmarlon/HDT9.git
*/	

package paquete;

import java.util.Scanner;

public class Menu {

private Scanner snr;
private MapComparable<String, Association> implementacion;
	
	public Menu(){
		snr = new Scanner(System.in);
	}
	
	public void menuPrinciapal(){
		String resp="";
		boolean valor = true;
		
		System.out.println("Bienvenido al Diccionario UVG! \n");
		do{
			System.out.println("Menu:");
			System.out.println("1. Seleccionar Implementacion");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("e. Salir\n");
			
			System.out.print("-> ");
			resp = snr.nextLine();
			switch(resp){
				case "1":
					System.out.println("Seleccione la implementacion: \n");
					System.out.println("1. Hash");
					System.out.println("2. Red Black Tree");
					System.out.print("$> ");
					resp = snr.nextLine();
					switch(resp){
					case "1":
						System.out.println("Se utilizara Hash...\n");
						implementacion= Factory.getInstancia().getImplementacion("Hash");
						break;
					case "2":
						System.out.println("Se utilizara Red Black Tree...\n");
						implementacion= Factory.getInstancia().getImplementacion("RBT");
						break;				
					default:
						System.out.println("No es una opccion!\n");
						System.out.println("Se utilizara Hash...\n");

						implementacion = Factory.getInstancia().getImplementacion("Hash");
						break;
					}
					
					
					break;
				case "2":
					
					break;
				case "3":
					
					
					break;
				case "e":
					System.out.println("Gracias por su preferencia!");
					valor = false;
					break;
				default:
					System.out.println("No es una opccion!\n");
					break;
			}
			
		}while(valor);
		
	}
	
}
