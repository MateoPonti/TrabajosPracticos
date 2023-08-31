package unlu.poo.password;

import java.util.ArrayList;

public class AdmnistradorContra{

    private ArrayList<Password> contras= new ArrayList<Password>();



    public void agregarContra(int longitud){
        Password contra= new Password(longitud);
        contras.add(contra);
    }

    public void mostrarContras(){
        for (Password contra: contras){
            System.out.println(contra);
        }
    }
}