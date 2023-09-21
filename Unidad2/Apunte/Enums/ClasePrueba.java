import EnumsPaquete.DiasSemana;

public class ClasePrueba {
    public static void main(String[] args) {
        DiasSemana hoy = DiasSemana.LUNES;
        coloresPrimarios color1 = coloresPrimarios.AMARILLO;
        System.out.println(hoy);
        System.out.println(color1);
    }

    enum coloresPrimarios{
        ROJO, AZUL, AMARILLO
    }
}


