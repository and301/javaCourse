package com.company;


public class CodesClass {

    public void codes() {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaximUmValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value =" + myValue);
        System.out.println("Integer Maximum Value =" + myMaximUmValue);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Minimum Value =" + myMaxByteValue);
        System.out.println("Byte Maximum Value =" + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Maximum Value =" + myMaxShortValue);
        System.out.println("Short Minimum Value =" + myMinShortValue);

        long myLongValue = 100;

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Maximum Value =" + myMaxLongValue);
        System.out.println("Long Minimum Value =" + myMinLongValue);

        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("Float Maximum Value =" + myMaxFloatValue);
        System.out.println("Float Minimum Value =" + myMinFloatValue);

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Double Maximum Value =" + myMaxFloatValue);
        System.out.println("Double Minimum Value =" + myMinFloatValue);


        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("Casting convertion =" + myNewByteValue);
        short myNewShortValue = (short) (myMaxShortValue / 2);
        System.out.println("Casting convertion =" + myNewShortValue);

        float myNewFloatValue = (float) (myMaxShortValue / 2);
        System.out.println("Floating,Maximum  =" + myNewFloatValue);
        int myIntValue = 5 / 2;
        float myFloatValue = (float) (5.25f);
        double myDoubleValue = 5.25d;

        System.out.println("Floating,Maximum  =" + myFloatValue);

        float myFloatValues = 5f / 2f;
        double myDoubleValues = 5d / 2d;

        System.out.println("MyIntValue  =" + myIntValue);
        System.out.println("Float  =" + myFloatValues);
        System.out.println("Double  =" + myDoubleValues);

        int CountOfPounds = 5;
        double ConvertedToKilograms = CountOfPounds * 0.45359237;
        System.out.println("200 lbs to kilograms is  =" + ConvertedToKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println("200 lbs to kilograms is  =" + pi);
        System.out.println("200 lbs to kilograms is  =" + anotherNumber);

        char myChar = 'd';
        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar);

        boolean myTrueBoolenValue = true;
        boolean myFalseBoolenValue = false;
        System.out.println(true);
        System.out.println(false);


        myValue--;

        System.out.println(myValue);


        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("it is not an Alien");
            System.out.println("I am scared");

        }

        int topScore = 95;
        if (topScore > 100) {
            System.out.println("You got a hight Score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Eather both of the conditions are true");
        }


        int newValue = 50;

        if (newValue == 50) {
            System.out.println("this is true");
        }

        boolean iscar = false;

        if (iscar) {
            System.out.println("this is not suposed to happen");

        }

        iscar = false;
        boolean wasCar = (iscar) ? true : false;
        if (wasCar) {
            System.out.println("Was car is true");

        }

        double n1 = 20.00;
        double n2 = 80.00;
        double multiply = (n1 + n2 * 100.00);
        System.out.println("multyply" + multiply);
        double reminderResult = (multiply % 40.00);//120
        System.out.println("reminder" + reminderResult);
        boolean value = (reminderResult == 0) ? true : false;
        System.out.println("this is the value" + value);
        if (!value) {
            System.out.println("got some reminder");

        }
        //a mile is equal to 1.65656565

        double kms = (100 * 1.65656565);
        int highscore = 50;

        if (highscore == 50) {


            int myVariables = 50;
            myVariables++;
            myVariables--;

            System.out.println("this is a test");
        }

        boolean isCold = true;

        if (isCold == false) {

            System.out.println(" it is not fucking cold");
        } else if (isCold == true) {

        } else if (isCold == false) {

            System.out.println(" it is  fucking cold");


        } else {


        }

//        this an object creating from the template(car class) of car
        Car porshe = new Car();
        Car holden = new Car();


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        String playerName = "Michael";

        highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was" + highscore);

        int highpositionInTable = calculateHighScorePosition(1500);
        displayHightScorePosition("Tom ", highpositionInTable);
        highpositionInTable = calculateHighScorePosition(900);
        displayHightScorePosition("Bob ", highpositionInTable);
        highpositionInTable = calculateHighScorePosition(400);
        displayHightScorePosition("Mike ", highpositionInTable);
        highpositionInTable = calculateHighScorePosition(50);
        displayHightScorePosition("Kelly ", highpositionInTable);

        System.out.printf("the position " + highpositionInTable);


        gameOver = true;
        score = 800;
        levelCompleted = 5;
        bonus = 100;

        highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was" + highscore);


    }

    public static int calculateScore(Boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;//we add return -1 to make the work

    }


    public static void displayHightScorePosition(String playerName, int position) {

        System.out.printf("managed to get into a position" + playerName);
        System.out.printf("on the high score table" + position);


    }


    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;

        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;

        } else if (playerScore > 100 && playerScore < 500) {
            return 3;

        } else {
            return 4;

        }
    }
}
