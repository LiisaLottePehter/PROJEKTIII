import java.util.ArrayList;

public class Informaatika extends Küsimused2{
    public Informaatika(ArrayList<String> küsimused) {
        super(küsimused);
    }

    @Override
    public ArrayList<String> listid(ArrayList<Integer> vastused) {
        ArrayList<String> informaatika = new ArrayList<>();
        int vastuseidkokku = 0;
        if(vastused.get(vastuseidkokku) == 2)
            informaatika.add("2");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 3)
            informaatika.add("3");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 2)
            informaatika.add("2");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 2)
            informaatika.add("2");
        return informaatika;
    }

}

