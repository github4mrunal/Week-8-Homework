public class Circle {//parent class(Inheritance meathod)
    double radius;
    public   Circle(double radius) {//constructor
        if (radius < 0) {
            this.radius = 0;//constructor intialized
        } else {
            this.radius = radius;
        }
    }
       public double getRadius(){//instance method with return type
            return this.radius;
        }

           public double getArea(){//method with return type
            double area =radius * radius * Math.PI;//formula to calculate PI
            return area;
            }
}






