/******************************************************************
SimuladorPerrera.java
Autor: Sofía Escobar
Última modificación: 07-08-2021

Driver program que implementa el menú de opciones para el simulador
que entrenará voluntari@s.
******************************************************************/
import java.util.Scanner;

class SimuladorPerrera{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//Imprimir mensaje de bienvenida para los que vayan a utilizar el simulador
		System.out.println("");
		System.out.println("Bienvenido al Simulador de perrera");
		System.out.println("Los personajes que se te han asignado son:");
		System.out.println("");

		// Objetos
		perro dog = new perro();
		persona p = new persona();
		
		
		// Mostrar menu 
		int opcion = 0;
		String continuar = "5";
		
		while (continuar == "5"){
		
			System.out.println("\n\nBienvenido al simulador de entrenamiento de voluntari@s. ¿Que hara?");
			System.out.println("1. Nueva persona");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Sacar galleta");
			System.out.println("4. Interactuar");
			System.out.println("5. Salir\n\n");
			
			opcion = scan.nextInt();
			//Agregar a la persona, el perro, la interacción y la galleta
			if (opcion == 1){
				p.setpersona();
			} else if (opcion == 2){
				dog.setperro();
			} else if (opcion == 3){
				p.sacar_galleta();
			} else if (opcion == 4){
				dog.interaccion(p);
			} else if (opcion == 5){
				System.out.println("Hasta la proxima!");
				System.out.println("");
				continuar = "n";
			} else {
				System.out.println("Solo puede escoger las opciones que aparecen en el menu. Seleccione una opcion colocando un numero del 1 al 5.");
			}
		}
	}
}