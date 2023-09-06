package unlu.poo.tarea;

import java.util.ArrayList;

public class Colaborador {
    private  ArrayList<Tarea> tareasFinalizadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;


    public Colaborador(String nombre){
        tareasFinalizadas= new ArrayList<>();
        this.nombre=nombre;
    }
    public void agregarTarea(Tarea tarea) {

        tareasFinalizadas.add(tarea);
    }

    public String getTareas() {
        StringBuilder tareasStr = new StringBuilder();
        int i=1;
        for (Tarea tarea: tareasFinalizadas){
             tareasStr.append(i).append("- ").append(tarea.mostrarDetallado()).append("\n");
            i++;
        }
        return tareasStr.toString();
     }


    @Override
    public String toString() {
        return nombre;
    }

    public boolean compararNombre(String colaborador){
        return this.nombre.equals(colaborador);
    }
}
