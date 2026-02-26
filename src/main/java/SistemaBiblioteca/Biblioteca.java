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
    
    public void actualizarLibro(String isbn){

        Libro libro = buscarLibro(isbn);

        if(libro == null){
            System.out.println("Libro no encontrado");
            return;
        }

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n--- ACTUALIZAR LIBRO ---");
            System.out.println("1. Titulo");
            System.out.println("2. Autor");
            System.out.println("3. Genero");
            System.out.println("4. Año Publicacion");
            System.out.println("5. Disponibilidad");
            System.out.println("6. Actualizar TODO");
            System.out.println("0. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch(opcion){

                case 1:
                    System.out.print("Nuevo titulo: ");
                    libro.setTitulo(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Nuevo autor: ");
                    libro.setAutor(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Nuevo genero: ");
                    libro.setGenero(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Nuevo año: ");
                    libro.setAniopublicacion(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Disponible (true/false): ");
                    libro.setDisponible(sc.nextBoolean());
                    break;

                case 6:
                    System.out.print("Nuevo titulo: ");
                    libro.setTitulo(sc.nextLine());

                    System.out.print("Nuevo autor: ");
                    libro.setAutor(sc.nextLine());

                    System.out.print("Nuevo genero: ");
                    libro.setGenero(sc.nextLine());

                    System.out.print("Nuevo año: ");
                    libro.setAniopublicacion(sc.nextInt());

                    System.out.print("Disponible (true/false): ");
                    libro.setDisponible(sc.nextBoolean());
                    break;

                case 0:
                    System.out.println("Actualizacion finalizada");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        }while(opcion != 0);
    }
    
    public void eliminarLibro(String isbn) {

        for (int i = 0; i < listaLibros.size(); i++) {

            if (listaLibros.get(i).getIsbn().equals(isbn)) {

                listaLibros.remove(i);
                System.out.println("Libro eliminado correctamente");
                return;
            }
        }

        System.out.println("Libro no encontrado");
    }
}
 