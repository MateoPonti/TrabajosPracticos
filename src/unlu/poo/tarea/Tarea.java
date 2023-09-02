package unlu.poo.tarea;

import java.time.LocalDate;

public class Tarea {
    private Estado estado;
    private Prioridad prioridad;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    private LocalDate fechaFinalizacion;
    private String descripcion;



    public Tarea(String descripcion,Estado estado,Prioridad prioridad,LocalDate fechaLimite,LocalDate fechaRecordatorio){
        this.descripcion=descripcion;
        this.estado=estado;
        this.prioridad=prioridad;
        this.fechaLimite=fechaLimite;
        this.fechaRecordatorio=fechaRecordatorio;
    }
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void setFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public boolean estaCompleta() {
        return  this.estado==Estado.COMPLETA;
    }
    public boolean estaVencida() {
        return  ((this.estado==Estado.INCOMPLETA) && ( ((fechaLimite.isBefore(LocalDate.now())))));
    }

    @Override
    public String toString() {
        String res= "";
        if (estaVencida()){res+="(Vencida) ";}
        else {
         if ( fechaRecordatorio!=null && EstaPorVencer()){res+="(Por Vencer) ";}}
        
        res+=getDescripcion();
        return res;
    }



    public boolean EstaPorVencer() {
        if  (fechaRecordatorio.isBefore(LocalDate.now())){
            prioridad=Prioridad.ALTA;
            return  true;
        }
        return  false;
    }
}
