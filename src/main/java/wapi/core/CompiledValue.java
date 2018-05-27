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

    public Integer set(Integer toAdd){integer = toAdd;return toAdd;}
    public int set(int toAdd){set(new Integer(toAdd));return toAdd;}
    public String set(String toAdd){string = toAdd;return toAdd;}
    public Boolean set(Boolean toAdd){bool = toAdd;return toAdd;}
    public java.lang.Boolean set(java.lang.Boolean toAdd){set(new Boolean(toAdd.booleanValue()));return toAdd;}
    public boolean set(boolean toAdd){set(new Boolean(toAdd));return toAdd;}

    public CompiledValue(){}
    public CompiledValue(boolean toSet){set(toSet);}
    public CompiledValue(Boolean toSet){set(toSet);}
    public CompiledValue(java.lang.Boolean toSet){set(toSet);}
    public CompiledValue(String toSet){set(toSet);}
    public CompiledValue(Integer toSet){set(toSet);}
    public CompiledValue(int toSet){set(toSet);}
}
