package wapidstyle.api;

public class Boolean {
	private boolean mainBoolean;
	public final Boolean falseE = new Boolean(Booleans.FALSE);
	public final Boolean trueE = new Boolean(Booleans.TRUE);
	
	public Boolean(Booleans tf){
		if(tf == Booleans.FALSE){
			mainBoolean = false;
		} else {
			mainBoolean = true;
		}
	}
	public Boolean(){
		set(false);
	}
	public Boolean(boolean b){
		set(b);
	}
	public void set(boolean b){
		mainBoolean = b;
	}
	public boolean get(){
		return mainBoolean;
	}
}
enum Booleans {
	TRUE, FALSE
}
