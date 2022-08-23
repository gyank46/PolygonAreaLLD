package com.example.Strategy;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOCacheStrategy implements CacheStrategy{
    Queue<CacheContainer> cache = new LinkedList<CacheContainer>();
    @Override
    public void remove() {
        cache.remove();
    }

    @Override
    public void add(CacheContainer  val) {
        cache.add(val);
    }

    @Override
    public String getValue(String key) {
        return null;
    }
}
