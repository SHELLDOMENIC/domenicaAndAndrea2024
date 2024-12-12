
package com.mycompany.domenicaandandrea2024;


public class Libro {
    private String nombre; 
    private double precio;
    private Genero genero;
    
    public Libro(String nombre,double precio,Genero genero){
     this.nombre=nombre;
     this.precio =precio;
     this.genero=genero;
    }
   public String getNombre(){
       return nombre;
   }

    public double getPrecio() {
        return precio;
    }

    public Genero getGenero() {
        return genero;
    }
    }

