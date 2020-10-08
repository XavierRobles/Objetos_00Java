package JavaBean;

import java.util.ArrayList;

public class MainJavabean {

	public static void main(String[] args) {

		Persona p1 = new Persona();

		p1.setNombre("SonGoku");
		p1.setEdad(40);
		p1.setAltura(1.80);

		String direccion = "Calle melilla 241, Toledp, Madrid, 45950";
		String direccion2 = "Calle juan de juanes, 10, Mostoles, 28933";
		// los numero que empiezan por 0 estan en base octal.
		int cp = 01000;
		System.out.println(cp);

		// p1.getDireccion().setNombreVia("Namekº");

		// Atributos primitivos
		// int,char,float,double,boolean, long, byte.
		// los otros tipos son referencias, String personas, arraylist

		// cuando se crea una objeto los valores primitivos toman un valor de 0
		// cuando se crea una referencia se toma por defecto un valor de null.

		Direccion d1 = new Direccion();
		p1.setDireccion(d1);
		d1.setCiudad("Namek");
		System.out.println(p1.getDireccion().getCiudad());
		p1.getDireccion().setCp("23234");
		System.out.println(p1.getDireccion().getCp());

		p1.setDireccion(new Direccion());
		p1.getDireccion().setCiudad("Kaito planet");
		System.out.println(d1.getCiudad());
		System.out.println(p1.getDireccion().getCiudad());

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p2 = new Persona();

		listaPersonas.add(p2);

		p2.setNombre("Krilin");

		listaPersonas.get(0).setNombre("Pikolo");

		Persona p3 = p2;
		p3.setNombre("Tenshian");
		p2.setNombre("Tenshian");

		System.out.println(p2.getNombre());
		System.out.println(listaPersonas);

		Direccion d2 = new Direccion();

		p2.setDireccion(d2);
		listaPersonas.get(0).getDireccion().setNombreVia("via Lactea");
		System.out.println(p2.getDireccion().getNombreVia());

		listaPersonas.get(0).getDireccion().setNombreVia("Planeta vegeta");
		p2.getDireccion().setCiudad("planeta vegeta");
		d2.setCiudad("planeta vegeta");

		// Cuantas maneras hay de poner a la ditrecion de la ciudad de ten shi han a
		// planeta vegeta

		String s1 = "Pepe";
		String s2 = new String ("Pepe");
		String s3 = "Pepe";
		if (p3.equals(p3)) {
			System.out.println("Son iguales");
			
		}else
			System.out.println("Son diferentes");
	}

}
