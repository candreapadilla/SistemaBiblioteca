/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBiblioteca;

import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class Biblioteca {
     private ArrayList<Libro> listaLibros;

    public Biblioteca() {
        listaLibros = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        listaLibros.add(libro);
    }
}
 