package org.itstep;

public class Main {
    public static void main(String[] args) {
        Triangle trn = new Triangle("green",23,18);
        Square sqr = new Square("blue",7);
        Circle crc = new Circle("white",12);

        trn.Show();
        sqr.Show();
        crc.Show();

    }
}
