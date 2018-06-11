package wapi;

import java.util.ArrayList;
import java.util.List;

public class CompiledValues extends CompiledValue {
    public List<Integer> integers = new ArrayList<Integer>();
    public List<String> strings = new ArrayList<String>();
    public List<java.lang.Boolean> booleans = new ArrayList<java.lang.Boolean>();
    public List<Object> objects = new ArrayList<Object>();

    public boolean add(boolean toAdd){booleans.add(toAdd);return toAdd;}
    public int add(int toAdd){integers.add(new Integer(toAdd));return toAdd;}
    public Object add(Object toAdd){objects.add(toAdd);return toAdd;}
    public String add(String toAdd){strings.add(toAdd);return toAdd;}
    public java.lang.Boolean add(java.lang.Boolean toAdd){add(toAdd.booleanValue());return toAdd;}
}
