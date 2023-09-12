package ClasesInterfaz;
public interface PersonaBomber {
    
    public void apagarFuego();
    public void manejarCamion();

    public default void usarHacha(){};
}
