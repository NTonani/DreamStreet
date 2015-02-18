

/**
 * 
 */

/**
 * @author Chris
 *
 */
public interface I_StandardActions {
	
	/**
	 * 
	 * @param character
	 */
	public void attack(AGameCharacter character);
	/**
	 * 
	 * @param character
	 */
	public void block(AGameCharacter character);
	/**
	 * 
	 * @param characters
	 */
	public void specialAttack(AGameCharacterFactory characters);
	/**
	 * 
	 * @param _specialAttack
	 */
	public void set_specialAttack(String _specialAttack);
	/**
	 * 
	 * @return
	 */
	public String specialAttack_desc();

}
