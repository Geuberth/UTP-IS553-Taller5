package ejercicio6Taller4;

import java.util.ArrayList;
import java.util.List;

public class ListaReales<T> implements Estadisticas<T> {
	private	 List<T> NumerosReales;
	
	public ListaReales() { 
		
	}
	
	public T obtenerMinimo() {
		float temporal = Float.MAX_VALUE;
		for(int i = 0;i < NumerosReales.size();i++) {
			if(temporal < (float)NumerosReales.get(i)) {
				temporal = (float)NumerosReales.get(i);
			}
		}
     return NumerosReales.get(NumerosReales.indexOf(temporal));
	}


	public T obtenerMaximo() {
		float temporal = Float.MIN_VALUE;
		for(int i = 0;i < NumerosReales.size();i++) {
			if(temporal > (float)NumerosReales.get(i)) {
				temporal = (float)NumerosReales.get(i);
			}
		}
     return NumerosReales.get(NumerosReales.indexOf(temporal));
	}

	public T calcularMedia() {
		// TODO Auto-generated method stub
		return null;
	}

	public T calcularPromedio() {
		return null;
		
	}

	public T calcularSumar() {
		// TODO Auto-generated method stub
		return null;
	} 
	
	public void add(T entrada) {
		NumerosReales.add(entrada);
	}
	
	
}
