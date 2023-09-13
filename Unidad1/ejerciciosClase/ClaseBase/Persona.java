public class Persona extends PersonaAbstracta implements PersonaInterfaz{
    @Override
    public void nacer(String lugar){
        System.out.println("Estoy naciendo en "+lugar+" y me siento bien");
    };
    @Override
    public void silbar(){
        System.out.println("Estoy silbando");
    };
    @Override
    public void dibujar(){
        System.out.println("Estoy dibujando");
    };;
    
} 