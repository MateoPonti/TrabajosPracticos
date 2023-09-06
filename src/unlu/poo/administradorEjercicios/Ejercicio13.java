package unlu.poo.administradorEjercicios;

import unlu.poo.tarea.AdministradorLista;
import unlu.poo.tarea.Colaborador;
import unlu.poo.tarea.Estado;
import unlu.poo.tarea.Prioridad;

import java.time.LocalDate;

public class Ejercicio13 {
    public  Ejercicio13(){
        AdministradorLista lista = new AdministradorLista();





        lista.crearTarea("Ir al supermercado mañana", Prioridad.BAJA, LocalDate.of(2025,2,7),LocalDate.of(2024,11,3));
        lista.crearTarea("Consultar repuesto del auto", Prioridad.BAJA,LocalDate.of(2028,3,30),(LocalDate.now().minusDays(1)));
        lista.crearTarea("Ir al supermercado mañana", Prioridad.MEDIA,LocalDate.of(2027,1,6),LocalDate.of(2027,1,4));
        lista.crearTarea("Comprar pan", Prioridad.MEDIA,LocalDate.of(2026,5,5),LocalDate.of(24,10,7));
        lista.crearTarea("Ir a clases", Prioridad.ALTA,LocalDate.of(2022,12,8),LocalDate.of(2022,11,7));

        System.out.println(lista.getTareas());


        String colaborador1= "Juan";
        String colaborador2="Mateo";
        String colaborador3= "Tomas";


        lista.agregarColaborador(colaborador1);
        lista.agregarColaborador(colaborador2);
        lista.agregarColaborador(colaborador3);
        System.out.println();

        System.out.println(lista.getColaboradores());


        System.out.println(lista.getTareas());
        System.out.println();
        System.out.println("Mateo finaliza la tarea 1,2 y 3 ");
        lista.finalizar(1,colaborador2);
        lista.finalizar(2,colaborador2);
        lista.finalizar(3,colaborador2);

        System.out.println("Mostramos la lista realizado por el colaborador Mateo");
        System.out.println(lista.mostrarTareasPorColaborador(colaborador2));

        System.out.println("Se puede observar que la tarea 1 no pudo finalizarse por Mateo porque ya estaba vencida");

    }
}
