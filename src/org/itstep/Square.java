package org.itstep;

public class Square extends Shape{
    private double side ;

    public Square(){};

    public Square(String n,double side){

        super(n);//обращаемся к род.классу для передачи параметра с помощью <super>
        this.side = side;//передаем параметры с пом. <this>
    };

    void Show(){
        System.out.println("Square color is "+ super.ShapeColor +"; side = " + side);
    };
//Площадь квадрата равна квадрату длины его стороны
    public double Shapearea(){
        System.out.println("Square area = "+  side*side );//покажет результат
        return side*side;
    }
}
