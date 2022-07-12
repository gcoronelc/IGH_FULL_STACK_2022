
package Agregacion;

import java.util.List;

class Biblioteca {

    private final List<Libro> books;

    Biblioteca(List<Libro> books) {
        this.books = books;
    }

    public List<Libro> getTotalLibrosBiblioteca() {

        return books;
    }

}
