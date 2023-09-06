package unlu.poo.juego;

import java.util.ArrayList;


// Es una clase Juego modo TEST deberia tener mas cosas
public class Juego {

    private  ArrayList<Jugador> jugadores;
    private Diccionario diccionario;




    public Juego(String[]  palabras){
        jugadores= new ArrayList<>();
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());

        diccionario=new Diccionario();

        inicializarDiccionario(palabras);


    }




    public  boolean agregarPalabraDiccionario(String palabra){
        if (diccionario.agregarPalabra(palabra)){
            return  true;
        }
        return  false;
    }


    public  boolean agregarPalabraJugador(String palabra, int jugador){
        if (diccionario.estaPalabra(palabra)){
            jugadores.get(jugador-1).agregarPalabra(palabra);
            return true;
        }
        return false;
    }


    private void inicializarDiccionario(String[] palabras){


        for (String palabra : palabras) {
            diccionario.agregarPalabra(palabra);
        }
    }
    public String getJugadores(){
        StringBuilder s= new StringBuilder();
        int i=1;
        s.append("Palabras de Jugadores"+"\n");
        for (Jugador p : jugadores){
            s.append("Jugador ").append(i).append("\n");
            s.append( p.getPalabras()).append("\n");
            i++;
        }
        return s.toString();
    }

    public String calcularGanador(){
        int puntajeJugador1=jugadores.get(0).calcularPuntos();
        int puntajeJugador2= jugadores.get(1).calcularPuntos();

        if (puntajeJugador1>puntajeJugador2){return "Ganador Jugador 1";}
        if (puntajeJugador1<puntajeJugador2){return "Ganador Jugador 2";}
        return "Empate";
    }


}
