package wapidstyle.api.exception;

/**
 * This exception is caused when you try to play an effect on an entity that does not support that effect.
 * 
 * For example:
 * <code>
 * zombie.effect(EntityEffect.VILLAGER_HAPPY);
 * </code>
 * 
 * That would throw this due to the fact that, without client mods, a Zombie can't do
 * "Villager Happy".
 * @author wapidstyle
 */
public class InvalidEffectException extends Exception {
	private static final long serialVersionUID = 5174578875923505992L;
}
