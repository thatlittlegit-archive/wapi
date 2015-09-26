package wapi.core;

import java.util.ArrayList;
import java.util.List;

public class CompiledValues extends CompiledValue {
	public List<Integer> integers = new ArrayList<Integer>();
	public List<String> strings = new ArrayList<String>();
	public List<Boolean> booleans = new ArrayList<Boolean>();
	public List<Object> objects = new ArrayList<Object>();
	
	public void add(boolean toAdd){
		booleans.add(Boolean.toBoolean(toAdd));
	}
	public void add(int toAdd){
		integers.add(new Integer(toAdd));
	}
	public void add(Object toAdd){
		objects.add(toAdd);
	}
	public void add(String toAdd){
		strings.add(toAdd);
	}
	public void add(string toAdd){
		add(toAdd.toString());
	}
	public void add(Boolean toAdd){
		booleans.add(toAdd);
	}
	public void add(java.lang.Boolean toAdd){
		booleans.add(Boolean.toBoolean(toAdd.booleanValue()));
	}
	public void add(Short toAdd){
		integers.add(toAdd.intValue());
	}
}
