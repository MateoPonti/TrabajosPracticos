package unlu.poo.tarea;



import java.time.LocalDate;
import java.util.ArrayList;

public class AdministradorLista {

    ArrayList<Tarea> tareas;
    ArrayList<Colaborador> colaboradores;


    public AdministradorLista(){
        tareas= new ArrayList<>();
        colaboradores= new ArrayList<>();
    }


    public void crearTarea(String descripcion, Prioridad prioridad, LocalDate fechaLimite){
        crearTarea(descripcion,prioridad,fechaLimite,null);
    }
    public void crearTarea(String descripcion, Prioridad prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        Tarea tarea= new Tarea(descripcion,prioridad,fechaLimite,fechaRecordatorio);
        tareas.add(tarea);
    }

    public boolean finalizar(int i, String nombre){
        int j=1;
        int posicionColaborador=buscarColaboradores(nombre);
        boolean buscarColaborador=posicionColaborador!=-1;
        if (buscarColaborador){
        for (Tarea tarea: tareas){
            if (i==j) {
                return tarea.finalizar(colaboradores.get(posicionColaborador));

            }
            j++;
        }
        }
        return false;
    }
    public  StringBuilder buscarTarea(String descripcion){
        StringBuilder tareasPorDescripcion = new StringBuilder();
        int i=1;
        for (Tarea tarea: tareas){
            if (tarea.esDescripcion(descripcion))
            {
                tareasPorDescripcion.append(i).append("- ").append(tarea.mostrarDetallado()).append("\n");
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
                tareasStr.append(i).append("- ").append(tarea.mostrarDetallado()).append("\n");
            i++;
        }}
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
                tarea1.estaPorVencer(); // actualiza la prioridad en caso de que este por vencer
                tarea2.estaPorVencer();// actualiza la prioridad en caso de que este por vencer

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

    public boolean agregarColaborador(String nombre){
        boolean estaColaborador= buscarColaboradores(nombre)!=-1;
        if (!estaColaborador){colaboradores.add(new Colaborador(nombre));}
        return !estaColaborador;
    }

    public boolean eliminarColaborador(String nombre){
        int posicion= buscarColaboradores(nombre);
        if (posicion!=-1){
            colaboradores.remove(posicion);
            return true;
        }
        return false;
    }

    private int buscarColaboradores(String nombre){
        int posicion=0;
        for (Colaborador c:colaboradores){
            if (c.compararNombre(nombre)){return  posicion;}
            posicion++;
        }
        return -1;
    }
    
    public String mostrarTareasPorColaborador(String nombre){
        StringBuilder colaboradorString=new StringBuilder();
        for (Colaborador c:colaboradores){
            if (c.compararNombre(nombre)){
                colaboradorString.append("Nombre del Colaborador: ").append(c).append("\n").append(c.getTareas());
            }
        }
        return colaboradorString.toString();
    }

    public String getColaboradores(){
        StringBuilder colaboradorString=new StringBuilder();
        colaboradorString.append("Colaboradores").append("\n");
        for (Colaborador c:colaboradores){
            colaboradorString.append(c).append("\n");
        }
        return colaboradorString.toString();
    }



}
