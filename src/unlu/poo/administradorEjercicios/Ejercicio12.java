package unlu.poo.administradorEjercicios;

import unlu.poo.tarea.AdministradorLista;
import unlu.poo.tarea.Estado;
import unlu.poo.tarea.Prioridad;
import unlu.poo.tarea.Tarea;

import java.time.LocalDate;

public class Ejercicio12 {

    public  Ejercicio12(){
        AdministradorLista lista = new AdministradorLista();





        lista.crearTarea("Ir al supermercado mañana", Prioridad.BAJA,LocalDate.of(2025,2,7),LocalDate.of(2024,11,3));
        lista.crearTarea("Consultar repuesto del auto", Prioridad.BAJA,LocalDate.of(2028,3,30),(LocalDate.now().minusDays(1)));
        lista.crearTarea("Ir al supermercado mañana", Prioridad.MEDIA,LocalDate.of(2027,1,6),LocalDate.of(2027,1,4));
        lista.crearTarea("Comprar pan", Prioridad.MEDIA,LocalDate.of(2026,5,5),LocalDate.of(24,10,7));
        lista.crearTarea("Ir a clases", Prioridad.ALTA,LocalDate.of(2022,12,8),LocalDate.of(2022,11,7));

        System.out.println("Tareas de Test antes de su ordenamiento: ");
        System.out.println(lista.getTareas());


        System.out.println("Busco tarea por descripcion: \"Ir al supermercado mañana\"");
        System.out.println(lista.buscarTarea("Ir al supermercado mañana"));
        System.out.println();
        System.out.println("Muestro tareas sin vencimiento, ordenadas por prioridad (mas alta a mas baja) y fecha (menor a mayor)");
        System.out.println(lista.getTareasNoVencidasOrdenadas());
    }
}
