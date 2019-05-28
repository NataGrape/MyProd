package org.itstep;

public class Triangle extends Shape{
    private double height ;
    private double foundation ;

    public Triangle(){};//кон. по ум.

    public Triangle(String n,double height, double foundation){
    super(n);//обращаемся к родюклассу для передачи параметра с помощью <super>
        this.height = height;//передаем параметры с пом. <this>
        this.foundation = foundation;//--//--//
    };
    //
    void Show(){
        System.out.println("Triangle color is "+ super.ShapeColor +"; height = "+ height +"; foundation = "+ foundation);
    };

    //
    public double Shapearea(){
        System.out.println("Triangle area = "+   height*foundation/2);//покажет результат
        return height*foundation/2;
    }

}
