package examen2_alessandroreyes;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Video> videos = new ArrayList();
    private int dura;

    public Playlist() {
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public int getDura() {
        return dura;
    }

//    public void setDura(int dura) {
//        this.dura = dura;
//    }

    @Override
    public String toString() {
        return "videos=" + videos + ", dura=" + dura;
    }
    
}
