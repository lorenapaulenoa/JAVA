package objetos;

// con el metodo toString solamente tenemos que poner el nombre de la variable que apunta al objeto creado

public class PruebaCuadrado {
	
	public static void main(String[] args) {
		Cuadrado miCuadradito = new Cuadrado(5);  // creamos un nuevo objeto de tipo Cuadrado y pasamos 1 parametro
		System.out.println(miCuadradito);  // llamamos al metodo toString y lo imprimimos
	}
}



