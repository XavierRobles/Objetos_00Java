package JavaBean;

//Que es un javabean
//Es una clase cuyos atributos son privados y tienen metodos accesorios y 
//modificadores publicos, tambien conocidos como get/set
//Para saber si una clase tiene a otra s le pregunta...
//Una persona tiene un? (Direccion,nombre,edad)  es un atributo de clase
//es un? es herencia

public class Persona {

	private String nombre;
	private int edad;
	private double altura;
	private Direccion direccion;
	private Persona hijo;


	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		if (edad >= 0) {
			this.edad = edad;
		} else
			this.edad = 0;
		
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", direccion=" + direccion
				+ ", hijo=" + hijo + "]";
	}
	
	
}
