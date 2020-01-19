package TriangleSquare.Alevel;

public class triangleSquare {
    public static void main(String[] args) {

        double x1 = 2;
        double x2 = 1;
        double x3 = -6;
        double y1 = -3;
        double y2 = 1;
        double y3 = 5;

        System.out.println("Даны точки A(" + x1 + "," + y1 + ")  " + "B(" + x2 + "," + y2 + ")  " + "C(" + x3 + "," + y3 + ")");
        System.out.println("Вычислим площадь треугольника по заданным координатам");

        double S = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;

        System.out.println();
        System.out.println("Площадь треугольника =  " + S + " кв.ед");
    }
}
