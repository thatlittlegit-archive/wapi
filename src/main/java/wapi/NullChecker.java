package wapi;

public class NullChecker {
	public static boolean isNull(Object o) {
		try {
			if(o == null) {
				return true;
			} else {
				return false;
			}
		} catch (NullPointerException e) {
			return false;
		}
	}
}
