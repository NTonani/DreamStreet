/**
 * 
 */

/**
 * @author chris
 *
 */
public class Shield extends AUpgrade {

	/**
	 * default
	 */
	public Shield() {
		set_name("Shield");
		set_description("armor");
		set_bonus(5);
	}
	
	/**
	 * dropped
	 * @param name
	 * @param desc
	 * @param bonus
	 */
	public Shield(String name, String desc, int bonus)
	{
		set_name(name);
		set_description(desc);
		set_bonus(bonus);
	}

}
