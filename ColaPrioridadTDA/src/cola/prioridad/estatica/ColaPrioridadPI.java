package cola.prioridad.estatica;

public class ColaPrioridadPI {
	Elemento[] arr;
	int index;
	
	public void InicializarCola() {
		arr = new Elemento[100];
		index = 0;
	}
	public void AcolarPrioridad(int x, int prioridad) {
		int j = index;
		while (j>0 && arr[j-1].prioridad>prioridad) {
			arr[j]=arr[j-1];
			j--;
		}
		arr[j]=new Elemento();
		arr[j].valor=x;
		arr[j].prioridad=prioridad;
		index++;
	}
	public void Desacolar() {
		index--;
	}
	public boolean ColaVacia() {
		return (index==0);
	}
	public int Primero() {
		return arr[index-1].valor;
	}
	public int Prioridad() {
		return arr[index-1].prioridad;
	}
}
