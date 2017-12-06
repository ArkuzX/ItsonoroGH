package mx.itson.itsonoro.implementacion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import mx.itson.itsonoro.entidades.Usuario;
import mx.itson.itsonoro.interfaces.IOperaciones;



public class Operaciones implements IOperaciones{
    
    
    
     @Override
    public void Agregar(List lista, Object obj) {
      
        lista.add(obj);
        
    }
    
    @Override
    public void CargarTxt(File archivo,List lista){
        
        
         lista.removeAll(lista);
         Usuario usuario;
         Gson gson = new Gson();

        try {

            FileInputStream entrada;

            entrada = new FileInputStream(archivo);
            String documento = "";
            int ascci;

            while ((ascci = entrada.read()) != -1) {

                char caracter = (char) ascci;
                documento += caracter;

            }

            if (documento.isEmpty()) {

                

            } else {

                String[] split = documento.split("_");

                for (String json : split) {

                    usuario = gson.fromJson(json, Usuario.class);

                    lista.add(usuario);

                }

            }

        } catch (Exception e) {
        }

        
        
    }

   

    @Override
    public void ToJson(List lista, File archivo) {
       
         try {

            Gson json = new GsonBuilder().setPrettyPrinting().create();
            //Gson json = new Gson();
            
            FileWriter w = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);

            for (Object p : lista) {

                String jeison = json.toJson(p);
                wr.write(jeison + "_");
                wr.append("");
            }

            wr.close();
            bw.close();

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "No Se Pudo crear el Archivo");

        }
        
    }

    @Override
    public void ValidarCorreo(List lista, Object obj, String correo, String contraseña) {
       
        
        
    }

}
    
      
        

        
    

  
    

