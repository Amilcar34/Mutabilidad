package com.utn.controlador;

public final class Mutabilidad {

	public static void main(String[] args) {
		
		//creo una constante o variable inmutable (uso de "final")
			// al tener la palabra declarada como final no se puede modificar su valor
		
		final String ME = "chachacha";
		
		System.out.println(ME);
		
		//si descomentas la linea de abajo tq va a tirar error ya que ME esta declarada como final y por lo tatno no sepuede modificar su valor
		
		//ME = "cuchara";
		
		
		//creo un objeto que es inmutable
		final Persona p = new Persona();
		
		//para ver el errror de compilacion descomenta la siguente linea de codigo, 
		//como es inmutable no puede reasignarse (no se puede hacer otro new)
		
		//p = new Persona();

		p.nombre = "pepe";
		System.out.println(p.nombre);
		
		Persona p1 = new Persona();
		// a p1 lo podemos reasignas ya que es mutable
		p1 = new Persona();
		
		p1.nombre = "Carlos";
		
		System.out.println(p1.nombre);
		
		
		System.out.println("=== COSA MAGICA ======");
		//AHORA VIENE LA MAGIA, ESTO ES LO QUE SE CONOCE COMO PERLITAS DE LA PROGRAMACION ;)
		
		
		final Persona r = new Persona();
		
		r.nombre = "amilcar";
		r.apellido = "alberino";
		
		System.out.println(r.nombre);
		System.out.println(r.apellido);
		
		//la teoria plantea que la asignacion es de Izq a Derecha por lo cual en la siguiente linea el objeto r se copia en el r1
		Persona r1 = r;
		
		r1.nombre = "gablriel";
		
		System.out.println(r1.nombre);
		System.out.println(r1.apellido);
		
		//pero veremso que la asignacion no es de Izquierda a derecha ya que voy a setiar la edad en r1 y mira lo que se impirme
		
		r1.edad = 34;
		
		System.out.println(r.edad);
		
		// ¿Como puede ser posible que setee la edad en r1 y la edad en r tenga valor?
		//tene en cuenta que el objeto es inmutable pero no lo son sus atributos
		//arrancamos con que ME era una variable inmutable o constante y el mismo concepto se aplica al objetos pero no a sus atributos
		
		//la respuesta a la pregunta esta en las siguientes lineas
		
		System.out.println(r);
		System.out.println(r1);
	}

}
