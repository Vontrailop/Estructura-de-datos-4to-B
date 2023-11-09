import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> pilaFruta = new Stack<String>();

        System.out.println("¿Está vacía? "+(pilaFruta.empty()?"Si":"No"));

        System.out.println(pilaFruta.capacity());

        pilaFruta.push("Melón");
        pilaFruta.push("Mango");
        pilaFruta.push("Plátano");

        System.out.println(pilaFruta.toString());
        System.out.println("Último elemento: " + pilaFruta.peek());
        System.out.println("Elemento expulsado: " + pilaFruta.pop());
        System.out.println("Último elemento: " + pilaFruta.peek());
        System.out.println(pilaFruta.toString());
        System.out.println("¿Está vacía? "+(pilaFruta.empty()?"Si":"No"));
        pilaFruta.clear();
        System.out.println("¿Está vacía? "+(pilaFruta.empty()?"Si":"No"));
    }
}
