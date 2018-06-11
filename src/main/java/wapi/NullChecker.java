package wapi;

/** @deprecated */
@Deprecated
public class NullChecker {
	public static boolean isNull(Object o) {
		try {
			return o == null;
		} catch (NullPointerException e) {
			return false;
		}
	}
}
