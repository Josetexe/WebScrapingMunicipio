package paquete.webscraping;

import java.util.ArrayList;

public class CrearHTML {
	
	public static String crearTablaCamaras(ArrayList<Municipio> lista_municipios) {
		// TODO Auto-generated method stub
		String tabla="<table><tr><th>Latitud</th><th>Longitud</th><th>Foto</th></tr>";
		for (Municipio municipio : lista_municipios) {
			tabla+="<tr><td>"+municipio.getLatitud()+"</td><td>"+municipio.getLongitud()+"</td><td><img src='"+municipio.getImagen()+"'></td></tr>";
		}
		tabla+="</table>";
		return tabla;
	}
	
}