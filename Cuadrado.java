package objetos;

// con el metodo toString nos devuelve una cadena de caracteres

public class Cuadrado {
	
	// atributos 
	
	int lado;
	
	// constructor
	
	public Cuadrado(int l) {
	this.lado = l;
	}
	
	// metodo toString, que crea un cuadrado
	
	public String toString() {
	int i, espacios;
	String resultado = "";
	for (i = 0; i < this.lado; i++) {
	resultado += "* ";
	}
	resultado += "\n";
	for (i = 1; i < this.lado - 1; i++) {
	resultado += "* ";
	
	for (espacios = 1; espacios < this.lado - 1; espacios++) {
		resultado += "  ";
		}
		resultado += "*\n";
		}
		for (i = 0; i < this.lado; i++) {
		resultado += "* ";
		}
		resultado += "\n";
		return resultado;
	}	
}




