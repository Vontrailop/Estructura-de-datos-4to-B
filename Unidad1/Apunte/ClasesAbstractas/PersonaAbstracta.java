package ClasesAbstractas;
import java.util.Date;

/**
 * PersonaAbstracta
 */
public abstract class PersonaAbstracta {

    private long anoNac;
    private String lugarNac;

    public PersonaAbstracta(){}

    public abstract void hablar();

    public void nacer(String lugarNac){
        anoNac = new Date().getTime();
        System.out.println("Nací en "+lugarNac+", a las "+anoNac);
    }

    public void comer(String comida){
        System.out.println("estoy comiendo...");
    }

}