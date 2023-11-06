
public class Main {

    public static void main(String[] args) {
        Pila<Integer> miPila = new Pila<>();
        try {
            miPila.insertar(1);
            miPila.insertar(2);
            miPila.insertar(3);

            miPila.muestra();

        } catch (Exception er) {
            System.out.println("Excepción: " + er);
        }
    }
}
