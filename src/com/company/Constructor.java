package com.company;

public class Constructor {
//creation of fields with data coming from the constructor, this variables can be used anywhere in this class fro methods or outside
    String colour;
    int wheelCount;
    String model;
    int year;

    //creation of the constructor to get that data from the object
    public Constructor(String colour, int wheelCount, String model,int year) {

        //fields inizilied with the input from the constructor and assigned to the above fields
        this.colour = colour;
        this.wheelCount = wheelCount;
        this.model = model;
        this.year = year;
        System.out.println("second constructor called");
    }

    public void showProperties(int key) {

        System.out.println("it was fabric in the year..." + year);
        System.out.println("the color is..." + colour);
        System.out.println("the model is..." + model);

    }


}
