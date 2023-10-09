package edu.desu.collections.partB;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {

    // HINT: This method should initialize and return a new empty HashMap.
    public Map<String, String> createMap() {
        return new HashMap<>();
    }

    // HINT: For this method, use the 'put' method on the provided map
    // to insert the given key-value pair.
    public void insertPair(Map<String, String> map, String key, String value) {
        map.put(key,value);
    }

    // HINT: Utilize the 'remove' method on the map to get rid of the
    // key-value pair corresponding to the provided key.
    public void removePair(Map<String, String> map, String key) {
        map.remove(key);
    }

    // HINT: The 'get' method on the map can help fetch the value
    // associated with the given key. Return this value.
    public String getValue(Map<String, String> map, String key) {
        String value = map.get(key);
        return value;
    }


    // HINT: Traverse through all key-value pairs in the map and build
    // a string representation. Consider using a StringBuilder. Each key-value
    // pair can be represented as "key: value". Return this constructed string.
    public String showAllPairs(Map<String, String> map) {
        //return map.toString();
        StringBuilder print = new StringBuilder();
        for (Map.Entry<String, String> x : map.entrySet()){
            print.append(x.getKey() +": "+ x.getValue());
        }
        return print.toString();
    }
}
