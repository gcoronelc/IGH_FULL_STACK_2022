package Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

    public static void main(String[] args) {
        Libro b1 = new Libro("Titulo 1", "Autor 1");
        Libro b2 = new Libro("Titulo 2", "Autor 2");
        List<Libro> books = new ArrayList<Libro>();
        books.add(b1);
        books.add(b2);
        Biblioteca library = new Biblioteca(books);
        List<Libro> bks = library.getTotalLibrosBiblioteca();
        for (Libro bk : bks) {

            System.out.println("Titulo : " + bk.titulo + " y "
                    + " Autor : " + bk.autor);
        }
    }
}
