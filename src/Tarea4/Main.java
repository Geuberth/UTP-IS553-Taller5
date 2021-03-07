package Tarea4;

public class Main {

	public static void main(String[] args) {
		RegistroLibreta registro = new RegistroLibreta();
		registro.setCorreoelectronico("kerrycaberga@gmail.com");
		registro.setNombre("Benito");
		registro.setDireccion("avenida elcarajo");
		registro.setNumerodetelefono("15689235");
		
		LibretaDeDirecciones libreta = new LibretaDeDirecciones();
		libreta.add(registro);
		libreta.list();
		
		EstudianteInformatica estudiante = new EstudianteInformatica("juarez",29,"5784685","C#");
		System.out.println(estudiante);
		
		PairOfDice dados = new PairOfDice();
		dados.roll();
		System.out.println("dado 1: "+dados.getDice1());
		System.out.println("dado 2: "+dados.getDice2()+"\n");
		
		Factura factura = new Factura();
		factura.setPesos(250.0);
		factura.setCliente("fernando");
		factura.setEmisor("avianca");
		factura.imprimirFactura();
	}
	
	

}
