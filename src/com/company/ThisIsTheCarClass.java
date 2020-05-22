package com.company;

public class ThisIsTheCarClass {

    String colour;
    int wheelCount;
    String model;
    int year;

    public ThisIsTheCarClass() {
        System.out.println("Empty constructor called");
    }

    public ThisIsTheCarClass (String colour, int wheelCount, String model,int year) {
        this.colour = colour;
        this.wheelCount = wheelCount;
        this.model = model;
        this.year = year;
        System.out.println("second constructor called");

    }

    public void imputKey(int key) {
        if (key == 123456) {
            System.out.println("in process...");
            startEngine(key);
        } else if (key == 12345678) {
            startEngine(key);

        }else if (key == 123456789) {
            showProperties(key);

        }


    }


    public void startEngine(int key) {
        System.out.println("Engines start now...");
        for (key = 0; key < 20; key++) {


            System.out.println("Rolling..." + key);

            if (key == 19) {
                stopCar(key);
            }
            if (key == 5) {
                System.out.println("turbo added");
                turboCar(key);
            }

        }
    }

    public void stopCar(int key) {

        System.out.println("Stopping car at..." + key);


    }


    public void turboCar(int key) {

        for (key = 19; key < 80; key++) {


            System.out.println("Turbooooooo at..." + key);

            if (key == 19) {
                stopCar(key);
            }

        }


    }

    public void showProperties(int key) {

        System.out.println("it was fabric in the year..." + year);
        System.out.println("the color is..." + colour);
        System.out.println("the model is..." + model);

    }


}



