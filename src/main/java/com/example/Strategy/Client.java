package com.example.Strategy;

public class Client {

    public static void main(String[] args) {
        Cache cache = new Cache(new LRUCacheStrategy(), 6);

        cache.add(new CacheContainer("Gyan","GP"));
        cache.add(new CacheContainer("Vijay", "Vijaywa"));
        cache.add(new CacheContainer("Soni", "Lalli"));
        cache.add(new CacheContainer("Moni", "Bhalli"));
        cache.add(new CacheContainer("Shomya", "Sonu"));
        cache.add(new CacheContainer("Suraj","Ajit"));
        cache.add(new CacheContainer("Chandan", "Chanan"));
        System.out.println(cache.getValue("Chandan"));
//        System.out.println(cache.getValue("Gyan"));
        System.out.println(cache.getValue("Shomya"));
        cache.remove();
        System.out.println(cache.getValue("Moni"));
        System.out.println(cache.getValue("Soni"));
        cache.add(new CacheContainer("Moni", "Bhalli"));
        System.out.println(cache.getValue("Moni"));
        cache.remove();
        System.out.println(cache.getValue("Vijay"));
        int a = 3;
    }
}
