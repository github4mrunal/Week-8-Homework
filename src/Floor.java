public class Floor {
    double width;
    double length;

    public Floor(double width, double length) {//constructor with 2 args
       // this.width = width;
        //this.length = length;
        if (width < 0 && length > 0) {
            this.width = 0;
            this.length = length;
        } else if (width > 0 && length < 0) {
            this.length = 0;
            this.width = width;
        } else if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getArea(){//calculating area
        return this.width * this.length;


    }
}

