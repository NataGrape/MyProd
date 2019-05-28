package org.itstep;

public class Square extends Shape{
    double side = 4.2;

    public Square(){};

    public Square(String n,double side){

        super(n);//обращаемся к род.классу для передачи параметра с помощью <super>
        this.side = side;//передаем параметры с пом. <this>
    };

    void Show(){
        System.out.println("Square color is "+ super.ShapeColor +"; side = " + side);
    };
}
