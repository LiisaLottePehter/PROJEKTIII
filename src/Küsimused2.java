import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Küsimused2 {
    private ArrayList<String> küsimused;
    public Küsimused2(ArrayList<String> küsimused) {
        this.küsimused = küsimused;
    }
    public  ArrayList<String> listid(ArrayList<Integer> küsimused){
        return null;
    }
    public ArrayList<Integer> teeTest(ArrayList<String> küsimused) {
        ArrayList<Integer> vastused= new ArrayList<>();
        int tulemus = 0;
        Scanner keyboardInput = new Scanner(System.in);

        //Läbib küsimuste listi ükshaaval
        for (int i = 0; i < küsimused.size(); i++) {
            //Prindib küsimuse
            System.out.println(küsimused.get(i));
            //Määrab vastuse inputiks, mida sisestatakse. Lisab tulemusele sisestuse kui on õiges vahemikus.
            int vastus = Integer.parseInt(keyboardInput.nextLine());
            if (vastus >= 1 && vastus <= 3) {
                vastused.add(vastus);
                tulemus += vastus;
                //Kui ei ole õiges vahemikus siis läheb selle küsimuse juurde tagasi
            }
            else {
                System.out.println("Sisesta õige number palun");
                i--;
            }

        }
        return vastused;
    }

}

