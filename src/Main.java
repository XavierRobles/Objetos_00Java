
public class Main {
	public static void main(String[] args) {
		// Elciclo de una vida de un objeto en java
		// dura el tiempo que alguna referencia ele este apuntando

		new Persona();
		// en este caso el objeto sera elimi
//Eciclo de vida de una variable es el bloque donde haya sido declarada
		Persona p2;
		{
		Persona p1 = new Persona();
		p1.edad = 4;
		System.out.println();
		p1.edad = 1;
		p2 = p1;
		p2.edad = 78;
	System.out.println(p1.edad);
		}
		//aqui p1 no existe
	}
}
