import java.util.concurrent.Callable;

public class MainCarpetCostCalculator_Q17 {
    public static void main(String[] args) {//predefined


        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("total=" +calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        calculator = new Calculator(floor,carpet);
        System.out.println("total" + calculator.getTotalCost());

//Consists of Floor,Carpet and Calculator class
        //Calling all 3 class in main method
        //method overriding

            }
        }



