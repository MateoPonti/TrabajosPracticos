package unlu.poo.juego;

import java.util.ArrayList;

public class Jugador {
    private ArrayList<Palabra> palabras;

    public Jugador(){
        palabras=new ArrayList<Palabra>();
    }
    public void agregarPalabra(String palabra){
        palabras.add(new Palabra(palabra));
    }

    public int calcularPuntos(){
        int puntos=0;
        for (Palabra palabra:palabras){
            puntos+=palabra.calcularPuntaje();
        }
        return puntos;
    }


    public String getPalabras(){
        StringBuilder s= new StringBuilder();
        for (Palabra p : palabras){
            s.append(p.getPalabra()).append("\n");
        }
        return s.toString();
    }
}
