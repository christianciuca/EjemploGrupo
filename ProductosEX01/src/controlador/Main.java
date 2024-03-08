package controlador;

import modelo.NoPerecedero;
import modelo.Perecedero;
import modelo.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perecedero p1 = new Perecedero(4,"platanos",2);
		NoPerecedero p2 = new NoPerecedero("quimico", "detergente",3);
		
		Producto[] productos = new Producto[2];
		
		productos[0]=p1;
		productos[1]=p2;
		
		float total = productos[0].calcular(5) + productos[1].calcular(5) ;
		
		System.out.println("TOTAL: "+total);
		
		
		
		

	}

}
