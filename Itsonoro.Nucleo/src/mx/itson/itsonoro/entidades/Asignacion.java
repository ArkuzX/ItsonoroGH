package mx.itson.itsonoro.entidades;


import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Asignacion {


private String nombre;
private Date fechadeentrega;
private Date fecha;
private String comentarios;
private double valor;
List<Entrega> entrega = new ArrayList<Entrega>();

    public Asignacion() {
    }

    /**
     * 
     * @param nombre Funcionara como el nombre de la Asignacion Realizada
     * @param fechadeentrega Parametro que representa la fecha de entrega de la asignacion
     * @param comentarios parametro que recibira los comentarios echos por el usuario acerca de la entrega
     * @param Valor Parametro que representa el valor en puntos de la asigancion
     * @param entrega Sera la entrega cargada por el alumno "ONTIME" o "LATE"
     */
    public Asignacion(String nombre, String comentarios, double valor) {
        this.nombre = nombre;
        this.fecha = new Date();
        this.comentarios = comentarios;
        this.valor = valor;
    }

    public List<Entrega> getEntrega() {
        return entrega;
    }

    public void setEntrega(List<Entrega> entrega) {
        this.entrega = entrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadeentrega() {
        return fechadeentrega;
    }

    public void setFechadeentrega(Date fechadeentrega) {
        this.fechadeentrega = fechadeentrega;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
