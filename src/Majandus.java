import java.util.ArrayList;

public class Majandus extends Küsimused2{
    public Majandus(ArrayList<String> küsimused) {
        super(küsimused);
    }

    @Override
    public ArrayList<String> listid(ArrayList<Integer> vastused) {
        ArrayList<String> majandus = new ArrayList<>();
        int vastuseidkokku = 0;
        if(vastused.get(vastuseidkokku) == 1)
            majandus.add("1");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 1)
            majandus.add("1");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 3)
            majandus.add("3");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 3)
            majandus.add("3");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 1)
            majandus.add("1");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 1)
            majandus.add("1");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 3)
            majandus.add("3");
        vastuseidkokku++;
        if(vastused.get(vastuseidkokku) == 3)
            majandus.add("3");
        return majandus;
    }
}
