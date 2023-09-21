public class MainPrueba{
    public static void main (String [] args){

        Persona persona1 = new Persona();
        PersonaAbstracta personaAbstracta1 = new Persona(); 
        persona1.silbar();
        personaAbstracta1.nacer("Mexico");
        
    }
}