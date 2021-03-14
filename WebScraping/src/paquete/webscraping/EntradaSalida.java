package paquete.webscraping;

import java.util.Scanner;

public class EntradaSalida {

	public static String pedirMunicipio() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el nombre de un municipio");
		Scanner sc=new Scanner(System.in);
		String municipio=sc.nextLine();
		return municipio;
	}

}
