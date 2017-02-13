package com.company;
abstract class Shape implements Comparable<Shape> {
    abstract double getArea();
    @Override
    public int compareTo(Shape s)
           {
               if (s == null)
                    return 1;
               if (this.getArea() > s.getArea())
                    return 1;
               else if (this.getArea() > s.getArea())
                    return -1;
               else return 0;
           }
        }
        class Square extends Shape
        {
            Square(int a)
            {
                this.a = a;
            }
            int a;
            @Override
            double getArea() {
                return a*a;
            }
        }
        class Circle extends Shape
        {
            Circle(int r)
            {
                this.r = r;
            }
            int r;
            @Override
            double getArea() {
                return Math.PI*r*r;
            }

        }
        class Elips extends Shape
        {
            Elips (double between,double lineofeach) {
                this.between = between;
                this.thelongest = lineofeach;
            }
            double between;
            double thelongest;
            double getArea() {
                return Math.PI*between*thelongest;
            }
        }
        public class Main {
            public static void main(String[] args) {
                Elips lol = new Elips(7,10);
                System.out.println(lol.getArea());
            }

}
