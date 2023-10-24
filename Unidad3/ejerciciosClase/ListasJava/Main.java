import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("David");
        lista.add("Sebastian");
        lista.add("Yoali");
        List<String> lista2 = new ArrayList<>();
        lista2.add("Edgar");
        lista2.add("Marco");

        System.out.println(lista.toString());

        lista.remove("Alberto");
        lista.remove(1);
        System.out.println(lista.toString());

        System.out.println("Esta lista contiene el elemento"
                + lista.contains("Yoali"));

        System.out.println("Obten el indice 0: " +
                lista.get(0));

        lista.clear();
        System.out.println(lista.toString());

        System.out.println("¿Está vacía?" + lista.isEmpty());

        lista.add("David");
        lista.add("Sebastian");
        lista.add("Yoali");

        System.out.println("¿Está vacía?" + lista.isEmpty());

        lista.addAll(lista2);
        lista.addAll(0, lista2);
        System.out.println(lista.toString());
        
        lista.removeAll(lista2);
        System.out.println(lista.toString());

        System.out.println("¿Lista es igual a lista2?"+
        lista.containsAll(lista2));

        System.out.println("¿Lista es igual a lista2?"+
        lista.containsAll(lista));

        lista.addAll(0, lista2);
        lista.addAll(lista2);
        System.out.println(lista.toString());
        lista.retainAll(lista2);
        System.out.println(lista.toString());

        
    }
}