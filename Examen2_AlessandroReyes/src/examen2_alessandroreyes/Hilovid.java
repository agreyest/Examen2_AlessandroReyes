package examen2_alessandroreyes;

import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Hilovid extends Thread{
    private JProgressBar barra;
    private int segs;
    private boolean avanzar;
    private boolean vive;
    private JTextField tf;

    public Hilovid(JProgressBar barra, int segs, JTextField tf) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
        this.segs = segs;
        this.tf =tf;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getSegs() {
        return segs;
    }

    public void setSegs(int segs) {
        this.segs = segs;
    }
    
    
    public void run() {
        tf.setText("INicio");
        while (vive) {
            if (avanzar) {
                barra.setMaximum(segs);
                barra.setValue(barra.getValue()+1);
                
                if(barra.getValue() == 10){
                    tf.setText("COmo asiiiiiiii");
                }
            }//fin if
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {

            }
        }
        
    }
}
