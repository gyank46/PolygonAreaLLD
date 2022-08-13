package com.example.Factory;

public class Client {

    public static void main(String[] args) {
        String databaseType = DataBases.MongoDB.toString();
        Database db = DataBaseFactory.getDataBaseByType(databaseType);
        Connection con = db.getDatabaseFactoryMethods().getConnection();
        Transaction transaction =  db.getDatabaseFactoryMethods().getTransaction();
        DatabaseFactoryMethods sql1= db.getDatabaseFactoryMethods();
        System.out.println(sql1);
        sql1 = db.getDatabaseFactoryMethods();
        System.out.println(sql1);


    }
}
