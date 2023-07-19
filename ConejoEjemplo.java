package objetos;

public class ConejoEjemplo {
	public static void main (String[] args) {
		
		// CREAMOS 4 OBJETOS TIPO CONEJO CON LOS 4 CONSTRUCTORES DISTINTOS:
		
		System.out.println("c1");
		Conejo c1 = new Conejo (Sexo.HEMBRA, "raza de bosque" );  // creamos un nuevo objeto c1 de tipo Conejo y le pasamos los dos parametros del constructor
		System.out.println("sexo: " + c1.getSexo() + ", raza: " + c1.getRaza() ); // llamamos a los metodos get de ambos atributos de dicho objeto e imprimimos sus valores
		
		System.out.println("c2"); 
		Conejo c2 = new Conejo (Sexo.MACHO);  // creamos un nuevo objeto c2 de tipo Conejo y le pasamos los dos parametros del constructor
		System.out.println("sexo: " + c2.getSexo() + ", raza: " + c2.getRaza() );  // llamamos a los metodos get de ambos atributos de dicho objeto e imprimimos sus valores
		
		System.out.println("c3");
		Conejo c3 = new Conejo ("raza de campo" ); // creamos un nuevo objeto c3 de tipo Conejo y le pasamos los dos parametros del constructor
		System.out.println("sexo: " + c3.getSexo() + ", raza: " + c3.getRaza() );  // llamamos a los metodos get de ambos atributos de dicho objeto e imprimimos sus valores
		
		System.out.println("c4");
		Conejo c4 = new Conejo (); // creamos un nuevo objeto c4 de tipo Conejo y le pasamos los dos parametros del constructor
		System.out.println("sexo: " + c4.getSexo() + ", raza: " + c4.getRaza() );  // llamamos a los metodos get de ambos atributos de dicho objeto e imprimimos sus valores
		
		System.out.println("Numero de conejos =  " + c4.getConejosTotales());
		// LLAMAMOS AL METODO getConejosTotal que es autoincrementable cada vez que se crea un nuevo objeto Conejo
		// y así sabemos el total de conejos creados.
		
		c4.corre();  // llamamos al metodo corre del objeto c4
		
		int horas = c4.duplicaHorasPaseo(3); // almacenamos en la variable horas el valor del metodo duplicaHorasPaseo del objeto c4
		System.out.println("Paseo al conejo " + horas + " horas");
		
		// y también se podria escribir asi:
		
		System.out.println("Paseo al conejo " + c4.duplicaHorasPaseo(3) + " horas");
		
				
	}

}
