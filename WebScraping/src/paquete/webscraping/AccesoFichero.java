package paquete.webscraping;

import java.io.FileWriter;
import java.io.IOException;

public class AccesoFichero {
	
	public static void grabarTabla(String html_tabla) {
		String cabecera="<html><head></head><body>";
		String pie="</body></html>";
		
		try {
			FileWriter escritor=new FileWriter("C:\\Jose\\wikipedia.html");
			escritor.write(cabecera+html_tabla+pie);
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
