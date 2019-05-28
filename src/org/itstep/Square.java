package org.itstep;

public class Square extends Shape{
    double side = 4.2;

    public Square(String n,double side){
        super(n);//обращаемся к родюклассу для передачи параметра с помощью <super>
        this.side = side;//передаем параметры с пом. <this>
    };
}
