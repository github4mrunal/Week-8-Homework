
public class Cylinder extends Circle {//child class(Single Inheritance)
    //Instance variable
    double height;

    //Constructor
    public Cylinder(double radius, double height) {
        super(radius);//super keyword to call parent class constructor

        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }// return type method
public double getVolume(){
        double volume = super.getArea() * height;
        return volume;

    }
}




