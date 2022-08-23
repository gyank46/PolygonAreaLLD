package com.example.Strategy;

import java.util.HashMap;
import java.util.Stack;

public class LIFOCacheStrategy implements CacheStrategy{
    Stack<CacheContainer> cache = new Stack<CacheContainer>();
    HashMap<String,CacheContainer> map = new HashMap<String,CacheContainer>();
    private int cacheCounter = 0;
    private int cacheSize ;

    public LIFOCacheStrategy(int cacheSize){
        this.cacheSize = cacheSize;
    }
    @Override
    public void remove() {
        String key = cache.peek().getKey();
        cache.pop();
        map.remove(key);
        cacheCounter--;
    }

    @Override
    public void add(CacheContainer val) {
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
