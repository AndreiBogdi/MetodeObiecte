import javax.swing.*;
import java.awt.*;

public class Main {
    public static int x = 3;
    public static int y = 3;
    public static float a = 5;
    public static float b = 8;
    public static float c = 3;
    public static float f = 20;
    private static Object ImageIcon;

    public static void main(String[] args){
        Metode met = new Metode();
        int resultscadere= met.scadere(x,y);
        int resultinmultire = met.inmultire(x,y);
        int resultadunare = met.adunare(x,y);
        float resultimpartire = met.impartire(x,y);
        float resultmedie = met.medie(a,b,c);
        String resultname = met.printMyName();
        float resultgrade = met.grade(f);
        System.out.println("Rezultatul adunarii 3+ 3 este"+ (resultadunare));
        System.out.println("Rezultatul scaderii 3-3 este"+ (resultscadere));
        System.out.println("Rezultatul inmultirii 3*3 este"+ (resultinmultire));
        System.out.println("Rezultatul impartirii 3/3 este"+ (resultimpartire));
        System.out.println("Media celor 3 parametrii este:"+ (resultmedie));
        System.out.println(resultname);
        System.out.println("20 grade celsius este:"+ (resultgrade) + "Fahrenheit"); //nu functioneaza corect
        System.out.println(ImageIcon);
    }
class ShowPicture {
        public static void main(String args[]){
            JFrame frame = new JFrame();
            ImageIcon icon = new ImageIcon("JavaLogo.png");//Am dat un search pe google pentru exercitiul 3,dar nu merge.
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
}

}
