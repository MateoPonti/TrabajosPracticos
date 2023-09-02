package unlu.poo.juego;

import java.util.ArrayList;

public class Jugador {
    private ArrayList<Palabra> palabras;

    public Jugador(){
        palabras=new ArrayList<Palabra>();
    }
    public void agregarPalabra(Palabra palabra){
        palabras.add(palabra);
    }

    public int calcularPuntos(){
        int puntos=0;
        for (Palabra palabra:palabras){
            puntos+=palabra.calcularPuntaje();
        }
        return puntos;
    }
}
