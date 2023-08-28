package unlu.poo.administradorEjercicios;

import unlu.poo.libro.Libro;

public class Ejercicio6 {

    public Ejercicio6() {

        Libro libro= new Libro("Juan Enrique", "Remolino", 162,10,0);
        Libro libro2= new Libro("Maria Posiert", "Mi planta de naranja lima", 232,1,0,"13233311");



        System.out.println(libro);
        System.out.println();
        System.out.println();
        System.out.println(libro2);
        System.out.println();
        System.out.println();
        if (libro.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println("El libro "+libro.getTitulo()+" tiene mas paginas que el libro "+libro2.getTitulo());
        }
        else {
            System.out.println("El libro "+libro2.getTitulo()+" tiene mas paginas que el libro "+libro.getTitulo());
        }

        System.out.println();
        System.out.println("Prestamos el libro 1 que tiene 10 ejemplares disponibles");
        libro.prestarLibro();
        System.out.println();
        System.out.println("El total de ejemplares disponibles del libro 1 es : "+ libro.getNumEjemplares()+" y el prestado es: "+libro.getNumEjemplaresPrestados());
        System.out.println();
        libro2.prestarLibro();
        System.out.println("El total de ejemplares disponibles del libro 2 es : "+ libro2.getNumEjemplares()+" y el prestado es: "+libro2.getNumEjemplaresPrestados());
        System.out.println();
        System.out.println("Se ve que en el segundo caso al solo tener 1 libro disponible no lo presta");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Total de libros prestados: "+libro.getNumEjemplaresPrestadosTotal());
    }

}
