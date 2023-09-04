package unlu.poo.tarea;

import unlu.poo.juego.Palabra;
import unlu.poo.password.Password;

import java.util.ArrayList;

public class AdministradorLista {

    ArrayList<Tarea> tareas;


    public AdministradorLista(){
        tareas= new ArrayList<>();
    }



    public agregarTarea(String descripcion, ){

        Tarea tarea= new Tarea()
    }

    public finalizar(String descripcion){

    }
    public  buscarTarea(String descripcion){

        for (Tarea tarea: tareas){
            if (tarea.getDescripcion().equals(descripcion))
            {

            }
        }
        return null;
    }

    public String getTareas(){
        StringBuilder tareasStr = new StringBuilder();
        for (Tarea tarea: tareas){
            tareasStr.append(tarea.toString()).append("\n");
        }
        return tareasStr.toString();
    }


}
