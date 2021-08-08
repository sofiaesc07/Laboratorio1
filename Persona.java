/******************************************************************
persona.java
Autor: Sofía Escobar
Última modificación: 07-08-2021

Objeto persona.
******************************************************************/
import java.util.Random;
class persona{
	private double confiabilidad;
	private boolean galleta;
	private Random rand;
	
	// Clase Persona
	public persona(){
		rand = new Random();
		confiabilidad = rand.nextDouble()*10;
		galleta = false;
		//Imprimir mensaje para mostrar la persona con la que se inicia
		System.out.println("");
		System.out.println("Hola! Soy la persona inicial");
		System.out.println("Mi confiabilidad ahorita es de " + confiabilidad);
	}
	
	// Propiedades de la persona 
	public void setpersona(){
		nueva_persona();

	} 
	
	// Crear a la persona
	private void nueva_persona(){
		rand = new Random();
		confiabilidad = rand.nextDouble()*10;
		galleta = false;
		System.out.println("Hola! Soy una persona nueva.");
		System.out.println("Mi confiabilidad ahorita es de " + confiabilidad);
	}
	
	// Confiabilidad de la persona
	public double getconfiabilidad(){
		return confiabilidad;
	}		
	
	// Crear galleta
	public void sacar_galleta(){
		if(galleta == false){
			galleta = true;
			System.out.println("Mostrando una galleta");
		}else if (galleta == true){
			System.out.println("La persona ya tiene una galleta no puede obtener mas.");
		}
	}
	
	// Obtener la galleta
	public boolean getgalleta(){
		return galleta;
	}
	
	// Darle galleta al perro
	public boolean dargalleta(){
		System.out.println("Dandole la galleta al perro");
		galleta = false;
		return galleta;
	}
	
	// Reaccioness del perro ante la persona y reacciones 
	// de la persona por el comportamiento del perro. 
	private void reaccionar(String accion_perro){
		if (accion_perro == "morder"){
			System.out.println("Accion persona: Pedir ayuda");
		}else if (accion_perro == "ladrar"){
			System.out.println("Accion persona: Retroseder");
		}else if (accion_perro == "mover_cola"){
			System.out.println("Accion persona: Acariciar al perro");
		}
	}
	
	// Reaccionar a las acciones del perro
	public void getreaccionar(String accion_perro){
		reaccionar(accion_perro);
	}
}