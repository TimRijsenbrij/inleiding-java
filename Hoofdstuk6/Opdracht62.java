import java.applet.Applet;
import java.awt.*;


public class Opdracht62 extends Applet {



    int somUur;
    int somDag;
    int somJaar;
    public void paint (Graphics g){


        somUur = 60*60;
        somDag = 60*60*24;
        somJaar = 60*60*24*365;


        setBackground(Color.white);

            g.drawString("In een uur zitten " + somUur + " seconden", 100, 100);
            g.drawString("In een dag zitten " + somDag + " seconden", 100, 125);
            g.drawString("In een jaar zitten " + somJaar + " seconden", 100, 150);















    }

}
