package com.example.Flyweight;

public class Client {

    public static void main(String[] args) {

        Forest forest = new Forest("abcd");
        forest.plantTree(10,10,"Mango","Grey","Rough");

        forest.plantTree(10,20,"Mango","Brown","Smooth");

        forest.plantTree(20,10,"Mango","Grey", "Rough");

        forest.draw();

    }

}
