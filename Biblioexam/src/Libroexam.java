public class Libroexam {

 public String libro;
 public Autorexam autor;
 public int anio;
 private boolean favorito;

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Autorexam getAutor() {
        return autor;
    }

    public void setAutor(Autorexam autor) {
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

    public Libroexam(String libro, int anio) {
        this.libro = libro;
        this.anio = anio;

    }

    public Libroexam(String libro, Autorexam autor, int anio) {
        this.libro = libro;
        this.autor = autor;
        this.anio = anio;
    }
}
