package com.example.Flyweight;

public class Tree {
    int x;
    int y;

    String canvas;

    TreeType treeType;


    public Tree(int x, int y, String canvas, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
        this.canvas = canvas;
    }

    public void draw(String canvas){
        treeType.drawCanvas(x,y,canvas);
    }
}
