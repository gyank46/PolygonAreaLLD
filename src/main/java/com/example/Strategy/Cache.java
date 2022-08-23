package com.example.Strategy;

public class Cache {

    private CacheStrategy cacheStrategy;
    private int cachesize;

    public Cache(CacheStrategy cacheStrategy){
        this.cacheStrategy = cacheStrategy;
        this.cachesize = cachesize;
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
