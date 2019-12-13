package examen2_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class VideoAdmi {
    private ArrayList<Video> listasvideos = new ArrayList();
    private File archivo = null;
    
    public VideoAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<Video> getListavid() {
        return listasvideos;
    }

    public void setListavid(ArrayList<Video> listamsdm) {
        this.listasvideos = listamsdm;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setVid(Video a){
        listasvideos.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listasvideos = new ArrayList();
            Video temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Video) objeto.readObject()) != null) {
                        listasvideos.add(temp);
                    }
                } catch (EOFException e) {
                    
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
            for (Video t : listasvideos) {
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
