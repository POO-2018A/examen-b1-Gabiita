/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import autor.Autor;

/**
 *
 * @author ESFOT
 */
public class Libro {
private String Titulo;
private Autor autor;
private int anio;
private boolean favorito;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Libro(String Titulo, Autor autor, int anio, boolean favorito) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.anio = anio;
        this.favorito = favorito;
    }
   
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
