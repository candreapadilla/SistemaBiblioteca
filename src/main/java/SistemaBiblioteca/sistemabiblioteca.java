/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaBiblioteca;

import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class sistemabiblioteca {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here   
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n===== SISTEMA BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Actualizar libro");
            System.out.println("5. Eliminar libro");
            System.out.println("0. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:

                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Genero: ");
                    String genero = sc.nextLine();

                    System.out.print("Año Publicacion: ");
                    int anio = sc.nextInt();

                    System.out.print("Disponible (true/false): ");
                    boolean disponible = sc.nextBoolean();
                    sc.nextLine();

                    Libro libro = new Libro(isbn, titulo, autor, genero, anio, disponible);

                    biblioteca.registrarLibro(libro);

                    break;
                case 2:
                    biblioteca.listarLibros();
                    break;
                case 3:

                    System.out.print("Ingrese ISBN a buscar: ");
                    String buscar = sc.nextLine();

                    Libro encontrado = biblioteca.buscarLibro(buscar);

                    if(encontrado != null){
                        System.out.println(encontrado);
                    }else{
                        System.out.println("Libro no encontrado");
                    }

                    break;
                case 4:

                    System.out.print("ISBN del libro a actualizar: ");
                    String actualizar = sc.nextLine();

                    biblioteca.actualizarLibro(actualizar);

                    break;
                case 5:

                    System.out.print("ISBN del libro a eliminar: ");
                    String eliminar = sc.nextLine();

                    biblioteca.eliminarLibro(eliminar);

                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 0);
    }
}
