package unlu.poo.password;

import java.util.ArrayList;

public class AdmnistradorContra{

    private ArrayList<Password> contras= new ArrayList<Password>();



    public void agregarContra(int longitud){
        Password contra= new Password(longitud);
        contras.add(contra);
    }

    public String mostrarContras(){
        String contrasStr ="";
        for (Password contra: contras){
            contrasStr+=contra.toString()+"\n";
        }
        return contrasStr;
    }
}