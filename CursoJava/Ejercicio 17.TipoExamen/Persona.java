import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persona {
	//Atributos
			public String nombre;
			public String pais;
			public String fechaNacimiento;
			
			//Constructor
			public Persona() {
				nombre = "";
			 	pais = "";

			}

			//Metodo
			
			public int getEdad() {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaNac = LocalDate.parse(this.fechaNacimiento,formatter);
		    LocalDate fecha = LocalDate.now();
		    int result = fecha.getYear() - fechaNac.getYear();
		    return result;
			}
			
}
