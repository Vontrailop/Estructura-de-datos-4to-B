
/**
 * Plano
 */
public class Plano<T> {
    private T minX, minY, maxX, maxY;

    public Plano(T minX, T minY, T maxX, T maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public T getMinX() {
        return minX;
    }

    public void setMinX(T minX) {
        this.minX = minX;
    }

    public T getMinY() {
        return minY;
    }

    public void setMinY(T minY) {
        this.minY = minY;
    }

    public T getMaxX() {
        return maxX;
    }

    public void setMaxX(T maxX) {
        this.maxX = maxX;
    }

    public T getMaxY() {
        return maxY;
    }

    public void setMaxY(T maxY) {
        this.maxY = maxY;
    }

    @Override
    public String toString() {
        return "Plano [minX=" + minX + ", minY=" + minY + ", maxX=" + maxX + ", maxY=" + maxY + "]";
    }

    
}