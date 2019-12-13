package examen2_alessandroreyes;

import java.util.ArrayList;

public class Canal {
    private int suscriptores;
    private String nombre;
    private String Categoria;
    private int Numvideos;
    private int likesT;
    private int dislikes;
    private ArrayList<Video> videos = new ArrayList();

    public Canal() {
    }

    public Canal(int suscriptores, String nombre, String Categoria, int Numvideos, int likesT, int dislikes) {
        this.suscriptores = suscriptores;
        this.nombre = nombre;
        this.Categoria = Categoria;
        this.Numvideos = Numvideos;
        this.likesT = likesT;
        this.dislikes = dislikes;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getNumvideos() {
        return Numvideos;
    }

    public void setNumvideos(int Numvideos) {
        this.Numvideos = Numvideos;
    }

    public int getLikesT() {
        return likesT;
    }

    public void setLikesT(int likesT) {
        this.likesT = likesT;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "suscriptores=" + suscriptores + ", nombre=" + nombre;
    }
    
}
