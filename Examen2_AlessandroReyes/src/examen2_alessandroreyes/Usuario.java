package examen2_alessandroreyes;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private Canal canal;
    private String user;
    private String contra;
    private ArrayList<Canal> suscritos = new ArrayList();
    private ArrayList<Playlist> listas = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String correo, Canal canal, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.canal = canal;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    
    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Canal> getSuscritos() {
        return suscritos;
    }

    public void setSuscritos(ArrayList<Canal> suscritos) {
        this.suscritos = suscritos;
    }

    public ArrayList<Playlist> getListas() {
        return listas;
    }

    public void setListas(ArrayList<Playlist> listas) {
        this.listas = listas;
    }

    @Override
    public String toString() {
        return user + ", canal=" + canal;
    }
    
}
