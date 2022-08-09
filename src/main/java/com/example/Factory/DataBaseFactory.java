package com.example.Factory;

import javax.xml.crypto.Data;

public class DataBaseFactory {

    public static Database getDataBaseByType(String type){

        Database db = null ;
        if(type.equals(DataBases.SQL.toString()))
            db = new SQL();

        if(type.equals(DataBases.MongoDB.toString()))
            db = new MongoDB();
        return db;
    }

}
