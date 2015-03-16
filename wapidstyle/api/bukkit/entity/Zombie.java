/* 
  This code is under the MIT License. Do whatever the heck you want as long as you give me credit.
*/

package wapidstyle.api.bukkit.entity;

import wapidstyle.api.exception.*;
import org.bukkit.entity.*;

/**
 * 
 * @author wapidstyle
 * @version 1.0
 * @since wapi1.0
 * A class to allow you to modify a or spawn a zombie at a X, Y and Z coordinate.
 *
 */
public class Zombie{
	
	int status = 0;
	InvalidMethodException ime = new InvalidMethodException();
	
  /**
   * For technical programmers: get the current status of the process. (If -1, then something bad happened.)
   * @return status - the status of the program
   */
  public int getStatus(){
	  return status;
  }
  
  /**
   * Checks if the zombie is a baby.
   * @param zombie - who to check
   * @return baby - the status of if the zombie is a baby
   */
  public boolean isBaby(org.bukkit.entity.Zombie zombie){
	  boolean baby = zombie.isBaby();
	  return baby;
  }
  
  /**
   * Sets if the zombie is a baby or not.
   * @param type - if to be baby
   * @param zombie - to apply it to
   */
  public void isBaby(boolean type, org.bukkit.entity.Zombie zombie){
	  zombie.setBaby(type);
  }
  
  /**
   * Checks if the zombie is a villager.
   * @param zombie - who to check (org.bukkit.entity.Zombie)
   * @return villager - is it a villager? (boolean)
   */
  public boolean isVillager(org.bukkit.entity.Zombie zombie){
	  boolean villager = zombie.isVillager();
	  return villager;
  }
  
  /**
   * Sets if the zombie is a villager.
   * @param zombie - the zombie to modify (org.bukkit.entity.Zombie)
   * @param type - yes or no (boolean)
   */
  public void isVillager(org.bukkit.entity.Zombie zombie, boolean type){
	  zombie.setVillager(type);
  }
  
  /**
   * Gets the max health of the zombie.
   * @param zombie - the zombie to check (org.bukkit.entity.Zombie)
   * @return health - it's health (double)
   */
  public double maxHealth(org.bukkit.entity.Zombie zombie){
	  double health = zombie.getMaxHealth();
	  return health;
  }
  
  /**
   * Sets the max health of the zombie. For big zombie bosses? (Let me be creative.)
   * @param Which zombie? (org.bukkit.entity.Zombie)
   * @param What should the maximum health be? (double)
   */
  public void maxHealth(org.bukkit.entity.Zombie zombie, double health){
	  zombie.setMaxHealth(health);
  }
  
  /** Resets the max health of the zombie. Use with care.
   * @param Which zombie?
   * @param Permission to do so. (Throws an InvalidMethodException if false)
   */
  public void maxHealth(org.bukkit.entity.Zombie zombie, boolean sure) throws InvalidMethodException{
	  if(sure == true){
		 zombie.resetMaxHealth(); 
	  }
	  else{
		  throw ime;
	  }
  }
  
  /**
   * What, I can't have fun?
   * (Does nothing)
   * @deprecated
   */
  public void Δ(){} // I was having fun, OK?
  
  /**
   * Gets the current health of a zombie.
   * @param Which zombie? (org.bukkit.entity.Zombie)
   * @return The current health of the zombie. (double)
   */
  public double health(org.bukkit.entity.Zombie zombie){
	  double health = zombie.getHealth();
	  return health;
  }
  
  /**
   * Sets the current health of a zombie.
   * Use damage() for damaging, dispite the fact it is possible.
   * (value = zombie.getHealth(zombie) - (however much to remove);)
   * @param Which zombie again? (org.bukkit.entity.Zombie)
   * @param How much. 0 is dead. (double)
   * I make crummy jokes.
   */
  public void health(org.bukkit.entity.Zombie zombie, double value){
	  zombie.setHealth(value);
  }
  
  /**
   * Damages a zombie.
   * @param I don't remember which zombie. (org.bukkit.entity.Zombie)
   * @param How many times to fist him? (double)
   */
  public void damage(org.bukkit.entity.Zombie zombie, double damage){
	  zombie.damage(damage);
  }
  
  /**
   * Damages a zombie because of another entity. SUPERPIG!
   * (zombie.damage(zombie,pig,10.0))
   * @param Which zombie?
   * @param Who is a superhero?
   * @param What damage do they deal?
   */
  public void damage(org.bukkit.entity.Zombie zombie, Entity who, double damage){
	  zombie.damage(damage);
  }
  
 /**
  * I think it ejects?
  * @param Who's the zombie?
  */
  public boolean eject(org.bukkit.entity.Zombie zombie){
	  boolean passenger = zombie.eject();
	  zombie.eject();
	  return passenger;
  }
} 
