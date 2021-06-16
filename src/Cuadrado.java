package src;

import java.util.*;

public class Cuadrado{

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado(50);
		System.out.println("\nCada lado del cuadrado mide "+cuadrado.getLado());
		System.out.println("\nEl cuadrado tiene un perimetro de "+cuadrado.calcularPerimetro());
		System.out.println("\nEl cuadrado tiene un área de : "+cuadrado.calcularArea());
	}

	private int lado;

	public Cuadrado(int lado){
		this.lado = lado;
	}

	public int calcularPerimetro(){
		return (lado*4);
	}

	public int calcularArea(){
		return (lado*lado);
	}

	public int getLado(){
		return this.lado;
	}

	public void setLado(int lado){
		this.lado = lado;
	}
}