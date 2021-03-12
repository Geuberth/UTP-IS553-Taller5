package ejercicio5Taller4;

public class Factura extends Precio {
	private String Emisor;
	private String Cliente;
	
	public String getEmisor() {
		return Emisor;
	}

	public void setEmisor(String emisor) {
		Emisor = emisor;
	}
	
	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public void imprimirFactura() {
			StringBuilder str = new StringBuilder();
			str.append(Cliente+"\n");
			str.append(Emisor+"\n");
			str.append(super.getPesos().toString()+"\n");
			System.out.println(str);
	}
	

}
