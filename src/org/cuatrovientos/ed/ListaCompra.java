package org.cuatrovientos.ed;

public class ListaCompra {

	Product[] listaProductos;

	public ListaCompra(int num) {
		
		this.listaProductos = new Product[num];
	}
	
	public boolean add(Product p) {
		//TODO Agragar el producto a la lista
		for (int i = 0;i< listaProductos.length;i++) {
			
		
		if(this.listaProductos[this.listaProductos.length] == null) {
			if(this.listaProductos[i] == null) {
				this.listaProductos[i]=p;
				return true;
			}
		}
			return true;
		}
		return false;
		
		
	}
	public String showAll() {
		String result = "";
		for (Product product : listaProductos) {
			result += product.toString();
			
			
		}
		
		return result;
	}
	
}
