
public class Autorexam {

    public String nombre;
    public String pais;
    public Libroexam [] libro;
    static int contador;
    static int contador2;


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

    public Libroexam[] getLibro() {
        return libro;
    }

    public void setLibro(Libroexam[] libro) {
        this.libro = libro;
    }

    public Autorexam(String nombre, String pais, Libroexam[] libro) {
        this.nombre = nombre;
        this.pais = pais;
        this.libro = libro;
    }

    @Override
    public String toString() {

           String envio= "Nombre:" + nombre+
                "Pais: " + pais ;

           envio += this.libro[contador2];

           return envio;

    }
}
