import java.applet.Applet;
import java.awt.*;



public class Opdracht64 extends Applet {

    double som1, som2, som3, som4, som5, som6,som8, som7;


    public  void init() {
        som1 = 5.9;
        som2 = 6.3;
        som3 = 6.9;
        som4 = som1 + som2 + som3;
        som5 = som4 / 3;
        som8 = som5 * 10;
        som6 = (int) som8;
        som7 = som6 / 10;
    }
    public void paint(Graphics g) {
        g.drawString("Afgerond kis het  " + som7,30,100);



    }
}