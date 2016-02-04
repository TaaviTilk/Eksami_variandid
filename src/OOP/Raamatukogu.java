package OOP;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Raamatukogus on Sõnaraamat. Õigemini siis on, kui sa selle klassi kirjutad.
 *
 * Raamatukogu klassi ei tohi muuta.
 */
public class Raamatukogu {
    public static void main(String[] args) {

        String raamatuKeel = "Eesti";
        Sonaraamat raamat = new Sonaraamat(raamatuKeel);
        raamat.sisestaSona("puaas");
        raamat.sisestaSona("uubuma");
        raamat.sisestaSona("uudikristamine");
        raamat.sisestaSona("suaree");
        raamat.sisestaSona("sarkasm");
        raamat.sisestaSona("iroonia");

        String[] vaste = raamat.otsiEsimeseTaheJargi("u");
        System.out.println(Arrays.toString(vaste));

        String[] vaste2 = raamat.otsiEsimeseTaheJargi("s");
        System.out.println(Arrays.toString(vaste2));

        raamat.eemaldaSona(vaste2[0]);

        raamat.misKeelesRaamatOn();

    }

    private static class Sonaraamat {

        private ArrayList <String> raamat1 = new ArrayList<>();
        private String keel;

        public Sonaraamat(String raamatuKeel) {
            String keel = raamatuKeel;
        }

        public void sisestaSona(String sona) {
            raamat1.add(sona);
        }

//        public String[] otsiEsimeseTaheJargi(String u) {
//            if ((new String(u).contains(u))) {
//                // do something
//            }
//            return String;
//        }

        public void eemaldaSona(String s) {
            raamat1.remove(s);

        }

        public String misKeelesRaamatOn() {
            return keel;
        }

        public String[] otsiEsimeseTaheJargi(String u) {

            //Arrays.
            //raamat1.sort(u);
            raamat1.contains(u);
            return new String[0];
        }
    }
}
