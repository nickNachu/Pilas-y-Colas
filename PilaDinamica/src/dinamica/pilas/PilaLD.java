package dinamica.pilas;

public class PilaLD implements PilaTDA {
	class Nodo {
		int info;
		Nodo sig;
	}
	Nodo Primero;
	public void InicializarPila() {
		Primero=null;
	}
	public void Apilar(int x) {
		Nodo Nuevo= new Nodo();
		Nuevo.info=x;
		Nuevo.sig=Primero;
		Primero=Nuevo;
	}
	public void Desapilar() {
		Primero=Primero.sig;
	}
	public boolean PilaVacia() {
		return (Primero==null);
	}
	public int Tope() {
		return Primero.info;
	}
}
