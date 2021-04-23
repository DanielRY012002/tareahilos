package Ejercicio3;

public class Hilo extends Thread{
	private int numero;
	public Hilo(int numero) {
		this.numero=numero;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int factorial=1;
		for (int i=1;i<=numero;i++) {
			factorial=factorial*i;
		}
		System.out.println(numero+"!= "+factorial);
	}
	
}
