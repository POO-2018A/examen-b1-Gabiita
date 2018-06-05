/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autor;

/**
 *
 * @author ESFOT
 */
public class Autor {

    public String nombre;    
    public String pais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return  "Nombre:" + nombre;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
