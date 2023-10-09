package Unidad3.Apunte.DatosGenericos;

public class TiposGenericos {

    public static void main(String[] args) {
        Plano<Integer> planoEntero = new Plano<Integer>(4, 2, 1, 3);
        Plano<Double> planoDoble = new Plano<Double>(1.1, -1.1, 2.0, -2.0);

        planoEntero.toString();
        planoDoble.toString();


        Plano<TiposGenericos> pequeplano = new Plano<>(
            new TiposGenericos(),new TiposGenericos(),
            new TiposGenericos(),new TiposGenericos());

        
    }
}
