import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<String> loeküsimused(String failinimi){
        ArrayList<String> kõikküsimused = new ArrayList<>();
        File fail = new File(failinimi);
        try(Scanner sc = new Scanner(fail, "UTF-8")) {
            while(sc.hasNextLine()){
                String rida = sc.nextLine();
                String[] osad = rida.split(" - ");
                kõikküsimused.add(osad[0]);
            }
        }catch (IOException e) {
            throw new RuntimeException("Faili " + failinimi + " ei leitud.");
        }
    return kõikküsimused;
    }

    public static void main(String[] args) {
        ArrayList<String> loetud = loeküsimused("punktid.txt");
        Matemaatika matemaatika = new Matemaatika(loetud);
        Majandus majandus = new Majandus(loetud);
        Informaatika informaatika = new Informaatika(loetud);
        Küsimused2 küsimused = new Küsimused2(loetud);
        System.out.println(" ");
        System.out.println("Igale küsimusele vastata numbritega vahemikus 1-3, vastavalt sellele, mis tundub kõige sobilikum");
        System.out.println(" ");
        ArrayList<Integer> vastused = küsimused.teeTest(loetud);

        ArrayList<String> matemaatikavastused = matemaatika.listid(vastused);
        ArrayList<String> informaatikavastused = informaatika.listid(vastused);
        ArrayList<String> majandusevastused = majandus.listid(vastused);

        if(matemaatikavastused.size() > majandusevastused.size() && matemaatikavastused.size()>informaatikavastused.size()){
            System.out.println("Sobid matemaatikasse");
            //System.out.println(matemaatikavastused.size()*100/loetud.size() + "% vastuseid sobitavad sind kõige paremini matemaatikasse.");
            System.out.println(matemaatika.protsendid(matemaatikavastused, loetud));

        }
        else if(majandusevastused.size() > matemaatikavastused.size() && majandusevastused.size() > informaatikavastused.size()){
            System.out.println("Sobid majandusse");
            System.out.println(majandus.protsendid(majandusevastused, loetud));

        }

        else if(informaatikavastused.size() > majandusevastused.size() && informaatikavastused.size() >matemaatikavastused.size()){
            System.out.println("Sobid informaatikasse");
            System.out.println(informaatika.protsendid(informaatikavastused, loetud));

        }


        //praegu nii aga võiks äkki lisaküsimuse küsida
        else if(matemaatikavastused.size() == majandusevastused.size()){
            System.out.println("Sobid nii majandusse kui matemaatikasse");
            System.out.println(majandus.protsendid(majandusevastused, loetud));
            System.out.println(matemaatika.protsendid(matemaatikavastused, loetud));
        }

        else if(matemaatikavastused.size() == informaatikavastused.size()){
            System.out.println("Sobid nii informaatikasse kui matemaatikasse");
            System.out.println(informaatika.protsendid(informaatikavastused, loetud));
            System.out.println(matemaatika.protsendid(matemaatikavastused, loetud));
        }
        else if(informaatikavastused.size() == majandusevastused.size()){
            System.out.println("Sobid nii informaatikasse kui majandusse");
            System.out.println(informaatika.protsendid(informaatikavastused, loetud));
            System.out.println(majandus.protsendid(majandusevastused, loetud));


        }

    }

}
