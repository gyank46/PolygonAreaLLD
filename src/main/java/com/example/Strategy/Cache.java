package com.example.Strategy;

public class Cache {

    private CacheStrategy cacheStrategy;

    public Cache(CacheStrategy cacheStrategy){
        this.cacheStrategy = cacheStrategy;
    }

    public void add(CacheContainer val){
        cacheStrategy.add(val);
    }

    public void remove(){
        cacheStrategy.remove();
    }

    public String getValue(String key){
        return cacheStrategy.getValue(key);
    }


}
