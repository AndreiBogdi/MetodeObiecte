public class Main {
    public static int x = 3;
    public static int y = 3;
    public static float a = 5;
    public static float b = 8;
    public static float c = 3;
    public static void main(String[] args){
        Metode met = new Metode();
        int resultscadere= met.scadere(x,y);
        int resultinmultire = met.inmultire(x,y);
        int resultadunare = met.adunare(x,y);
        float resultimpartire = met.impartire(x,y);
        float resultmedie = met.medie(a,b,c);
        String resultname = met.printMyName();
        System.out.println("Rezultatul adunarii este:"+ (resultadunare));
        System.out.println(resultscadere);
        System.out.println("Rezultatul inmultirii este:"+ (resultinmultire));
        System.out.println("Rezultatul impartirii este:"+ (resultimpartire));
        System.out.println("Media celor 3 parametrii este:"+ (resultmedie));
        System.out.println(resultname);
    }


            }
