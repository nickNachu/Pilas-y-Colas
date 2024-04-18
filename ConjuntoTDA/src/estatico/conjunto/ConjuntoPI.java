package estatico.conjunto;

public class ConjuntoPI implements ConjuntoTDA{
	private int[] arr;
	private int cant;
	
	public void InicializarConjunto() {
		arr= new int[100];
		cant=0;
	}
	
	public void Agregar(int x) {
		if (!this.Pertenece(x)) {
			arr[cant]=x;
			cant++;
		}
	}
	
	public int Elegir() {
		return arr[cant-1];
	}
	
	public boolean ConjuntoVacio() {
		return (cant==0);
	}
	
	public void Sacar(int x) {
		int i=0;
		while (i<cant && arr[i]!=x) {
			i++;
		}
	}
	
	public boolean Pertenece(int x) {
		int i=0;
		while (i<cant && arr[i]!=x)
			i++;
		return (i<cant);
	}
	
}
