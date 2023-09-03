package unlu.poo.juego;

import java.util.ArrayList;


// Es una clase Juego modo TEST deberia tener mas cosas
public class Juego {

    private  ArrayList<Jugador> jugadores;
    private Diccionario diccionario;


    public Juego(){
        jugadores=new ArrayList<Jugador>();
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());

        diccionario=new Diccionario();

        inicializarDiccionario();
    }




    public  boolean agregarPalabraDiccionario(String palabra){
        if (diccionario.estaPalabra(palabra)){
            diccionario.agregarPalabra(palabra);
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


    private void inicializarDiccionario(){
        String[] palabras = {
                "casa", "perro", "gato", "rojo", "verde", "azul", "sol", "luna", "montaña", "playa",
                "coche", "bicicleta", "manzana", "banana", "naranja", "libro", "computadora", "televisión", "música", "película",
                "amigo", "familia", "amor", "alegría", "tristeza", "felicidad", "cielo", "tierra", "agua", "fuego",
                "trabajo", "estudio", "vacaciones", "dinero", "comida", "bebida", "aire", "aire libre", "naturaleza", "ciudad",
                "arte", "cultura", "deporte", "juego", "avión", "tren", "autobús", "metro", "barco", "trenza",
                "guitarra", "fotografía", "reloj", "espejo", "flores", "bosque", "mariposa", "playa", "isla", "cascada",
                "desierto", "sombrero", "lápiz", "papel", "pintura", "cine", "teatro", "escenario", "risa", "sonrisa",
                "invierno", "verano", "primavera", "otoño", "lluvia", "nieve", "viento", "relámpago", "rayo", "tormenta",
                "fruta", "verdura", "carne", "pescado", "arroz", "pan", "leche", "queso", "helado", "pastel",
                "cuchillo", "tenedor", "cuchara", "plato", "vaso", "copa", "silla", "mesa", "sofá", "cama",
                "ventana", "puerta", "techo", "piso", "escalera", "espejo", "telefono", "computadora", "ratón", "teclado",
                "pantalla", "internet", "correo", "correo electrónico", "chat", "red social", "amistad", "amigo", "amiga", "enemigo",
                "hermano", "hermana", "padre", "madre", "abuelo", "abuela", "niño", "niña", "joven", "adulto",
                "viejo", "muerte", "vida", "sueño", "pesadilla", "canción", "baile", "pintura", "escultura", "dibujo", "arte",
                "historia", "geografía", "matemáticas", "ciencia", "física", "química", "biología", "astronomía", "planeta", "estrella",
                "luz", "color", "forma", "número", "letra", "palabra", "frase", "oración", "párrafo", "texto"
        };

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


}
