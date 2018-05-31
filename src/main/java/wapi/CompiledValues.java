package wapi;

import java.util.ArrayList;
import java.util.List;

public class CompiledValues extends CompiledValue {
    public List<Integer> integers = new ArrayList<Integer>();
    public List<String> strings = new ArrayList<String>();
    public List<Boolean> booleans = new ArrayList<Boolean>();
    public List<Object> objects = new ArrayList<Object>();

    public boolean add(boolean toAdd){booleans.add(Boolean.toBoolean(toAdd));return toAdd;}
    public int add(int toAdd){integers.add(new Integer(toAdd));return toAdd;}
    public Object add(Object toAdd){objects.add(toAdd);return toAdd;}
    public String add(String toAdd){strings.add(toAdd);return toAdd;}
    public Boolean add(Boolean toAdd){booleans.add(toAdd);return toAdd;}
    public java.lang.Boolean add(java.lang.Boolean toAdd){add(Boolean.toBoolean(toAdd.booleanValue()));return toAdd;}
}
