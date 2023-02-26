import java.util.HashMap;
import java.util.Map;

public class Translator {

    //  5.  Maak in de Translator class een HashMap<Integer,String> variabele met de naam numericAlpha

    Map<Integer,String> numericAlpha = new HashMap<>();

    //  6.  Maak in de Translator class een constructor die de volgende parameters krijgt: (String[] alphabetic, Integer[] numeric)
    public Translator (String[] alphabetic, Integer[] numeric) {
        //  7.  Schrijf in de constructor een for-loop die begint bij 0 en doorgaat
        //      tot de lengte van de numeric/alphabetic array (maakt niet uit welke, ze zijn even lang).
        for (int i =0; i < numeric.length; i ++) {
            //  8.  Voeg in de body van de for-loop een nieuwe entry toe aan de HashMap met de correcte waardes uit
            //      numeric en alphabetic. Gebruik de i variabele uit je for-loop om de correcte waardes uit de arrays te halen.
            numericAlpha.put(numeric[i], alphabetic[i]);

        }

        //  10. Maak in de Translator class een nieuwe methode genaamd translate(Integer number) die een String returnt.
        public String translate(Integer number) {
            return numericAlpha.get(number);

        }
    }

}
