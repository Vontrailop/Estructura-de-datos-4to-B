import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String args[]) {
        // Map <String, HashMap<String,String>> cita;
        Map<String, Integer> mapaEdades = new HashMap<>();

        mapaEdades.put("Daniel", 24);
        mapaEdades.put("Maria", 32);
        mapaEdades.put("Miguel", 16);
        mapaEdades.put("Carla", 65);

        // System.out.println(
        //         "La edad de Daniel es: "
        //                 + mapaEdades.get("Daniel"));

        // for (Map.Entry<String, Integer> entrada : 
        // mapaEdades.entrySet()) {
        //     System.out.println(entrada.getKey() + 
        //     " tiene: " + 
        //     entrada.getValue());
        // }

        Set<String> valores = new HashSet<>() ;
        valores.add("Valor 1");
        valores.add("Valor 2");
        valores.add("Valor 3");

        for (String string : valores) {
            System.out.println(string);
        }

    }

}