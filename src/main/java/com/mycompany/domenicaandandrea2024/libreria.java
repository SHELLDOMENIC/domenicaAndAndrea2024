
package com.mycompany.domenicaandandrea2024;


public class libreria {

     
    public static void main(String[] args) {
        Clientes cliente = new Clientes("Bianca Luciana");
        

        // Crear productos con sus categorías
        Libro Ficcion = new Libro("Ficcion", 2.50, Genero.FICCION);
        Libro Educativo = new Libro("Pastel", 3.75, Genero.EDUCATIVO);

        // Crear un pedido
        Compras compras = new Compras();

        // Mostrar los detalles de los productos con IVA
        compras.mostrarDetalleLibro(Ficcion);
        compras.mostrarDetalleLibro(Educativo);

        // Mostrar la relación entre el cliente y los productos
        compras.mostrarClientesYLibro(cliente, Ficcion);
        
    }
    
}
