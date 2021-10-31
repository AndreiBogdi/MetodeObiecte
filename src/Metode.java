public class Metode {
    public static int adunare(int FirstNumber,int SecondNumber){
        int resultadunare = FirstNumber + SecondNumber;
        return resultadunare;
    }
    public static int scadere(int FirstNumber, int SecondNumber){
       int resultscadere= FirstNumber - SecondNumber;
        return resultscadere;
    }
    public static int inmultire(int FirstNumber, int SecondNumber){
        int resultinmultire = FirstNumber * SecondNumber;
        return resultinmultire;
    }
    public static float impartire(float FirstNumber, float SecondNumber){
        float resultimpartire = FirstNumber/SecondNumber;
        return resultimpartire;
    }
    public static String printMyName(){
        String resultname = "Hello \nAndrei Nica";
        return resultname;
    }
    public static float medie(float FirstNumber, float SecondNumber, float ThirdNumber){
        float resultmedie = (FirstNumber + SecondNumber+ ThirdNumber)/3;
        return resultmedie;
    }
    public static float grade(float f){
        float resultgrade = (5/9)*(f-32);
        return resultgrade;
    }
}
