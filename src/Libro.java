package src;

import java.util.*;

public class Libro{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa el nombre del libro");
		String nombre = scanner.nextLine();
		System.out.println("\nIngresa el id del libro");
		int id = scanner.nextInt();
		Libro libro = new Libro(nombre,id);
		libro.prestar();
		libro.devolver();
		libro.mostrarInfo();
	}

	private String nombre;
	private int id;
	private boolean prestado;

	public Libro(String nombre,int id){
		this.nombre = nombre;
		this.id = id;
		prestado = false;
	}

	public void prestar(){
		prestado = true;
		System.out.println("\nSe ha prestado el Libro " + nombre);
	}

	public void devolver(){
		prestado = false;
		System.out.println("\nSe ha devuelto el Libro "+nombre);
	}

	public void mostrarInfo(){
		System.out.println("\nNombre: " + nombre);
		System.out.println("id: "+id);
		if (prestado) {
			System.out.println("Se encuentra prestado");
		} else {
			System.out.println("Se encuentra disponible");
		}
	}

	public String getNombre(){
		return nombre;
	}

	public int getID(){
		return id;
	}

	public boolean getPrestado(){
		return prestado;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setiD(int id){
		this.id = id;
	}

	public void setPrestado(boolean prestado){
		this.prestado = prestado;
	}
}