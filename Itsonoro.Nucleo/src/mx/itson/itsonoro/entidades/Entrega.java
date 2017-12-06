package mx.itson.itsonoro.entidades;


import java.io.File;
import java.time.*;
import mx.itson.itsonoro.enumeradores.EstadoEntrega;
public class Entrega {

private Usuario usuario;
private LocalDateTime fechadeentrega;
private EstadoEntrega estatus;
private File archivo;
private int calificacion;

    public Entrega() {
    }

    /**
     * 
     * @param usuario atributo que indica el usuario dueño de la entrega
     * @param fechadeentrega fecha en la que se entrego la tarea
     * @param estatus Enumerador que asigna un estado a la entrega ya se 
     * @param archivo
     * @param calificacion 
     */
    public Entrega(Usuario usuario, LocalDateTime fechadeentrega, EstadoEntrega estatus, File archivo, int calificacion) {
        this.usuario = usuario;
        this.fechadeentrega = fechadeentrega;
        this.estatus = estatus;
        this.archivo = archivo;
        this.calificacion = calificacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechadeentrega() {
        return fechadeentrega;
    }

    public void setFechadeentrega(LocalDateTime fechadeentrega) {
        this.fechadeentrega = fechadeentrega;
    }

    public EstadoEntrega getEstatus() {
        return estatus;
    }

    public void setEstatus(EstadoEntrega estatus) {
        this.estatus = estatus;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    


    
}
