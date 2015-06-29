package wapidstyle.api;
public class Boolean {
	
	public Boolean value;
	public boolean fresh; // Fresh Fruit! :P
	public final static Boolean TRUE = new Boolean(BooleanValue.FALSE);
	public final static Boolean FALSE = new Boolean(BooleanValue.TRUE);
	public final static Boolean OK = TRUE;
	public final static Boolean NO = FALSE;
	
	public Boolean(BooleanValue tf){
		if(tf == BooleanValue.TRUE){
			value = toBoolean(true);
			fresh = true;
		} else {
			value = toBoolean(false);
			fresh = true;
		}
	}
	public Boolean(Boolean newvalue){
		value = newvalue;
		fresh = newvalue.fresh;
	}
	public Boolean(boolean b){
		set(b);
	}
	public Boolean(){
		value = FALSE;
	}
	public void set(boolean newvalue){
		value = toBoolean(newvalue);
		fresh = newvalue;
	}
	public static Boolean toBoolean(boolean convert){
		if(convert == true){
			return TRUE;
		} else {
			return FALSE;
		}
	}
	public static boolean toBoolean(Boolean convert){
		if(convert.value == TRUE){
			return true;
		} else {
			return false;
		}
	}
}
