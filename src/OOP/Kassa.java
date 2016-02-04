package OOP;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by Taavi Tilk on 30.01.2016.
 */
public class Kassa {
    private String kassapidajaNimi;
    private ArrayList<String> tooted = new ArrayList<>();
    private ArrayList<String> tooted2 = new ArrayList<>();

    Kassa(String kassapidaja) {
        kassapidajaNimi = kassapidaja;
    }

    public void lisaToode(String toode) {
        tooted.add(toode);
    }

    public String votaTooted() {
        return tooted.toString();
    }

    public int votaToodeteArv() {
        return tooted.size();
    }

    public String votaKassapidajaNimi() {
        return kassapidajaNimi;
    }

    public void eemaldaToode(String toode) {
        tooted2.add(toode);
    }
    public String votaTooted2() {
        return tooted2.toString();
    }
    public void kliendilPoleRaha() {
        System.out.println("Kliendil ei ole niipalju raha");
        tooted.removeAll(tooted2);


    }


}
