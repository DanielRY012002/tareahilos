package Ejercicio2;
public class Hilo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] numeros={2,7,5,4,9,3,6,8,1,10};
		int suma=0;
		for(int number:numeros) {
			suma+=Math.pow(number,3);
		}
		System.out.println("Suma total: "+suma);
	}
	
}