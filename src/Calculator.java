public class Calculator {
    Floor floor;//variable define by class name
    Carpet carpet;

    public Calculator(Floor f, Carpet c) {//constructor
        this.floor = f;
        this.carpet = c;
    }

    public double getTotalCost() {//instance method
        return floor.getArea() * carpet.getCost();//return type method from other class
    }


}
