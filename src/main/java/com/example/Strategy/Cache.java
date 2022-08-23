package com.example.Strategy;

public class Cache {

    private CacheStrategy cacheStrategy;
    private int cachesize;
    private int cacheCounter = 0;

    public Cache(CacheStrategy cacheStrategy, int cachesize){
        this.cacheStrategy = cacheStrategy;
        this.cachesize = cachesize;
    }

    public void add(CacheContainer val){
        if(cacheCounter == cachesize){
            this.remove();
        }
        cacheStrategy.add(val);
        cacheCounter++;
    }

    public void remove(){
        cacheStrategy.remove();
        cacheCounter--;
    }

    public String getValue(String key){
        return cacheStrategy.getValue(key);
    }


}
