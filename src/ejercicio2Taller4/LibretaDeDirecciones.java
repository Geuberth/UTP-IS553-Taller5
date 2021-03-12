package ejercicio2Taller4;

import ejercicio1taller4.RegistroLibreta;

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
	
	public void  remove(RegistroLibreta borrar) {
		for(int i = 0; i<actual;i++) {
			if(registros[i] == borrar) {
				registros[i] = null;
			}
		}
		
	}
	
	public void  list() {
		for(int i = 0; i<actual;i++) {
			System.out.println(registros[i]);
		}
	}
	
	public void  update(RegistroLibreta buscar, RegistroLibreta reemplazar) {
		for(int i = 0; i<actual;i++) {
			if(registros[i] == buscar) {
				registros[i] = reemplazar;
			}
		}
	}
}
