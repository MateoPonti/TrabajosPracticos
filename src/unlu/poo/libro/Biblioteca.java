package unlu.poo.libro;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros;
    public Biblioteca(){
        libros=new ArrayList<>();
    }

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public  int contarPrestados(){
        int total=0;
        for(Libro l: libros){
            total+=l.getNumEjemplaresPrestados();
        }
        return total;
    }


    public StringBuilder getLibrosAutor(String autor){
        StringBuilder ls= new StringBuilder();
        for (Libro l: libros){
            if (l.esAutor(autor))
                ls.append(l).append("\n");
        }
        return ls;
    }



}