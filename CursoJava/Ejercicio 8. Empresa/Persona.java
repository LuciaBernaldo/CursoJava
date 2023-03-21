import java.time.LocalDate;

public class Persona implements IEdad{

		//Atributos
		public String nombre;
		public String apellidos;
		public String localidadDeNacimiento;
		public int añoDeNacimineto;
		public int mesDeNacimiento;
		public int diaDeNacimiento;
		public int edad;
		
		//Constructor
		public Persona() {
			nombre = "";
		 	apellidos = "";
		 	localidadDeNacimiento = "";
		 	añoDeNacimineto = 0;
		 	mesDeNacimiento = 0;
		 	diaDeNacimiento = 0;
		 	
		}
		
		//Metodo
		
		public int calcularEdad(int añoDeNacimineto,int mesDeNacimiento,int diaDeNacimiento) {
		LocalDate fechaNacimiento =  LocalDate.of(añoDeNacimineto, mesDeNacimiento, diaDeNacimiento);
	    LocalDate fecha = LocalDate.now();
	    this.edad = fecha.getYear() - fechaNacimiento.getYear();
	    return edad;
		}
}

