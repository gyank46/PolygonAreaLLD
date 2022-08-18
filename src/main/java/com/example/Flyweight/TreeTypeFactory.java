package com.example.Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeTypeFactory {

    static String delimiter = "$";
    static HashMap<String,TreeType> treeTypeCache = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture){

        String treeTypeProperty = name + delimiter + color + delimiter + texture;

        if(!treeTypeCache.containsKey(treeTypeProperty)){
            treeTypeCache.put(treeTypeProperty,new TreeType(name,color,texture));
        }

        return treeTypeCache.get(treeTypeProperty);
    }
}
