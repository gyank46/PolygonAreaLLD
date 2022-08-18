package com.example.Flyweight;

public class TreeType {

    String name;
    String color;
    String texture;

    public TreeType(String name, String color, String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void drawCanvas(int x, int y, String canvas){
        System.out.println("drawing tree at "+ x + " "+ y);
    }


}
