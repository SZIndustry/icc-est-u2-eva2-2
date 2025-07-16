package controller;

import java.util.*;
import models.Book;

public class LibroController {
    private List<Book> libros;

    public LibroController(List<Book> libros) {
        this.libros = libros;
    }

    public List<Book> getLibrosOrdenadosYUnicos() {
        Set<String> vistos = new HashSet<>();
        
        return libros.stream()
            .sorted(Comparator.comparing(Book::getTitulo).reversed()
                .thenComparing(Book::getAnio))
            .filter(book -> {
                String clave = book.getTitulo() + "-" + book.getAnio();
                return vistos.add(clave); // solo añade si no estaba (evita duplicados)
            })
            .toList();
    }
}
