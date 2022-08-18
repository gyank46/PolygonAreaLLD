package com.example.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    List<Tree> trees = new ArrayList<Tree>();

    void plantTree(int x, int y, String name, String color, String texture, String canvas){

        TreeType treeType = TreeTypeFactory.getTreeType(name,color,texture);

        Tree tree = new Tree(x,y,canvas,treeType);
        trees.add(tree);
    }

    void draw(String canvas){
        for (Tree tree: trees) {
            tree.draw(canvas);
        }
    }



}
