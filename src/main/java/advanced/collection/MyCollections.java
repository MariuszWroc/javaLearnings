package advanced.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyCollections {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		List<Integer> integers = new LinkedList<>();
		
		Map<MyHashKey, Integer> hashMap = new HashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();

		hashMap.put(new MyHashKey("Something"), 10);
		hashMap.put(new MyHashKey("Nothing"), 20);
		hashMap.put(new MyHashKey("Other"), 30);

		for (Entry<MyHashKey, Integer> item : hashMap.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}

		Set<String> hashSets = new HashSet<>();
		hashSets.add("ala");
		hashSets.add("ma");
		hashSets.add("kota");
		hashSets.add("ma");
		
		for(String item: hashSets) {
			System.out.println(item);
		}
		
		Set<String> linkedHashSets = new LinkedHashSet<>();
		linkedHashSets.add("ala");
		linkedHashSets.add("ma");
		linkedHashSets.add("kota");
		linkedHashSets.add("ma");
		
		for(String item: linkedHashSets) {
			System.out.println(item);
		}
		
		Set<ObjectSort> tests = new TreeSet<>();
		tests.add(new ObjectSort(3, "kota "));
		tests.add(new ObjectSort(1, "ala "));
		tests.add(new ObjectSort(2, "ma "));
		
		for(ObjectSort item: tests) {
			System.out.println(item.getDescription());
		}
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1,"ala");
		linkedHashMap.put(3, "ma");
		linkedHashMap.put(2, "kota");
		linkedHashMap.put(4,"ma");
		
		for (Map.Entry<Integer, String> item : linkedHashMap.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
	}
}
