package unlu.poo.tarea;

import unlu.poo.juego.Palabra;
import unlu.poo.password.Password;

import java.util.ArrayList;

public class AdministradorLista {

    ArrayList<Tarea> tareas;


    public AdministradorLista(){
        tareas= new ArrayList<>();
    }



    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }

    public boolean finalizar(String descripcion){
        for (Tarea tarea: tareas){
            if (tarea.esDescripcion(descripcion)) {
                if(tarea.finalizar()){return true;}
            }
        }
        return false;
    }
    public  StringBuilder buscarTarea(String descripcion){
        StringBuilder tareasPorDescripcion = new StringBuilder();
        for (Tarea tarea: tareas){
            if (tarea.esDescripcion(descripcion))
            {
                tareasPorDescripcion.append(tarea).append(", Prioridad: ").append(tarea.getPrioridad()).append(", Fecha Limite: ").append(tarea.getFechaLimite().toString()).append("\n");
            }
        }
        return tareasPorDescripcion;
    }



    public String getTareas(){
        ordenarTareas();
        StringBuilder tareasStr = new StringBuilder();
        for (Tarea tarea: tareas){
            if (!tarea.estaVencida()){tareasStr.append(tarea).append(", Prioridad: ").append(tarea.getPrioridad()).append(", Fecha Limite: ").append(tarea.getFechaLimite().toString()).append("\n");}
        }
        return tareasStr.toString();
    }




    private void ordenarTareas(){

        int i;
        boolean salir=false;

        Tarea tarea1;
        Tarea tarea2;


        while (!salir){
            salir=true;
            i=1;
            while (i<tareas.size()){
                tarea1=tareas.get(i);
                tarea2=tareas.get(i-1);
                tarea1.toString(); // actualiza la prioridad en caso de que este por vencer
                tarea2.toString();// actualiza la prioridad en caso de que este por vencer

                if (tarea1.getPrioridad().ordinal()>tarea2.getPrioridad().ordinal()){
                    tareas.set(i,tarea2);
                    tareas.set(i-1,tarea1);
                    salir=false;
                }
                if (tarea1.getPrioridad().ordinal()==tarea2.getPrioridad().ordinal()){
                        if (tarea1.getFechaLimite().isBefore(tarea2.getFechaLimite())){
                            tareas.set(i,tarea2);
                            tareas.set(i-1,tarea1);
                            salir=false;
                        }
                }

                i++;
            }

        }
    }


}
