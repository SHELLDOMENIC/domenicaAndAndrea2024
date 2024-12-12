
package com.mycompany.domenicaandandrea2024;

  public class Compras {
    private static final double IVA = 0.12
         public void  mostrarDetalleLibro(Libro libro){
        var precioConIva = libro.getPrecio() + (libro.getPrecio() * IVA);
        System.out.println("Libro: " + libro.getNombre());
        System.out.println("Categoría: " + libro.getGenero());
        System.out.println("Precio (sin IVA): $" + libro.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);     
         }
         public void mostrarClientesYLibro(Clientes clientes, Libro libro) {
        double precioConIva = libro.getPrecio() + (libro.getPrecio() * IVA);
        System.out.println("Clientes: " + clientes.getNombre());
        System.out.println("Producto comprado: " + libro.getNombre());
        System.out.println("Categoría: " + libro.getGenero());
        System.out.println("Precio (sin IVA): $" + libro.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);
}
}
