package mx.itson.itsonoro.interfaces;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import mx.itson.itsonoro.entidades.*;

public interface IGUI {
    
    public void displayUsername(Usuario usuario, JLabel user);
    public void actualizarListaCursos(JList lista, Usuario usuario);
    public void actualizarListas(JList listaTarea, JList listaAlumno, Curso curso);
    public void displayAsignacion(JLabel nombre, JLabel comentario, JLabel valor, JLabel fecha, JLabel entrega, Asignacion asignacion);
    public void actualizarEntregas(JList listaEntrega, Asignacion asignacion);
    
}
