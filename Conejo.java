package objetos;

public class Conejo implements Mascota { // al poner implements Mascota te avisa que tiene que traer los metodos de la interface Mascota, al aceptar los añade automaticamente
	
	// ATRIBUTO ESTATICO, ES COMUN PARA TODOS LOS OBJETOS DE ESTA CLASE Conejo
	private static int conejosTotales = 0;
	
	// ATRIBUTOS
	private Sexo sexo;
	private String raza;
	
	// CONSTRUCTORES, cada vez que creamos un nuevo objeto Conejo con alguno de estos constructores, conejosTotales aumentará en 1
	
	public Conejo (Sexo s, String r) {
		this.sexo = s;
		this.raza = r; 
		conejosTotales++;  // el valor de ConejosTotales aumentara en 1
	}
	
	public Conejo (Sexo s) {
		this.sexo = s;
		this.raza = "Siames";
		conejosTotales++;  // el valor de ConejosTotales aumentara en 1
	}
	
	public Conejo (String r) {
		this.sexo = Sexo.HEMBRA;
		this.raza = r;
		conejosTotales++;  // el valor de ConejosTotales aumentara en 1
	}
	
	public Conejo () {
		this.sexo = Sexo.HEMBRA;
		this.raza = "Siames";
		conejosTotales++;  // el valor de ConejosTotales aumentara en 1
	} 
	
	// GETTERS Y SETTERS
	
		public Sexo getSexo() {
			return sexo;
		}

		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}
		
		public String getRaza() {
			return raza;
		}

		public void setRaza(String raza) {
			this.raza = raza;
		}
		
		public int getConejosTotales() { // el atributo ConejosTotales no tiene metodo set porque su valor sera autoincrementable cada vez que se crea un objeto tipo Conejo
			return conejosTotales;
		}

		// METODOS DE LA CLASE
		
		@Override
		public void corre() { 
			System.out.println("Voy a toda velocidad ... ");
			// al poner implements Mascota te avisa que tiene que traer los metodos 
			// de la interface Mascota, al aceptar los añade automaticamente, pero solo trae la cabecera
			// el resto del metodo hay que definirlo aqui.
		}
		
		@Override
		public int duplicaHorasPaseo(int horas) {
			int horasPaseo = horas*2;
			return horasPaseo;
		}
	

}
