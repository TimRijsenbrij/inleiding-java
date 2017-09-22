import java.applet.Applet;
import java.awt.*;

public class Opdracht63 extends Applet {
    public void paint (Graphics g){
        int IntOverFlow;


    IntOverFlow = 2147483647+50;


        g.drawString("Door het maximum getal te nemen..." ,50, 100);
        g.drawString("... en er nog meer bij te doen...", 50, 120);
        g.drawString("... zal het getal zich omdraaien naar een min getal...", 50, 140);
        g.drawString("... en zo krijg je...", 50, 160);
        g.drawString(IntOverFlow + "!!!", 50, 180);
    }


}
