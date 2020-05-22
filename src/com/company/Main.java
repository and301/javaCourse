package com.company;


public class Main {

    public static void main(String[] args) {

        //CONSTRUCTOR
        Constructor constructor = new Constructor("black", 1, "chevrole", 1993);

        //CLASSES
        ThisIsTheCarClass  keyInput = new ThisIsTheCarClass();
        keyInput.imputKey(123456);
        keyInput.showProperties(123456789);

        //CASTING
        casting();

        //EMPTY AND FILLED VARIABLE
        emptyAndFilledVariable();

        //CHECKING THE RANGE OF A NUMBER
        checkRangeOfAnumber();

        //TERNARY OPERATOR
        ternaryOperator();
        ternaryOperatorExercise();

        //IF THEN STATEMENT
        IfThen();
        IfThenExcercise();

        //INPUT METHOD
        methodImput("Hello, how are you!", 254);
        int result = methodOutPut(20, 54);


        //OVERLOADING
        methodOverloading(20, 52);
        methodOverloading();

        //SWITCH STATEMENT
        switchStatement(201);

        //FOR LOOPS
        forLoops();


        //GETTER AND SETTER
        simpleGetterAndSetter obj = new simpleGetterAndSetter();
        obj.setNumber(10);//save the value
        int num = obj.getNumber();//shows the value


        //SUPER
        SuperSampleChild superSampleChild = new SuperSampleChild();
        superSampleChild.printColor();


    }

    public static void casting() {
        int value = 1;
        int myValue = (int) (value * 2);
        System.out.println(myValue);
    }

    public static void emptyAndFilledVariable() {
        String name;//Empty variable that can take type of String data
        name = "Andres ";
        String lastName = "Angulo "; //variable that contains type of String data
        System.out.println(("the variables are last name ") + lastName + ("And first name ") + name);
    }

    public static void checkRangeOfAnumber() {
        double myMaxLongValue = Double.MAX_VALUE;
        System.out.println(myMaxLongValue);
    }

    public static void ternaryOperator() {
        //create the variable
        boolean isItAcar = true;
        //create a new variable that will take the data from the first variable by using a ternary operator
        boolean wasACar = isItAcar ? true : false;//if isItAcar is true assigned True to WASaCar if it is not true assigned False
        System.out.println(wasACar);


    }

    public static void ternaryOperatorExercise() {
        // EXERCISE Java program to find largest among two numbers using ternary operator
        int n1 = 1;
        int n2 = 2;
        int LargerNumber = (n1 > n2) ? n1 : n2; //we can use Math.max(n1, n2); to check the larger number
        System.out.println(LargerNumber);
    }

    public static void IfThen() {
        boolean isAlien = true;
        if (!isAlien) {//adding ! to the variable will make to check if the variable is false
            System.out.println("it is not an Alien");
            System.out.println("I am scared");
        }


    }

    public static void IfThenExcercise() {
        //Take three numbers from the user and print the greatest number
        int number1 = 25;
        int number2 = 78;
        int number3 = 87;

        if (number3 > number2 || number3 > number1) {
            System.out.println("The greatest is " + number3);

        }

    }

    public static void methodImput(String greeting, int number) {
        int sum = number + number;

        System.out.println("The greeting  is " + greeting);
        System.out.println("The sum is " + sum);
    }

    public static int methodOutPut(int number, int number2) {
        int sum = number + number2;
        System.out.println("The sum is " + sum);
        return sum;
    }

    public static int methodOverloading(int number, int number2) {
        int sum = number + number2;
        System.out.println("I am overloading with the same name as another method with inputs " + sum);
        return sum;
    }

    public static void methodOverloading() {
        int number = 10;
        int number2 = 25;
        int sum = number + number2;
        System.out.println("I am overloading with the same name as another method with no inputs " + sum);
    }

    public static void switchStatement(int switchValue) {
        switch ((switchValue)) {//checks that variable with the below variables
            case 1:
                System.out.printf("value was  1 ");
                break;

            case 2:
                System.out.printf("value was not 2 ");
                break;

            case 3:
            case 4:
            case 5:
                System.out.printf("was a 3 or 4 or 5 ");
                System.out.printf("actualluy it was " + switchValue);
                break;

            default:
                System.out.printf("value was not any of the cases ");

        }
    }

    public static void forLoops() {

        int number = 20;

        for (number = 20; number < 50; number++) {

            System.out.println("I am not greater than 50, your number " + number);


        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at 2% interest = ");

        }

    }

}




