import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vuelo extends Aerolinia implements IMetodos {
	
	private String nombreVuelo;
	private int cantidadPasajeros; 
	private String tipoPasaje;
	private int valorUnitarioPasaje; 
	private String fechaVuelo;
	
	public Vuelo(final String nombreVuelo, final int cantidadPasajeros, final String tipoPasaje, 
			final int valorUnitarioPasaje, final String fechaVuelo) {
		this.nombreVuelo = nombreVuelo;
		this.cantidadPasajeros = cantidadPasajeros;
		this.tipoPasaje = tipoPasaje;
		this.valorUnitarioPasaje = valorUnitarioPasaje;
		this.fechaVuelo = fechaVuelo;
	}

	public String getNombreVuelo() {
		return nombreVuelo;
	}

	public void setNombreVuelo(String nombreVuelo) {
		this.nombreVuelo = nombreVuelo;
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public String getTipoPasaje() {
		return tipoPasaje;
	}

	public void setTipoPasaje(String tipoPasaje) {
		this.tipoPasaje = tipoPasaje;
	}

	public int getValorUnitarioPasaje() {
		return valorUnitarioPasaje;
	}

	public void setValorUnitarioPasaje(int valorUnitarioPasaje) {
		this.valorUnitarioPasaje = valorUnitarioPasaje;
	}

	public String getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	@Override
	public int valorFinalVuelo() {
		int valorFinal = this.getValorUnitarioPasaje() * this.getCantidadPasajeros();
		return valorFinal;
	}

	@Override
	public int diasDeDiferencia() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate feVuelo = LocalDate.parse(this.getFechaVuelo(), formatter);
		LocalDate fecha = LocalDate.now();
		int result = fecha.getDayOfMonth() - feVuelo.getDayOfMonth();
		return result;
	}

	@Override
	public String segmentacion() {
		int dinero= valorFinalVuelo();
		String tipo = this.getTipoPasaje();
		if (tipo.contains("ECONOMICO") && dinero > 100) 
			return "Es rentable viajar";

		else if (tipo.contains("ECONOMICO") && dinero < 100) 
			return "No es rentable viajar";
		
		else if (tipo.contains("PREMIER") && dinero < 1500)
			return "No es rentable viajar";
		
		else if (tipo.contains("PREMIER") && dinero > 1500)
			return "Es rentable viajar";
		else
			return "Error";
	}

	public String getInformacion() {
		String info = new String();
		info = info.concat("Aerolinia: " + this.getnombreAerolinia() + "   ");
		info = info.concat("Nombre: " + this.getNombreVuelo() + "   ");
		info = info.concat("Pasajeros: " + this.getCantidadPasajeros() + "   ");
		info = info.concat("Pasaje: " + this.getTipoPasaje() + "   ");
		info = info.concat("Valor_Pasaje: " + this.getValorUnitarioPasaje() + "   ");
		info = info.concat("Fecha_Vuelo: " + this.getFechaVuelo() + "   ");
		info = info.concat("Valor_Total_Vuelo: " + this.valorFinalVuelo() + "   ");
		info = info.concat("Dias_Para_Vuelo: " + this.diasDeDiferencia() + "   ");
		info = info.concat("Segmentacion: " + this.segmentacion() + "   ");
		info = info.concat("\n");
		info = info.concat("\n");
		return info;
	}
}
