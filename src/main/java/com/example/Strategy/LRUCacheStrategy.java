package com.example.Strategy;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheStrategy implements CacheStrategy{
    LinkedList<CacheContainer> dll = new LinkedList<CacheContainer>();
    HashMap<String,CacheContainer> map = new HashMap<String, CacheContainer>();
    private int cacheCounter = 0;
    private int cacheSize;

    public LRUCacheStrategy(int cacheSize){
        this.cacheSize = cacheSize;
    }
    @Override
    public void remove() {
        CacheContainer temp = dll.getLast();
        dll.removeLast();
        map.remove(temp.getKey());
        cacheCounter--;
    }

    @Override
    public void add(CacheContainer val) {
        if(cacheCounter == cacheSize)
            remove();
        if(!map.containsKey(val.getKey())) {
            map.put(val.getKey(), val);
            dll.addLast(val);
            cacheCounter++;
        }
    }

    @Override
    public String getValue(String key) {
        if(map.containsKey(key)){
            CacheContainer temp = map.get(key);
            dll.remove(map.get(key));
            dll.addFirst(temp);
            return temp.getValue();
        }
        return null;
    }
}
