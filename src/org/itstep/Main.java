package org.itstep;

public class Main {
    public static void main(String[] args) {
        Triangle trn = new Triangle("Triangle",23,18);
        Square sqr = new Square("Circle",7);
        Circle crc = new Circle("Circle",12);

        System.out.println("Triangle height = " + trn.height + "; Triangle foundation = " + trn.foundation);
        System.out.println("Square side = " + sqr.side);
        System.out.println("Circle radius = " + crc.radius);


    }
}
