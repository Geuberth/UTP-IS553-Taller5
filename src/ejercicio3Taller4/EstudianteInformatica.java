package ejercicio3Taller4;

public class EstudianteInformatica extends Estudiante {
	private String lenguajeFavorito;
	
	public EstudianteInformatica(String nombre, int edad, String telefono,String lenguaje) {
		super(nombre, edad, telefono);
		this.lenguajeFavorito = lenguaje;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("Lenguaje Favorito: "+lenguajeFavorito+"\n");
		return str.toString();
	}
}
