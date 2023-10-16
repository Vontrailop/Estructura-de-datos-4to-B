
public class TiposGenericos {

    public static void main(String[] args) {
        Plano<Integer> pruebaInteger = 
        new Plano(1, 4, 3, 2);
        Plano<Double> pruebaDouble;
        Plano<Float> pruebaFloat;
        Plano<String> pruebaString = 
        new Plano("adw","dw",
        "qd","q");

        Plano<TiposGenericos> pruebaError = 
        new Plano(new TiposGenericos(),
        new TiposGenericos(),
        new TiposGenericos(),
        new TiposGenericos());

        

        System.out.println(pruebaInteger.toString());
        System.out.println(pruebaString.toString());
    }
}
