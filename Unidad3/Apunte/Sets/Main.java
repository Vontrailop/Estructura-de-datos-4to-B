import java.util.HashSet;

public class Main {
    

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Agregar elementos de manera desordenada
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(10);

        System.out.println("HashSet : " + hashSet);

        for (Integer i : hashSet) {
            System.out.println(i);
        }
    }
}
