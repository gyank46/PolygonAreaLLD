package com.example.Strategy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOCacheStrategy implements CacheStrategy{
    Queue<CacheContainer> cache = new LinkedList<CacheContainer>();
    HashMap<String,CacheContainer> map = new HashMap<String,CacheContainer>();
    private int cacheCounter = 0;
    private int cacheSize;

    public FIFOCacheStrategy(int size){
        this.cacheSize = size;
    }
    @Override
    public void remove() {
        String key = cache.peek().getKey();
        cache.remove();
        map.remove(key);
        cacheCounter--;
    }

    @Override
    public void add(CacheContainer  val) {
        if(cacheCounter == cacheSize)
            remove();
        if(!map.containsKey(val.getKey())){
            map.put(val.getKey(),val);
            cache.add(val);
            cacheCounter++;
        }
    }

    @Override
    public String getValue(String key) {
        if(map.containsKey(key)){
            return map.get(key).getValue();
        }
        return null;
    }
}
