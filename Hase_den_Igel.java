public class Hase_den_Igel {
    public static void main (String []arags){
        double schritleangeHase = 10.8;
        double schritleangeIgel = 5.3;
        double vorsprung =270.0;

        double streckeHase = 0;
        double streckeIgel= vorsprung;
        int schritte = 0;

        while (streckeIgel >= streckeHase) {
            streckeHase= streckeHase + schritleangeHase;

            streckeIgel= streckeIgel + schritleangeIgel;
            schritte ++;
             System.out.println("Nach = "+ schritte +" schrietten: Hase= " + streckeHase + "cm und Igel =" + streckeIgel + "cm");

        }

    }

}
