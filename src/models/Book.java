package models;

public class Book {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Book [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + "]";
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     if (!(obj instanceof Book)) return false;
    //     Book book = (Book) obj;
    //     return id == empleado.id && name.equals(empleado.name);
    // }

    // @Override
    // public int hashCode() {
    //     int result = Integer.hashCode(id);
    //     result = 31 * result + name.hashCode();
    //     return result;
    // }

    // @Override
    // public int compareTo(Book otro) {
    //     if (otro.id  != this.id) {
    //         return Integer.compare(this.id, otro.id);
    //     }
        
    //     else {
    //         return this.name.compareTo(otro.name);
    //     }
    // }
}
