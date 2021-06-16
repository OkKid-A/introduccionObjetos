package src;

import java.util.*;

public class Circulo{

	public static void main(String[] args) {
		Circulo circulo = new Circulo(15);
		System.out.println("\nEl circulo tiene un radio de "+circulo.getRadio());
		System.out.println("\nEl circulo tiene un perimetro de "+circulo.calcularPerimetro());
		System.out.println("\nEl circulo tiene un área de : "+circulo.calcularArea());
	}

	private double radio;
	public static final double PI = 3.1416;

	public Circulo(int radio){
		this.radio = radio;
	}

	public double calcularArea(){
		return (PI*radio*radio);
	}

	public double calcularPerimetro(){
		return (PI*2*radio);
	}

	public double getRadio(){
		return this.radio;
	}

	public void setRadio(int radio){
		this.radio = radio;
	}
}