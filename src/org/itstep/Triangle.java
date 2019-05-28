package org.itstep;

public class Triangle extends Shape{
    double height ;
    double foundation ;

    public Triangle(String n,double height, double foundation){
    super(n);//обращаемся к родюклассу для передачи параметра с помощью <super>
        this.height = height;//передаем параметры с пом. <this>
        this.foundation = foundation;//--//--//
    };
/*
    //или так можно тоже ..
    public Triangle(String n,double h, double f){
        super(n);//обращаемся к родюклассу для передачи параметра с помощью <super>
        height = h;//передаем параметры без пом. <this>
        foundation = f;//--//--//
    };
    */
}
