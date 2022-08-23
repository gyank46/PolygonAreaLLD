package com.example.Strategy;

import java.util.Stack;

public class LIFOCacheStrategy implements CacheStrategy{
    Stack<CacheContainer> cache = new Stack<CacheContainer>();
    @Override
    public void remove() {
        cache.pop();
    }

    @Override
    public void add(CacheContainer val) {
        cache.add(val);
    }

    @Override
    public String getValue(String key) {
        return null;
    }
}
