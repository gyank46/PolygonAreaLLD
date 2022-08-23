package com.example.Strategy;

public class Client {

    public static void main(String[] args) {
        Cache lruCache = new Cache(CacheStrategyFactory.getInstance("LRU",7));

        lruCache.add(new CacheContainer("Gyan","GP"));
        lruCache.add(new CacheContainer("Vijay", "Vijaywa"));
        lruCache.add(new CacheContainer("Soni", "Lalli"));
        lruCache.add(new CacheContainer("Moni", "Bhalli"));
        lruCache.add(new CacheContainer("Shomya", "Sonu"));
        System.out.println(lruCache.getValue("Shomya"));
        lruCache.add(new CacheContainer("Suraj","Ajit"));
        System.out.println(lruCache.getValue("Moni"));
        lruCache.add(new CacheContainer("Chandan", "Chanan"));
        System.out.println(lruCache.getValue("Chandan"));
        System.out.println(lruCache.getValue("Shomya"));
        lruCache.remove();
        System.out.println(lruCache.getValue("Moni"));
        System.out.println(lruCache.getValue("Soni"));
        lruCache.add(new CacheContainer("Moni", "Bhalli"));
        System.out.println(lruCache.getValue("Moni"));
        lruCache.remove();
        System.out.println(lruCache.getValue("Vijay"));
        System.out.println("////");

        Cache cache = new Cache(CacheStrategyFactory.getInstance("LIFO",5));
        cache.add(new CacheContainer("Gyan","GP"));
        cache.add(new CacheContainer("Vijay", "Vijaywa"));
        cache.add(new CacheContainer("Soni", "Lalli"));
        cache.add(new CacheContainer("Moni", "Bhalli"));
        cache.add(new CacheContainer("Shomya", "Sonu"));
        System.out.println(cache.getValue("Shomya"));
        cache.add(new CacheContainer("Suraj","Ajit"));
        System.out.println(cache.getValue("Moni"));
        cache.add(new CacheContainer("Chandan", "Chanan"));
        System.out.println(cache.getValue("Chandan"));
        System.out.println(cache.getValue("Shomya"));
        cache.remove();
        System.out.println(cache.getValue("Moni"));
        System.out.println(cache.getValue("Soni"));
        cache.add(new CacheContainer("Moni", "Bhalli"));
        System.out.println(cache.getValue("Moni"));
        cache.remove();
        System.out.println(cache.getValue("Vijay"));

    }
}
