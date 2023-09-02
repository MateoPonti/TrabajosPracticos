package unlu.poo.password;

import java.util.Random;

public class Password {
    private int longitud = 8;
    private String contra;
    public Password(){
    this(8);
    }
    public Password(int longitud){
        setLongitud(longitud);
    }

    public boolean setLongitud(int longValor){
        boolean longitudValida=false;
        if (longValor>0){
            this.longitud=longValor;
            longitudValida=true;
        }
        crearContra();
        return  longitudValida;
    }


    private void crearContra(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contra= new StringBuilder();
        Random random = new Random();
        int indice;
        char caracter;
        for (int i=0;i<this.longitud;i++){
            indice = random.nextInt(caracteres.length());
            caracter = caracteres.charAt(indice);
            contra.append(caracter);
        }
        this.contra= contra.toString();
    }



    public boolean esContraFuerte(){
        int cantMayusculas=0;
        int cantNumeros=0;
        int cantMinusculas=0;
        for (int i=0; i<longitud;i++){
            if (Character.isUpperCase(contra.charAt(i))){cantMayusculas++;};
            if (Character.isLowerCase(contra.charAt(i))){cantMinusculas++;};
            if (Character.isDigit(contra.charAt(i))){cantNumeros++;}
        }
        return cantMayusculas > 2 && cantMinusculas > 1 && cantNumeros > 1;
    }


    @Override
    public String toString() {
        String contra= "<"+this.contra+"> ";
        if (esContraFuerte()){return  contra+"- Fuerte";}
        return  contra+"- Débil";
    }

    public void regenerarContraFuerte(){
        if (longitud<7){this.longitud=7;}// longitud minima que sea fuerte 3 mayusculas 2 minusculas 2 numeros = 7
        while (!esContraFuerte()){
            crearContra();
        }
    }

    public String getContra(){
        return contra;
    }

    public int getLongitud(){
        return longitud;
    }
}
