package wapidstyle.api.exception;
/**
 * This exception is a exception thrown due to when a plugin/mod/software developer attempts to
 * respond "false" to a method requiring "true" to confirm an action.
 * 
 * For example:
 * 
 * <code>public void resetHealth(){
 * zombie.maxHealth(zombie, <u>false</u>);
 * }</code>
 * 
 * That is perfectly fine (as long as zombie is described as a variable of type
 * wapidstyle.api.bukkit.entity.Zombie). However, let's look at the declaration
 * of the maxHealth() method. There are three, however this is the one that I used
 * above:
 * 
 * <code>public void maxHealth(org.bukkit.entity.Zombie zombie, <u>boolean sure</u>) throws InvalidMethodException</code>
 * 
 * Notice the underlined <code>boolean sure</code>. Then, let's look at the method.
 * 
 * <code>if<u>(sure == true)</u>{
 *  	 zombie.resetMaxHealth(); 
 *  }</code>
 *  
 * In the else section, a InvalidMethodException is thrown.
 * @author wapidstyle
 *
 */
public class InvalidMethodException extends Exception {
	private static final long serialVersionUID = 1L;
}
