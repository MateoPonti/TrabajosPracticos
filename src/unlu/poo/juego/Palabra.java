package unlu.poo.juego;

public class Palabra {

    String palabra;

    public int calcularPuntaje(){
        Character[] letrasEspeciales = { 'k', 'z', 'x', 'y', 'w', 'q' };
        int puntos=palabra.length();
        for (char caracter : palabra.toCharArray()) {
            if (estaEn(caracter,letrasEspeciales)){
                puntos++;
            }
        }
        return puntos;
    }


    private boolean estaEn(char val , Character[] letrasEspeciales) {
        boolean encontrado=false;
        int i=0;
        while (!encontrado && i< letrasEspeciales.length ){
            if (letrasEspeciales[i]==val){encontrado=true;}
            i++;
        }
        return encontrado;
    }
}
