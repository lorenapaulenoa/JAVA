package objetos;

public class objetoLibro {
	public static void main (String[] args) {
	
	
	// CREAMOS CON NEW UN NUEVO OBJETO:  son objetos tipo Libro ( como la clase que hemos creado con los atributos, constructor y funciones/metodos)
		
	 Libro libro1 = new Libro ("El Señor de los Anillos", "J.R.R Tolkin", 1000,25.99); // creamos un nuevo objeto libro1 de tipo Libro
	 Libro libro2 = new Libro ("Los Juegos del Hambre", "Anonimo Chino", 725,17.99);   // creamos un nuevo objeto libro2 de tipo Libro
	 
	 // LLAMADAS A GET Y SET:
	 
	 // get y set titulo
	 String t = libro1.getTitulo(); //a la variable t le asignamos el valor de la función getTitulo del objeto libro1
	 System.out.println("Titulo: " + t);
	 libro1.setTitulo("El Señor de los Pepinos");  // con el metodo setTitulo modificamos el valor del atributo titulo
	 System.out.println("Titulo: " + libro1.getTitulo());  // llamamos al metodo getTitulo e imprimimos el valor del atributo titulo
	 libro1.setTitulo("La Señora de la Cebolla");   // con el metodo setTitulo modificamos el valor del atributo titulo
	 System.out.println("Titulo: " + libro1.getTitulo());   // llamamos al metodo getTitulo e imprimimos el valor del atributo titulo
	 
	 System.out.println("-------------------------------");
	 
	 
	 
	// get y set numero de paginas
		 int nump = libro1.getNumPaginas(); // a la variable nump le asignamos el valor de la funcion getNumPaginas del objeto libro1
		 System.out.println("Número de páginas: " + nump);
		 libro1.setNumPaginas(985);  // con el metodo setNumPaginas modificamos el valor del atributo NumPaginas
		 System.out.println("Número de páginas: " + libro1.getNumPaginas());  // llamamos al metodo getNumPaginas e imprimimos el valor del atributo NumPaginas
		 libro1.setNumPaginas(964);   // con el metodo setNumPaginas modificamos el valor del atributo NumPaginas
		 System.out.println("Número de páginas: " + libro1.getNumPaginas());  // llamamos al metodo getNumPaginas e imprimimos el valor del atributo NumPaginas
		 

		 
	 // LLAMADA FUNCIONES
		 
		 libro1.mostrarInformacion();  // llamamos al metodo mostrarInformacion del objeto libro1
		 libro2.mostrarInformacion();  // llamamos al metodo mostrarInformacion del objeto libro2
		 
		 System.out.println("-------------------------------");
		 
		 libro1.aumentarPrecio(10.0); // llamamos al metodo aumentarPrecio del objeto libro1 y aumentará el precio de libro1 un 10%
		 System.out.println("El nuevo precio del libro 1 es: " + libro1.getPrecio()); // llamamos al metodo getPrecio del objeto libro1 e imprimimos su valor
		 
		 System.out.println("-------------------------------");
		 
		 if (libro1.esMasCaroQue(libro2)) {  // llamamos al metodo esMasCaroQue y según su resultado ( true o false ) se mostrará una de las dos sentencias
			 System.out.println("El libro 1 es más caro que el libro 2");
		 } else {
			 System.out.println("El libro 2 es más caro que el libro 1");
		 }
		 
		 
		 
		 
	}
}
