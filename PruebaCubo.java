package objetos;

public class PruebaCubo {
	
		public static void main(String[] args) {
			
		Cubo cubito = new Cubo(2);   // creamos un nuevo objeto cubito de tipo Cubo
		Cubo cubote = new Cubo(7);   // creamos un nuevo objeto cubote de tipo Cubo
		
		System.out.println("Cubito: \n");
		cubito.pinta();  // llamamos al metodo pinta del objeto cubito
		System.out.println("\nCubote: \n");
		cubote.pinta();   // llamamos al metodo pinta del objeto cubote
		
		System.out.println("\nLleno el cubito: \n");
		cubito.llena();   // llamamos al metodo llena del objeto cubito
		cubito.pinta();   // llamamos al metodo pinta del objeto cubito
		System.out.println("\nEl cubote sigue vacío: \n");
		cubote.pinta();    // llamamos al metodo pinta del objeto cubote
		System.out.println("\nAhora vuelco lo que tiene el cubito en el cubote.\n");
		cubito.vuelcaEn(cubote);   // llamamos al metodo vuelcaEn del objeto cubito
		System.out.println("Cubito: \n");
		cubito.pinta();   // llamamos al metodo pinta del objeto cubito
		System.out.println("\nCubote: \n");
		cubote.pinta();   // llamamos al metodo pinta del objeto cubote
		System.out.println("\nAhora vuelco lo que tiene el cubote en el cubito.\n");
		cubote.vuelcaEn(cubito);    // llamamos al metodo vuelcaEn del objeto cubote
		System.out.println("Cubito: \n");
		cubito.pinta();    // llamamos al metodo pinta del objeto cubito
		System.out.println("\nCubote: \n");
		cubote.pinta();   // llamamos al metodo pinta del objeto cubote
		}
	}


