package paquete.webscraping;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String municipio=EntradaSalida.pedirMunicipio().toLowerCase();
		String url_imagen="";
		String latitud="";
		String longitud="";
		String url="https://es.wikipedia.org/wiki/"+municipio;
		ArrayList<Municipio> lista_municipios=new ArrayList();
		String html_tabla;
		
		try {
			Document document = Jsoup.connect(url).get();
			Elements elementos_padre=document.select(".infobox.geography.vcard");
			for (Element elemento_hijo : elementos_padre) {
				Elements elementos_imagen = elemento_hijo.select(".image>img");
				Element e_latitud = elemento_hijo.selectFirst(".latitude");
				Element e_longitud = elemento_hijo.selectFirst(".longitude");
				url_imagen=elementos_imagen.get(2).absUrl("src");
				latitud=e_latitud.text();
				longitud=e_longitud.text();
				
				Municipio m=new Municipio(url_imagen, latitud, longitud);
				lista_municipios.add(m);
				System.out.println(m.toString());
				
			}
			html_tabla=CrearHTML.crearTablaCamaras(lista_municipios);
			AccesoFichero.grabarTabla(html_tabla);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

