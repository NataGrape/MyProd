package org.itstep;

public class Circle extends Shape{
    private double radius ;//ограничили доступ к данным с помощью модификатора <private>

    public Circle(){};

    public Circle(String n,double radius){
        super(n);//обращаемся к родюклассу для передачи параметра с помощью <super>
        this.radius = radius;//передаем параметры с пом. <this>
    };

    void Show(){
        System.out.println("Circle color is "+ super.ShapeColor +"; radius = " + radius);
    };
//Площадь круга равна произведению квадрата радиуса на число пи (3.1415)
    public double Shapearea(){
        double pi = Math.PI;//
        System.out.println("Circle area = "+ pi*(radius*radius));//покажет результат
        return pi*(radius*radius);// или 3.1415*(radius*radius)

    }
}
