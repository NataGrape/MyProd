package org.itstep;

public class Shape {
    public static void main(String[] args) {
        Triangle trn = new Triangle();
        Square sqr = new Square();
        Circle crc = new Circle();

        System.out.println("Triangle height = " + trn.height + "; Triangle foundation = " + trn.foundation);
        System.out.println("Square side = " + sqr.side);
        System.out.println("Circle radius = " + crc.radius);
    }
}
