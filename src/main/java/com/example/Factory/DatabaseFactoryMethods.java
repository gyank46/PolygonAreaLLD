package com.example.Factory;

public interface DatabaseFactoryMethods {

    Connection getConnection();

    Transaction getTransaction();
}
