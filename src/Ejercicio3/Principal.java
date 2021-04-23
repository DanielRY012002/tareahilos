package Ejercicio3;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Ingrese Numero: ");
		int numero=s.nextInt();
		s.close();
		Hilo h=new Hilo(numero);
		Thread t=new Thread(h);
		t.start();
	}
}
