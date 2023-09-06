package unlu.poo.administradorEjercicios;

import unlu.poo.juego.Juego;

public class Ejercicio11 {

    public Ejercicio11(){

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
                "luz", "color", "forma", "número", "letra", "palabra", "frase", "oración", "párrafo", "texto","kiwi", "zapato", "xilófono", "yogur", "walrus", "queso", "quesadilla", "koala", "zebra"
        };
        Juego juegoAMedias= new Juego(palabras);



        juegoAMedias.agregarPalabraJugador("SOL",1);
        juegoAMedias.agregarPalabraJugador("Zebra",1);
        juegoAMedias.agregarPalabraJugador("kiWi",1);

        juegoAMedias.agregarPalabraJugador("SOL",2);
        juegoAMedias.agregarPalabraJugador("alegría",2);
        juegoAMedias.agregarPalabraJugador("banana",2);

        juegoAMedias.agregarPalabraJugador("P2323",2); // EJemplo de una palabra que no esta en Diccionario

        System.out.println(juegoAMedias.getJugadores());

        String ganador=juegoAMedias.calcularGanador();
        System.out.println("Resultado: ");
    }
}
