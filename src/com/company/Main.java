package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaximUmValue = Integer.MAX_VALUE;



        System.out.println("Integer Minimum Value =" + myMinIntValue);
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
        byte myNewByteValue = (byte) (myMinByteValue / 2 );
        System.out.println("Casting convertion =" + myNewByteValue);

        short myNewShortValue = (short) (myMaxShortValue/ 2 );
        System.out.println("Casting convertion =" + myNewShortValue);

        float myNewFloatValue = (float) (myMaxShortValue/ 2 );
        System.out.println("Floating,Maximum  =" + myNewFloatValue);

        int myIntValue = 5 / 2;
        float myFloatValue = (float) (5.25f);
        double myDoubleValue = 5.25d;

        System.out.println("Floating,Maximum  =" + myFloatValue);

        float myFloatValues =  5f / 2f;
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
        System.out.println(myTrueBoolenValue);
        System.out.println(myFalseBoolenValue);




    }
}
