package org.itstep;

public class Main {
    public static void main(String[] args) {
        Triangle trn = new Triangle("green",23,18);
        Square sqr = new Square("blue",7);
        Circle crc = new Circle("white",8);

        trn.Show();
        sqr.Show();
        crc.Show();
/*
        Triangle trn2 = new Triangle("",23,18);
        trn2.Show();

        Triangle trn3 = new Triangle();//создался обьект с пустыми значениями 0.0
        trn3.Show();
*/

        crc.Shapearea();
        sqr.Shapearea();
        trn.Shapearea();
    }
}
