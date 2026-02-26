/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaBiblioteca;

/**
 *
 * @author Camil
 */
public class sistemabiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Biblioteca biblioteca = new Biblioteca();

    Libro libro1 = new Libro(
            "001", 
            "Java Basico",
            "Carlos Perez",
            "Programacion",
            2024,
            true
    );

    biblioteca.registrarLibro(libro1);

    System.out.println("Libro registrado correctamente");
    }
     
}
