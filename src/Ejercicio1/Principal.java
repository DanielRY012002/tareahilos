package Ejercicio1;

public class Principal {
	static Hilo1 h1;
	static Hilo2 h2;
	public static void main(String[] args) {
		h1=new Hilo1();
		h2=new Hilo2();
		h1.start();
		h2.start();
	}
}
