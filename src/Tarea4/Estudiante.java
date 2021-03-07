package Tarea4;

public class Estudiante {
	
	private String Nombre;
	private int Edad;
	private String Telefono;
	
	public Estudiante(String nombre, int edad, String telefono) {
		Nombre = nombre;
		Edad = edad;
		Telefono = telefono;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("nombre: "+Nombre+"\n");
		str.append("edad: "+Edad+"\n");
		str.append("telefono: "+Telefono+"\n");
		return str.toString();
	}

}
