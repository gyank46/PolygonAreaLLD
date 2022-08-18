package com.example.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    List<Tree> trees = new ArrayList<Tree>();
    String canvas;
    public Forest(String canvas){
        this.canvas = canvas;
    }

    public void plantTree(int x, int y, String name, String color, String texture){

        TreeType treeType = TreeTypeFactory.getTreeType(name,color,texture);
        Tree tree = new Tree(x,y,treeType);
        trees.add(tree);
    }

    public void draw(){
        for (Tree tree: trees) {
            tree.draw(canvas);
        }
    }



}
