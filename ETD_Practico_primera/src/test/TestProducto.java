package test;

import javabeans.Producto;

public class TestProducto {

    public static void main(String[] args) {
	Producto pantalon = new Producto();
	pantalon.setCantidadStock(800);
	pantalon.setColor("Verde");
	pantalon.setDescripcion("Pantalon Verde");
	pantalon.setNumeroProducto(33);
	pantalon.setPrecioUnitario(90);
	pantalon.setTalla("XXXL");

	Producto camisa = new Producto(45, "Camisa Hawaiana", 14, 29, "S", "Amarilla");

	System.out.println(pantalon.precioConIva(21));
	System.out.println(camisa.precioConIva(10));
	System.out.println(pantalon.getCantidadStock());
	pantalon.aumentarStock(50);
	System.out.println(pantalon.getCantidadStock());
	System.out.println(camisa.getCantidadStock());
	System.out.println(camisa.disminuirStock(100));

	Producto[] productos = { 
		new Producto(1, "gorra", 25, 50, "XS", "Blanca"),
		new Producto(4, "calzoncillos", 26, 41, "XS", "Azul"),
		new Producto(6, "chanclas", 42, 90, "XS", "Blanca"), 
		new Producto(7, "gafas", 50, 12, "XS", "Blanca"),
		new Producto(8, "alpargatas", 4, 75, "XS", "Blanca"), };

	for (Producto producto : productos) {
	    System.out.println(producto.precioAplicado());

	}
    }
}
