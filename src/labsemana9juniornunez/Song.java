/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsemana9juniornunez;

/**
 *
 * @author Junior Nuñez
 */
public class Song {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas;
    private int cantidadReviews;

    // Constructor 
    public Song(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.sumaEstrellas = 0;
        this.cantidadReviews = 0;
    }

    //GEEEEEEET
    public int getCode() {
        return codigo;
    }

    public String getName() {
        return nombre;
    }

    public double getPrice() {
        return precio;
    }

  // Añadir estrellas a la cancion si la cantidad está entre 0 y 5
    public boolean addStars(int estrellas) {
        if (estrellas >= 0 && estrellas <= 5) {
            sumaEstrellas += estrellas;
            cantidadReviews++;
            return true;
        } else {
            return false;
        }
    }

    // Calcular el rating promedio de la canción
    public double songRating() {
        if (cantidadReviews == 0) {
            return 0;
        }
        return (double) sumaEstrellas / cantidadReviews;
    }

    // Imprimir los detalles de la cancion
    public String toString() {
        return String.format("CODIGO: %d – NOMBRE: %s – PRECIO: %.2f – RATING: %.2f",
                codigo, nombre, precio, songRating());
    }
}

