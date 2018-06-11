package wapi;

public class CompiledValue {
    public Integer integer;
    public String string;
    public java.lang.Boolean bool;
    /** @deprecated */
    public static CompiledValue nulld = null;
    public static CompiledValue nil = null;

    public Integer set(Integer toAdd){integer = toAdd;return toAdd;}
    public int set(int toAdd){set(new Integer(toAdd));return toAdd;}
    public String set(String toAdd){string = toAdd;return toAdd;}
    public java.lang.Boolean set(java.lang.Boolean toAdd){set(toAdd.booleanValue());return toAdd;}
    public boolean set(boolean toAdd){bool = toAdd;return toAdd;}

    public CompiledValue(){}
    public CompiledValue(boolean toSet){set(toSet);}
    public CompiledValue(java.lang.Boolean toSet){set(toSet);}
    public CompiledValue(String toSet){set(toSet);}
    public CompiledValue(Integer toSet){set(toSet);}
    public CompiledValue(int toSet){set(toSet);}
}
