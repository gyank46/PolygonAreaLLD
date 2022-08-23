package com.example.Strategy;

public class CacheStrategyFactory {

        public static CacheStrategy getInstance(String cacheStrategy,int size){

            if(cacheStrategy == CacheStrategies.FIFO.name())
                return new FIFOCacheStrategy(size);

            if(cacheStrategy == CacheStrategies.LIFO.name())
                return new LIFOCacheStrategy(size);

            if(cacheStrategy == CacheStrategies.LRU.name())
                return new LRUCacheStrategy(size);
            return null;

        }

}
