package mx.itson.itsonoro.interfaces;

import java.io.*;
import java.util.*;


public interface IOperaciones {
    
    public void Agregar(List lista,Object obj);
    public void CargarTxt(File archivo,List lista);
    public void ToJson(List lista, File archivo);
    public void ValidarCorreo(List lista, Object obj,String correo,String contraseña);
      
    
}
