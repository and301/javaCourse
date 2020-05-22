package com.company;

class SuperSample {
    String color="white";
}


class SuperSampleChild extends SuperSample{
    String color="black";

    void printColor(){
        System.out.println(color);//prints color of Dog2 class
        System.out.println(super.color);//Super is use to access the property of the parent class(SuperSample)
    }
}