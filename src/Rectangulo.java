package src;

import java.util.*;

public class Rectangulo{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nIngresa el largo del rectangulo:");	
		int largo = scanner.nextInt();
		System.out.print("\nIngresa el ancho del rectangulo");
		int ancho = scanner.nextInt();
		if (ancho != largo) {
			Rectangulo rectangulo = new Rectangulo(ancho,largo);
			System.out.println("\nEl ancho del rectangulo es "+ancho+", y su largo es "+largo);
			System.out.println("\nEl rectangulo tienen un perimetro de " + rectangulo.calcularPerimetro());
			System.out.println("\nEl rectangulo tiene un area de " + rectangulo.calcularArea());
		} else {
			System.out.println("\nEl ancho y largo no pueden ser iguales");
		}
	}

	private int ancho;
	private int largo;

	public Rectangulo(int ancho,int largo){
		this.ancho = ancho;
		this.largo = largo;
	}

	public int calcularArea(){
		return (largo*ancho);
	}

	public int calcularPerimetro(){
		return (largo+largo+ancho+ancho);
	}

	public int getAncho(){
		return ancho;
	}

	public int getLargo(){
		return largo;
	}

	public void setLargo(int largo){
		this.largo = largo;
	}

	public void setAncho(int ancho){
		this.ancho = ancho;
	}
}