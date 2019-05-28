package org.itstep;

public class Circle extends Shape{
    double radius = 8;

    public Circle(String n,double radius){
        super(n);//обращаемся к родюклассу для передачи параметра с помощью <super>
        this.radius = radius;//передаем параметры с пом. <this>
    };
}
