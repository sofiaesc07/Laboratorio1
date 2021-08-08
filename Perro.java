/******************************************************************
persona.java
Autor: Sofía Escobar
Última modificación: 07-08-2021

Objeto perro.
******************************************************************/
import java.util.Random;
class perro{
	private double estado_animo;
	private double umbral_numerico;
	private Random rand;
	
	// Clase perro
	public perro(){
		rand = new Random();
		estado_animo = rand.nextDouble()*10-5;
		umbral_numerico = rand.nextDouble()*-20;
		// Imprimir mensaje para mostrar al perro que se inicia
		System.out.println("");
		System.out.println("Wuau! Soy el perro");
		System.out.println("Mi estado de animo es de " + estado_animo);
		System.out.println("Mi umbral numerico es de " + umbral_numerico);
	}
	
	// Propiedades del perro
	public void setperro(){
		nuevo_perro();
	} 
	
	// Crear al perro	
	private void nuevo_perro(){
		rand = new Random();
		estado_animo = rand.nextDouble()*10-5;
		umbral_numerico = rand.nextDouble()*-20;
		System.out.println("Wuau! Soy una perro nuevo");
		System.out.println("Mi estado de animo es de " + estado_animo);
		System.out.println("Mi umbral numerico es de " + umbral_numerico);
	}
	
	// Morder persona
	private void morder(persona p){
		System.out.println("Accion del perro: Morder");
		String accion_perro = "morder";
		p.getreaccionar(accion_perro);
	}
	
	// Hacer que el perro ladre
	private void ladrar(persona p){
		System.out.println("Accion del perro: Wuau!(Ladrar)");
		String accion_perro = "ladrar";
		p.getreaccionar(accion_perro);
	}
	
	// Mover cola
	private void mover_cola(persona p){
		System.out.println("Accion del perro: Mover Cola");
		String accion_perro = "mover_cola";
		p.getreaccionar(accion_perro);
	}

	// Psicologia del perro
	private void psican(persona p){
		this.estado_animo = (1.0/p.getconfiabilidad())*(rand.nextFloat()-0.5)*10 + this.estado_animo;
		if (p.getgalleta()){
			p.dargalleta();
			this.estado_animo += (1.0/p.getconfiabilidad())*(rand.nextInt(2));
			System.out.println("El nuevo estado de animo del perro es " + estado_animo);
		}
		if (estado_animo < umbral_numerico){
			morder(p);
		}else if (estado_animo<0 && estado_animo>umbral_numerico){
			ladrar(p);
		}else if (estado_animo >=0){
			mover_cola(p);
		}
	}
	
	// Relacionarse perro y persona
	public void interaccion(persona p){
		psican(p);
	}
}