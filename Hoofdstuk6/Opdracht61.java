import java.applet.Applet;
import java.awt.*;



public class Opdracht61 extends Applet {
    int A, B, C, D;
    double som;


    public void paint (Graphics g){
        A = 1;
        B = 1;
        C = 1;
        D = 1;
        double som = 113 / (A + B + C + D);
        setBackground(Color.white);

        g.drawString("ieder moet betalen: " + som, 100, 100);

















    }


}
