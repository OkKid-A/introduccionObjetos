package src;

import java.util.*;

public class Principal{

	public static void main(String[] args) {
		Principal principal = new Principal();
	}

	private Contador contador;
	private Cuadrado cuadrado;
	private Circulo circulo;
	private Rectangulo rectangulo;
	private Libro libro;
	private Fraccion fraccion;

	public Principal(){
		contador = new Contador(10);
		Contador contador2 = contador;
		cuadrado = new Cuadrado(5);
		Cuadrado cuadrado2 = cuadrado;
		circulo = new Circulo(10);
		Circulo circulo2 = circulo;
		rectangulo = new Rectangulo(1,2);
		Rectangulo rectangulo2 = rectangulo;
		libro = new Libro("\nHistoria de Dos Ciudades",589456);
		Libro libro2 = libro;
		fraccion = new Fraccion(1,4);
		Fraccion fraccion2 = fraccion;
		contador2.aumentar();
		System.out.println("\nEl primer contador esta en "+contador.getContador());
		cuadrado2.setLado(250);
		System.out.println("\nEl cuadrado tiene un area de "+cuadrado.calcularArea());
		circulo2.setRadio(1);
		System.out.println("\nEl perimetro del circulo es "+circulo.calcularPerimetro());
		rectangulo2.setAncho(500);
		System.out.println("\nEl area del rectangulo es " + rectangulo.calcularArea());
		libro2.setNombre("La Dama de las Camelias");
		libro.mostrarInfo();
		fraccion2.setDenominador(23);
		fraccion.mostrarFraccion();
	}	
}

