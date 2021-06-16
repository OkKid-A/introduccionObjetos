package src;

import java.util.*;

public class Contador{

	public static void main(String[] args) {
		Contador a = new Contador();
	}

    private int contador;

    public Contador(){
        contador = 0;
        System.out.println("\nEl contador empezó en "+contador);
        aumentar();
        reducir();
    }

    public Contador(int inicio){
        contador = inicio;  
        System.out.println("\nEl contador empezó en "+contador);
    }

    public void aumentar(){
        contador++;
        System.out.println("\nSe usó el método aumentar, ahora el contador es " +contador);
    }

    public void reducir(){
        contador--;
        System.out.println("\nSe usó el método reducir, ahora el contador es " +contador);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int nuevo){
        contador = nuevo;
    }
}
