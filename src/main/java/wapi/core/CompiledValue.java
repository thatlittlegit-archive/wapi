package wapi.core;

import wapi.shortcut.string;

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
	
	public Integer set(Integer toAdd){integer = toAdd;return toAdd}
	public int set(int toAdd){set(new Integer(toAdd));return toAdd}
	public String set(String toAdd){string = toAdd;return toAdd}
	public string set(string toAdd){set(toAdd.toString());return toAdd}
	public Boolean set(Boolean toAdd){bool = toAdd;return toAdd}
	public java.lang.Boolean set(java.lang.Boolean toAdd){set(new Boolean(toAdd.booleanValue()));return toAdd}
	public boolean set(boolean toAdd){set(new Boolean(toAdd));return toAdd}
	
	public CompiledValue(boolean toSet){set(set);}
	public CompiledValue(Boolean toSet){set(set);}
	public CompiledValue(java.lang.Boolean toSet){set(set);}
	public CompiledValue(String toSet){set(set);}
	public CompiledValue(string toSet){set(set);}
	public CompiledValue(Integer toSet){set(set);}
	public CompiledValue(int toSet){set(set);}
	}
}
