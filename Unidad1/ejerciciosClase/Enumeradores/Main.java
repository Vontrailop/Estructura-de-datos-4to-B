public class Main {

    enum coloresPrimarios{
        ROJO,AZUL,AMARILLO
    }
    public static void main(String[] args) {
        
        Dias hoy = Dias.MIERCOLES;

        switch (hoy) {
            case LUNES:
                System.out.println("hoy es un dia pesado");
                break;
            case MARTES:
                System.out.println("Martes 2x1");
                break;
            case MIERCOLES:
                System.out.println("Ombliguito de semana");
                break;
        
            default:
                break;
        }

        coloresPrimarios color = coloresPrimarios.AMARILLO;
        System.out.println(color);
    }
}
