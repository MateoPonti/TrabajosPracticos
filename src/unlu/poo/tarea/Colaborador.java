package unlu.poo.tarea;

import java.util.ArrayList;

public class Colaborador {
    private  ArrayList<Tarea> tareasFinalizadas;



    public Colaborador(){
        tareasFinalizadas= new ArrayList<>();
    }
    public void agregarTarea(Tarea tarea) {
        tareasFinalizadas.add(tarea);
    }

    public String getTareas() {
        StringBuilder tareasStr = new StringBuilder();
        int i=1;
        for (Tarea tarea: tareasFinalizadas){
            if (! tarea.estaVencida()){
                tareasStr.append(i).append("- ").append(tarea.mostrarDetallado()).append("\n");
            i++;
        }

    }
        return tareasStr.toString();
    }

}
