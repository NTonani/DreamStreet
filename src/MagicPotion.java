/**
 * 
 */

/**
 * @author chris
 *
 */
public class MagicPotion extends AUpgrade {

	/**
	 * 
	 * @param type
	 * @param bonus
	 */
	public MagicPotion(String type, int bonus) {
		set_name(type + " potion");
		set_description(type);
		set_bonus(bonus);
	}

}
