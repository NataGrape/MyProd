package org.itstep;
//родительский класс
public class Shape {
    public String ShapeColor = "Have no color";//чтоб не NULL напишем <Have no color>

    public Shape(){};//конструктор по умолчанию

    public Shape(String n){
//можем проверить какие цвета у нас есть
        if(n=="black" || n=="blue" || n=="red" || n == "green")
        ShapeColor = n;
//и вывести msg если нету такого цвета
        else{
            System.out.println("we do not have is[" + n + "] color");
        }
    };

}
