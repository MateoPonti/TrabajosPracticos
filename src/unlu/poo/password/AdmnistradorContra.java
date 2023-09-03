package unlu.poo.password;

import java.util.ArrayList;

public class AdmnistradorContra{

    private ArrayList<Password> contras= new ArrayList<Password>();



    public void agregarContra(int longitud){
        Password contra= new Password(longitud);
        contras.add(contra);
    }

    public String getContras(){
        StringBuilder contrasStr = new StringBuilder();
        for (Password contra: contras){
            contrasStr.append(contra.toString()).append("\n");
        }
        return contrasStr.toString();
    }
}