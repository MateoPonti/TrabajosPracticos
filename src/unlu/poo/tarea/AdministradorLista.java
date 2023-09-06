package unlu.poo.tarea;

import unlu.poo.juego.Palabra;
import unlu.poo.password.Password;

import java.time.LocalDate;
import java.util.ArrayList;

public class AdministradorLista {

    ArrayList<Tarea> tareas;


    public AdministradorLista(){
        tareas= new ArrayList<>();
    }


    public void crearTarea(String descripcion, Estado estado, Prioridad prioridad, LocalDate fechaLimite){
        crearTarea(descripcion,estado,prioridad,fechaLimite,null);
    }
    public void crearTarea(String descripcion, Estado estado, Prioridad prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        Tarea tarea= new Tarea(descripcion,estado,prioridad,fechaLimite,fechaRecordatorio);
        tareas.add(tarea);
    }

    public boolean finalizar(int i){
        int j=1;
        for (Tarea tarea: tareas){
            if (i==j) {
                if(tarea.finalizar()){return true;}
            }
            j++;
        }
        return false;
    }
    public  StringBuilder buscarTarea(String descripcion){
        StringBuilder tareasPorDescripcion = new StringBuilder();
        int i=1;
        for (Tarea tarea: tareas){
            if (tarea.esDescripcion(descripcion))
            {
                tareasPorDescripcion.append(i).append("- ").append(tarea).append(", Prioridad: ").append(tarea.getPrioridad()).append(", Fecha Limite: ").append(tarea.getFechaLimite().toString()).append("\n");
            }
            i++;
        }
        return tareasPorDescripcion;
    }



    public String getTareas(){
       return obtenerTareas(true);
    }
    public String getTareasNoVencidasOrdenadas(){
        ordenarTareas();
        return obtenerTareas(false);
    }

    private String obtenerTareas(boolean opcion){ // devuelve un string con todas las tareas o solo las que no estan vencidas segun el bolean
        ordenarTareas();
        StringBuilder tareasStr = new StringBuilder();
        int i=1;
        for (Tarea tarea: tareas){
            if ( opcion  || !tarea.estaVencida()){
                tareasStr.append(i).append("- ").append(tarea).append(", Prioridad: ").append(tarea.getPrioridad()).append(", Fecha Limite: ").append(tarea.getFechaLimite().toString()).append("\n");}
            i++;
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
