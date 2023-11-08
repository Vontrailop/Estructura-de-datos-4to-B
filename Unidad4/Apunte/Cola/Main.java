public class Main {

    public static void main(String[] args) {
        Cola<Integer> nuevaCola = new Cola<>();

        try {
            nuevaCola.insertar(1);
            System.out.println("Frente: "+nuevaCola.frenteCola());
            System.out.println("Salida: "+nuevaCola.quitar());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        nuevaCola.muestra();
    }
}
