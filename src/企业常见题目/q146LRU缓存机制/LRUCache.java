package 企业常见题目.q146LRU缓存机制;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache  extends LinkedHashMap<Integer,Integer>{
    int capacity;
    public LRUCache(int capacity) {
        super(capacity,0.75F,true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size()>capacity;
    }
}
