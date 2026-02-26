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
    
    public void listarLibros() {
        if(listaLibros.size() == 0){
            System.out.println("No hay libros registrados");
        }else{

            for(int i = 0; i < listaLibros.size(); i++){
                System.out.println(listaLibros.get(i));
            }

        }
    }
    public Libro buscarLibro(String isbn){

        for(int i = 0; i < listaLibros.size(); i++){

            if(listaLibros.get(i).getIsbn().equals(isbn)){
                return listaLibros.get(i);
            }

        }

        return null;
    }
}
 