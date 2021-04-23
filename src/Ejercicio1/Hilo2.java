package Ejercicio1;

public class Hilo2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
	
}
