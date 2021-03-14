package paquete.webscraping;

public class Municipio {
	
	private String imagen,latitud,longitud;

	public Municipio(String imagen, String latitud, String longitud) {
		super();
		this.imagen = imagen;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Municipio [imagen=" + imagen + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	

}