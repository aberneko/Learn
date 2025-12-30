package com.aberneko.learning.Abstract.Interfaces.TaskInterfaceOne;

/*.В этом задании вам необходимо применить полученные знания об интерфейсах и абстрактных классах так, чтобы связать
 все фигуры в единую иерархию и написать программу-калькулятор, вычисляющую площадь фигур: ромба, квадрата,
 прямоугольника и круга. Задание рассчитано на реализацию без использования default-методов. Мы подготовили
 для вас репозиторий с кодом, но перед тем как вы начнёте, изучите одно небольшое, но важное примечание.*/

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника 4см*6см = " + rectangle.getArea());

        Square square = new Square(3);
        System.out.println("Площадь квадрата 3см*3см = " + square.getArea());

        Rhombus rhombus = new Rhombus(4, 3);
        System.out.println("Площадь ромба со стороной 4см и высотой 3см = " + rhombus.getArea());

        Circle circle = new Circle(2);
        System.out.println("Площадь круга с радиусом 2см = " + circle.getArea());
    }
}
