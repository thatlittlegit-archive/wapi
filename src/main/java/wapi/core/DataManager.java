package wapi.core;

import java.util.Hashtable;

public class DataManager {
    private static Hashtable<String, CompiledValue> data = new Hashtable<>();

    private DataManager(){}
    public static void put(String domain, String name, CompiledValue value) {
        Hashtable.put(domain + "." + name, value);
    }
    public static CompiledValue get(String domain, String name) {
        return Hashtable.get(domain + "." + name);
    }
}
