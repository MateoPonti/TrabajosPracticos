package unlu.poo.juego;


public class Palabra {
    private String palabra;


    public Palabra(String palabra) {
        this.palabra=palabra.toLowerCase();
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
       return  palabra;
    }

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


    private boolean estaEn(char val , Character[] valores) {
        boolean encontrado=false;
        int i=0;
        while (!encontrado && i< valores.length ){
            if (Character.toLowerCase(val) == Character.toLowerCase(valores[i])){encontrado=true;}
            i++;
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return palabra;
    }

    
    public boolean equals(Palabra palabraComparar) {
        return palabra.equalsIgnoreCase(palabraComparar.getPalabra());
    }
}
