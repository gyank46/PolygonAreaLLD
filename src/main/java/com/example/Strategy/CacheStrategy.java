package com.example.Strategy;

public interface CacheStrategy {

    public void remove();

    public void add(CacheContainer val);

    public String getValue(String key);
}
