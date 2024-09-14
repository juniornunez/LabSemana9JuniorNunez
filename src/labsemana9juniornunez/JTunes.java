/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsemana9juniornunez;

/**
 *
 * @author Junior Nuñes
 */
public class JTunes {
    private Song[] canciones;
    private int maxCanciones;

    // Constructor que inicializa el arreglo de canciones
    public JTunes(int maxCanciones) {
        this.maxCanciones = maxCanciones;
        this.canciones = new Song[maxCanciones];
        
    }

    // Añadir una canción al arreglo si el código es único
    public boolean addSong(int codigo, String nombre, double precio) {
        if (searchSong(codigo) != null) {
            return false;
        }

        // Buscar una posición libre en el arreglo
        for (int i = 0; i < maxCanciones; i++) {
            if (canciones[i] == null) {
                canciones[i] = new Song(codigo, nombre, precio);
                return true;
            }
        }

        // Si no hay espacio libre
        return false;
    }

    // Buscar una canción por su código
    public Song searchSong(int codigo) {
        for (Song song : canciones) {
            if (song != null && song.getCode() == codigo) {
                return song;
            }
        }
        return null; // Retornar null si no se encuentra la canción
    }

    // Calificar una canción existente
    public boolean rateSong(int codigo, int estrellas) {
        Song song = searchSong(codigo);
        if (song != null) {
            return song.addStars(estrellas);
        }
        return false;
    }

    // Imprimir todas las canciones almacenadas en el arreglo
    public String printSongs() {
        StringBuilder sb = new StringBuilder();
        for (Song song : canciones) {
            if (song != null) {
                sb.append(song.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
