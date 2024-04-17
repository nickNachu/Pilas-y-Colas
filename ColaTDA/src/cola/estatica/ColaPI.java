package cola.estatica;

public class ColaPI implements ColaTDA {
	int[] arr;
	int index;
	
	public void InicializarCola() {
		arr = new int[100];
		index = 0;
	}
	public void Acolar(int x) {
		arr[index] = x;
		index++;
	}
	public void Desacolar() {
		for (int i=0;i<index;i++) {
			arr[i]=arr[i+1];
		}
		index--;
	}
	public boolean ColaVacia() {
		return (index==0);
	}
	public int Primero() {
		return arr[0];
	}
}
