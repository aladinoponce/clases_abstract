package main;

public abstract class FiguraGeometrica {
    private int posx;
    private int posY;

    public FiguraGeometrica() {}

    public FiguraGeometrica(int posx, int posY) {
        this.posx = posx;
        this.posY = posY;
    }

    public abstract double calcularArea();
}
