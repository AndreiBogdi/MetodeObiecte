public class Main {
    public static void main(String[] args){
        System.out.println("Rezultatul adunarii este:"+ adunare(2,3));
        System.out.println("Rezultatul scaderii este:"+ scadere(5,3));
        System.out.println("Rezultatul inmultirii este:"+ inmultire(5,3));
        System.out.println("Rezultatul impartirii este:"+ impartire(5,3));
        System.out.println("Media celor 3 parametrii este:"+ medie(5,3,8));
        printMyName();
    }
    public static int adunare(int FirstNumber,int SecondNumber){
        return FirstNumber + SecondNumber;
    }
    public static int scadere(int FirstNumber, int SecondNumber){
        return FirstNumber - SecondNumber;
    }
    public static int inmultire(int FirstNumber, int SecondNumber){
        return FirstNumber * SecondNumber;
    }
    public static float impartire(float FirstNumber, float SecondNumber){
        return FirstNumber/SecondNumber;
    }
    public static void printMyName(){
        System.out.println("Hello \n Andrei");
    }
    public static float medie(float FirstNumber, float SecondNumber, float ThirdNumber){
        return (FirstNumber + SecondNumber+ ThirdNumber)/3;
    }

            }
