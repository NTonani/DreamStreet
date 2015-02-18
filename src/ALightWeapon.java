/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class ALightWeapon extends AWeapon {

	private String _enchantment;
	private int _enchantmentBonus;
	/**
	 * 
	 * @return
	 */
	public String get_enchantment() {
		return _enchantment;
	}
	/**
	 * 
	 * @param _enchantment
	 */
	public void set_enchantment(String _enchantment) {
		this._enchantment = _enchantment;
	}
	/**
	 * 
	 * @return
	 */
	public int get_enchantmentBonus() {
		return _enchantmentBonus;
	}
	/**
	 * 
	 * @param _enchantmentBonus
	 */
	public void set_enchantmentBonus(int _enchantmentBonus) {
		this._enchantmentBonus = _enchantmentBonus;
	}

}
