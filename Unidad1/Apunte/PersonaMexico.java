import ClasesAbstractas.PersonaAbstracta;
import ClasesInterfaz.PersonaBomber;
import ClasesInterfaz.PersonaFiscal;

public class PersonaMexico extends PersonaAbstracta implements PersonaBomber, PersonaFiscal{

    @Override
    public void hablar() {
        System.out.println("Que onda men, los mexicanos hablamos ansi. Yipa yipa");
    }

    @Override
    public void apagarFuego() {
        System.out.println("Apagando fuego");
    }

    @Override
    public void manejarCamion() {
        System.out.println("manejando camión");
    }

    @Override
    public void pagarImpuestos() {
        System.out.println("Pagando impuestos...");
    }

    @Override
    public void pagarMultas() {
        System.out.println("Pagando multas...");
    }
    


}
