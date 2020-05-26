package advanced.collection;

import java.util.HashMap;

public class GFG { 
    public static void main(String[] args) 
    { 
        HashMap<MyHashKey, Integer> map = new HashMap<>(); 
        map.put(new MyHashKey("vishal"), 20); 
        map.put(new MyHashKey("sachin"), 30); 
        map.put(new MyHashKey("vaibhav"), 40); 
  
        System.out.println(); 
        System.out.println("Value for key sachin: " + map.get(new MyHashKey("sachin"))); 
        System.out.println("Value for key vaibhav: " + map.get(new MyHashKey("vaibhav"))); 
        System.out.println("Value for key vishal: " + map.get(new MyHashKey("vishal"))); 
    } 
} 
