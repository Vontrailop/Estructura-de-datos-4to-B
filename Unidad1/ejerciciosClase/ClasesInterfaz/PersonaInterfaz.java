public interface PersonaInterfaz{
    public void silbar();
    public void dibujar();

    public default void ver(){
        System.out.println("Estoy viendo ");
    }
}