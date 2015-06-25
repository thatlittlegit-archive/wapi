package wapidstyle.api;

public class CompiledValue {
	public int integer;
	public Integer integer2;
	public String string;
	public Boolean boolean1;
	public boolean boolean2;
	public static CompiledValue nulld = null;
	
	public static CompiledValue convertInt(Integer toConvert){
		CompiledValue cv = new CompiledValue();
		cv.integer = toConvert;
		return cv;
	}
	public static CompiledValue convertInt(int toConvert){
		return convertInt(new Integer(toConvert));
	}
	public static CompiledValue convertString(String toConvert){
		CompiledValue cv = new CompiledValue();
		cv.string = toConvert;
		return cv;
	}
	public static CompiledValue convertString(string toConvert){
		return convertString(toConvert.toString());
	}
	public static CompiledValue convertBoolean(boolean toConvert){
		CompiledValue cv = new CompiledValue();
		cv.boolean2 = toConvert;
		return cv;
	}
	public static CompiledValue convertBoolean(Boolean toConvert){
		return convertBoolean(toConvert.fresh);
	}
}
