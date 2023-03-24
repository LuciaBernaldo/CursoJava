import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usuario extends Persona implements IStatus, ISegmento {
	// Atributos

	public String fechaRegistro;
	public String fechaLogin; // Necesito la fecha de Login para saber el status
	public String compras;

	// Constructor
	public Usuario(final String nombre, final String pais, final String fechaNacimiento, final String fechaRegistro,
			final String fechaLogin, final String compras) {
		this.nombre = nombre;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = fechaRegistro;
		this.fechaLogin = fechaLogin;
		this.compras = compras;
	}
	// Métodos

	public int getAntiguedad() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaAnt = LocalDate.parse(this.fechaRegistro, formatter);
		LocalDate fecha = LocalDate.now();
		int result = fecha.getYear() - fechaAnt.getYear();
		return result;
	}

	public int getLogin() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaLog = LocalDate.parse(this.fechaLogin, formatter);
		LocalDate fecha = LocalDate.now();
		int result = fecha.getYear() - fechaLog.getYear();
		return result;
	}

	public String decirStatus() {
		int login = getLogin();
		if (login != 2) {
			return "Activo";
		}
		else
			return"Inactivo";
	}

	public String decirSegmento() {
		int numeroCompras = Integer.valueOf(this.compras);
		if (numeroCompras>=1 && numeroCompras<=5) {
			return "Estandar User";
		}
		
		else if (numeroCompras>=6 && numeroCompras<=10) {
			return "Affiliate";
		}
		
		else 
			return "Premier";
	}

	public String getInformacion() {
		String info = new String();
		info = info.concat(this.nombre + " ");
		info = info.concat(this.getEdad() + " ");
		info = info.concat(this.getAntiguedad() + " ");
		info = info.concat(this.decirStatus() + " ");
		info = info.concat(this.decirSegmento() + " ");
		info = info.concat("\n");
		return info;
	}
}
