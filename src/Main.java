import java.util.Scanner;
class CalculateG{
    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;
// Add the formulas for position and velocity
        finalPosition = ((0.5 * gravity * (fallingTime * fallingTime) + (initialVelocity + fallingTime) + initialPosition) / fallingTime);
        finalVelocity = ((gravity * fallingTime) + initialVelocity) / fallingTime;
        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
// Add output line for velocity (similar to position)
        System.out.println("THE VELOCITY AFTER " + fallingTime + "second is:" + finalVelocity + "m/s");
//powering a number
        powering();
        multiplication();
        sumition();

    }
            public static double powering() {
        Scanner poweringinput=new Scanner(System.in);
            double number = 5;
            double poweringthenumber = 5 * 5;
                System.out.println("The Answer for Square is:"+poweringthenumber);
            return 0;
    }
// method for multiplication
        public static double multiplication(){
        Scanner multiplicationinput=new Scanner(System.in);
                double num1=10;
                double num2=10;
                double multiply=num1*num2;
            System.out.println("The Answer for Multiplication is:"+multiply);
                return 0;

        }
        //method for sumition
        public static double sumition(){
        Scanner sumitioninput=new Scanner(System.in);
                double add1=15;
                double add2=20;
                double addition=add1+add2;
            System.out.println("The Answer for Sum is: "+ addition);
                return 0;

        }
            public static void outline(){
// method for printing out a result
        System.out.println("VALUE AFTER POWERING '5' IS:"+ powering());
            }
// compute the position and velocity of an object with defined methods and print out the


                }

