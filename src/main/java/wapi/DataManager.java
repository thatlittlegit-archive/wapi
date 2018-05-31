package wapi;

import java.util.Hashtable;

public class DataManager {
    private static Hashtable<String, CompiledValue> data = new Hashtable<>();

    private DataManager(){}
    public static void put(String domain, String name, CompiledValue value) {
        data.put(domain + "." + name, value);
    }
    public static CompiledValue get(String domain, String name) {
        return (CompiledValue) data.get(domain + "." + name);
    }

    public static boolean contains(String domain, String name) {
	return data.contains(domain + "." + name);
    }
}
