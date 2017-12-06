package mx.itson.itsonoro.implementacion;
// by Arkuz

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import mx.itson.itsonoro.entidades.*;
import mx.itson.itsonoro.interfaces.IGUI;

public class GUI implements IGUI {
    
    @Override
    public void displayUsername(Usuario usuario, JLabel user) {
        user.setText(usuario.getNombre());
    }

    @Override
    public void actualizarListaCursos(JList lista, Usuario usuario) {
        DefaultListModel modeloLista = new DefaultListModel();
        for (Curso c : usuario.getCursos()) {
            modeloLista.addElement(c.getNombre());
        }
        lista.setModel(modeloLista);
    }

    @Override
    public void actualizarListas(JList listaTarea, JList listaAlumno, Curso curso) {
        DefaultListModel modeloLista = new DefaultListModel();
        DefaultListModel modeloLista2 = new DefaultListModel();
        for (Asignacion a : curso.getAsignaciones()) {
            modeloLista.addElement(a.getNombre());
        }
        listaTarea.setModel(modeloLista);
        for (Usuario u : curso.getParticipantes()) {
            modeloLista2.addElement(u.getNombre());
        }
        listaAlumno.setModel(modeloLista2);
    }

    @Override
    public void displayAsignacion(JLabel nombre, JLabel comentario, JLabel valor, JLabel fecha, JLabel entrega, Asignacion asignacion) {
        nombre.setText(asignacion.getNombre());
        comentario.setText(asignacion.getComentarios());
        valor.setText(String.valueOf(asignacion.getValor()));
        fecha.setText(asignacion.getFecha().toString());
        entrega.setText(asignacion.getFechadeentrega().toString());
    }

    @Override
    public void actualizarEntregas(JList listaEntrega, Asignacion asignacion) {
        DefaultListModel modeloLista = new DefaultListModel();
        for (Entrega e : asignacion.getEntrega()) {
            modeloLista.addElement(e.getUsuario().getNombre());
        }
        listaEntrega.setModel(modeloLista);
    }

}
