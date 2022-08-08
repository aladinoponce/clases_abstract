package main;

public class Triangulo extends FiguraGeometrica{

    private float base;
    private float altura;

    public Triangulo(int posX, int posY, float base, float altura) {
        super(posX,posY);
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return base*(altura/2);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
