package src;

import java.util.*;

public class Fraccion{

	public static void main(String[] args) {
		Fraccion fraccionA = new Fraccion(4,5);
		System.out.println("\nLa fraccion A es "+fraccionA.mostrarFraccion());
		Fraccion fraccionB = new Fraccion(8,9);
		System.out.println("\nLa fraccion B es "+fraccionB.mostrarFraccion());
		System.out.println("\nLa suma de ambas fracciones es "+fraccionB.sumarFracciones(fraccionA,fraccionB).mostrarFraccion());;
		System.out.println("\nLa resta de ambas fracciones es "+(fraccionB.restarFracciones(fraccionB,fraccionA).mostrarFraccion()));
		System.out.println("\nLa multiplicaion de ambas fracciones es "+(fraccionB.multiplicarFracciones(fraccionA,fraccionB).mostrarFraccion()));
		System.out.println("\nLa division de ambas fracciones es "+(fraccionB.dividirFracciones(fraccionA,fraccionB).mostrarFraccion()));
	}

	private int numerador;
	private int denominador;

	public Fraccion(int numerador,int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int hallarMCM(int a, int b){
		int mcm = 0;
		int bTemp = b;
		int aTemp = a;
		while (bTemp > 0) {
        	int temp = bTemp;
        	bTemp = aTemp % bTemp;
        	aTemp = temp;
    	}
    	mcm = aTemp;
    	mcm = a*(b/mcm);
		return mcm;
	}

	public Fraccion sumarFracciones(Fraccion a,Fraccion b){
		int mcm = hallarMCM(a.getDenominador(),b.getDenominador());
		int numResultado = a.getNumerador()*(mcm/a.getDenominador())+b.getNumerador()*(mcm/b.getDenominador());
		return new Fraccion(numResultado,mcm);
	}

	public Fraccion restarFracciones(Fraccion a,Fraccion b){
		int mcm = hallarMCM(a.getDenominador(),b.getDenominador());
		int numResultado = a.getNumerador()*(mcm/a.getDenominador())-b.getNumerador()*(mcm/b.getDenominador());
		return new Fraccion(numResultado,mcm);
	}

	public Fraccion multiplicarFracciones(Fraccion a,Fraccion b){
		int numTotal = a.getNumerador()*b.getNumerador();
		int denTotal = a.getDenominador()*b.getDenominador();
		return new Fraccion(numTotal,denTotal);
	}

	public Fraccion dividirFracciones(Fraccion a,Fraccion b){
		int numTotal = a.getNumerador()*b.getDenominador();
		int denTotal = a.getDenominador()*b.getNumerador();
		return new Fraccion(numTotal,denTotal);
	}

	public String mostrarFraccion(){
		return numerador+"/"+denominador;
	}

	public int getNumerador(){
		return numerador;
	}

	public int getDenominador(){
		return denominador;
	}

	public void setNumerador(int numerador){
		this.numerador = numerador;
	}

	public void setDenominador(int denominador){
		this.denominador = denominador;
	}
}