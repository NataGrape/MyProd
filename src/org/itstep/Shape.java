package org.itstep;
//родительский класс
public class Shape {
    public String ShapeName ;//все (наши) фигуры имеют имя

    public Shape(){};//конструктор по умолчанию(он и так есть конечно...)

    public Shape(String n){
//можем проверить какие фигуры у нас есть
        if(n=="Square" || n=="Triangle" || n=="Circle")
        ShapeName = n;
//и вывести msg если нету введенной
        else{
            System.out.println("we do not have is[" + n + "]");
        }
    };

}
