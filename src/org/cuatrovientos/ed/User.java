package org.cuatrovientos.ed;

public class User {
	ListaCompra lista;
	
	public User(int num) {
		lista =new ListaCompra(num);
		Product p = new Product("lexhe");
		lista.add(p);
		
		System.out.println(lista.showAll());
	}

}
