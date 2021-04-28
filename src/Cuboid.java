public class Cuboid extends Rectangle {//Child class Inheritance OOPS concept
     double height;

    public Cuboid(double width, double length, double height){
        super(width, length);//super keyword to call parent class constructor

        if(height < 0){
            this.height = 0;
        }
        this.height = height;
        }



    public double getHeight(){//instance method with return
        return height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }
}























