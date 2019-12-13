package examen2_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CanalAdmi {
    private ArrayList<Canal> listascanal = new ArrayList();
    private File archivo = null;
    
    public CanalAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<Canal> getListaMsdm() {
        return listascanal;
    }

    public void setListaMsdm(ArrayList<Canal> listamsdm) {
        this.listascanal = listamsdm;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setMdm(Canal a){
        listascanal.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listascanal = new ArrayList();
            Canal temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Canal) objeto.readObject()) != null) {
                        listascanal.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Canal t : listascanal) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
