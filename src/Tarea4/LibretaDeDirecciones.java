package Tarea4;

public class LibretaDeDirecciones {
	private RegistroLibreta registros[];
	private int actual;	
	public LibretaDeDirecciones() {
		registros = new RegistroLibreta[100];
		actual = 0;	
	}
	public void  add(RegistroLibreta entrada) {
		if(actual <100 ) {
			registros[actual] = entrada;
			actual ++;			
		}else
			System.out.println("Ha excedido el numero de entradas");
	}
	
	public void  remove() {
		
	}
	
	public void  list() {
		
	}
	
	public void  update() {
		
	}
}