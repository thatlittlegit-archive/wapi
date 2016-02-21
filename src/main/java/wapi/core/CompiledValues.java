package wapi.core;

import java.util.ArrayList;
import java.util.List;
import wapi.shortcut.string;

public class CompiledValues extends CompiledValue {
	/** @deprecated Use numbers instead */
	public List<Integer> integers = new ArrayList<Integer>();
	public List<Long> numbers = new ArrayList<Long>();
	public List<String> strings = new ArrayList<String>();
	public List<Boolean> booleans = new ArrayList<Boolean>();
	public List<Object> objects = new ArrayList<Object>();
	
	public void add(boolean toAdd){
		booleans.add(Boolean.toBoolean(toAdd));
	}
	public void add(Short toAdd){
		numbers.add(new Long(toAdd));
	}
	public void add(int toAdd){
		numbers.add(new Long(toAdd));
	}
	public void add(long toAdd){
		numbers.add(new Long(toAdd));
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
	
	public long getLong(int index){
		return numbers.get(index).longValue();
	}
	public int getInt(int index){
		return numbers.get(index).intValue();
	}
	public short getShort(int index){
		return numbers.get(index).shortValue();
	}
	public byte getByte(int index){
		return numbers.get(index).byteValue();
	}
}
