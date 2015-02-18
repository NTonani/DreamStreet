/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class AArmor extends AItem {

	private String _spellProtection;
	private String _condition;
	private int _armorRating;
	private boolean _boolSpellProtection;
	private int _defenseRating;
	private int _bonusRating;
	/**
	 * 
	 * @return
	 */
	public String get_spellProtection() {
		return _spellProtection;
	}
	/**
	 * 
	 * @param _spellProtection
	 */
	public void set_spellProtection(String _spellProtection) {
		this._spellProtection = _spellProtection;
	}
	/**
	 * 
	 * @return
	 */
	public int get_armorRating() {
		return _armorRating;
	}
	/**
	 * 
	 * @param _armorRating
	 */
	public void set_armorRating(int _armorRating) {
		this._armorRating = _armorRating;
	}
	/**
	 * 
	 * @return
	 */
	public boolean is_boolSpellProtection() {
		return _boolSpellProtection;
	}
	/**
	 * 
	 * @param _boolSpellProtection
	 */
	public void set_boolSpellProtection(boolean _boolSpellProtection) {
		this._boolSpellProtection = _boolSpellProtection;
	}
	/**
	 * 
	 * @param regAttack
	 * @param bonusRating
	 */
	public void set_magicRating(int regAttack, int bonusRating) {
		// TODO Auto-generated method stub
		this._defenseRating = regAttack;
		set_bonus(bonusRating);
	}
	/**
	 * 
	 * @return
	 */
	public int get_defenseRating() {
		return _defenseRating;
	}
	/**
	 * 
	 * @return
	 */
	public int get_bonusRating() {
		return _bonusRating;
	}
	/**
	 * 
	 * @return
	 */
	public String get_condition() {
		return _condition;
	}
	/**
	 * 
	 * @param _condition
	 */
	public void set_condition(String _condition) {
		this._condition = _condition;
	}

}
