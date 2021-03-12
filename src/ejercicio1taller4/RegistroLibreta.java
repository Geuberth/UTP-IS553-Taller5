package ejercicio1taller4;

public class RegistroLibreta {
	
	private String Nombre;
	private String Direccion;
	private String Numerodetelefono;
	private String Correoelectronico;


	public RegistroLibreta() {
		
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getDireccion() {
		return Direccion;
	}

	

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public String getNumerodetelefono() {
		return Numerodetelefono;
	}


	public void setNumerodetelefono(String numerodetelefono) {
		Numerodetelefono = numerodetelefono;
	}


	public String getCorreoelectronico() {
		return  Correoelectronico;
	}


	public void setCorreoelectronico(String correoelectrónico) {
		 Correoelectronico = correoelectrónico;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("nombre: "+Nombre+"\n");
		str.append("direccion: "+Direccion+"\n");
		str.append("Telefono: "+Numerodetelefono+"\n");
		str.append("correo: "+Correoelectronico+"\n");
		return str.toString();
		
	}






}

