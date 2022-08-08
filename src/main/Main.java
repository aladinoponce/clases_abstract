package main;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRadio(2);
        FiguraGeometrica triangulo = new Triangulo(5,5,2,4);
        System.out.println("area triangulo: "+triangulo.calcularArea());
        System.out.println("area circulo: "+ circulo.calcularArea());
    }

}
