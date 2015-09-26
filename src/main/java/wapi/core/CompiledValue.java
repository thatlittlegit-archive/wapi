package wapi.core;

public class CompiledValue {
	public Integer integer;
	public String string;
	public Boolean bool;
	/** @deprecated */
	public Boolean boolean1;
	/** @deprecated */
	public boolean boolean2;
	/** @deprecated */
	public static CompiledValue nulld = null;
	public static CompiledValue nil = null;
	
	public void set(Integer toAdd){integer = toAdd;}
	public void set(int toAdd){set(new Integer(toAdd));}
	public void set(String toAdd){string = toAdd;}
	public void set(string toAdd){set(toAdd.toString());}
	public void set(Boolean toAdd){bool = toAdd;}
	public void set(java.lang.Boolean toAdd){set(new Boolean(toAdd.booleanValue()));}
	public void set(boolean toAdd){set(new Boolean(toAdd));
	}
}
