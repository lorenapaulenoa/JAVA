package objetos;

 //creamos la clase Libro
public class Libro {
	
	 // CREAMOS SUS ATRIBUTOS:
	
	private String titulo; // encapsulamiento, con la palabra PRIVATE a estos atributos solamente se puede acceder desde esta clase
	private String autor;
	private int numPaginas;
	private double precio;
	
	//CREAMOS EL CONSTRUCTOR:  tiene que tener el mismo nombre que class
	
	public Libro(String titulo, String autor, int numPaginas, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.precio = precio;
	}
	
	// FUNCIONES/METODOS GET (obtener) Y SET (modificar):
	
	public String getTitulo() { // con esta función obtenemos el atributo solicitado
		return titulo;          // sin VOID ponemos return
	}
	
	public void setTitulo(String titulo) {  // aqui ponemos el nuevo titulo ( )
		this.titulo = titulo;               // con VOID no devuelve nada
	}
	
	public String getAutor() { // con esta función obtenemos el atributo solicitado
		return autor;
	}
	
	public void setAutor(String autor) {  // aqui ponemos el nuevo autor ( )
		this.autor = autor;
	}
	
	
	public int getNumPaginas() { // con esta función obtenemos el atributo solicitado
		return numPaginas;
		
		}
	
	public void setNumPaginas(int numPaginas) {  // aqui ponemos el nuevo precio ( )
		this.numPaginas = numPaginas;
	}
	
	public void setPrecio(double precio) {  // aqui ponemos el nuevo precio ( )
		this.precio = precio;
	}
	
	public double getPrecio() { // con esta función obtenemos el atributo solicitado
		return precio;
	}
	
	// FUNCIONES / METODOS
	
	public void mostrarInformacion () {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Numero de páginas: " + numPaginas);
		System.out.println("Precio: " + precio);
	}
	
	public void aumentarPrecio (double porcentaje) {
		precio = precio + ( precio * porcentaje/ 100.0);
		
	}
	
	public boolean esMasCaroQue (Libro otroLibro) {
		return precio > otroLibro.getPrecio ();
	}
	
}
	
	
	

