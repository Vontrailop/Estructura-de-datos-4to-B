import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ejemploArrayList();
        //ejemploLinkedList();
    }


    public static void ejemploArrayList(){
        List<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        lista.add(2,"Naranja");

        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }

    public static void ejemploLinkedList(){
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        numeros.remove(4);

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
