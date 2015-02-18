/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class AWeapon extends AItem {

	private String _condition;
	private String _spellDamage;
	private int _attackRating;
	private int _magicRating;
	private boolean _boolSpellDamage;
	/**
	 * 
	 * @return
	 */
	public String get_spellDamage() {
		return _spellDamage;
	}
	/**
	 * 
	 * @param _spellDamage
	 */
	public void set_spellDamage(String _spellDamage) {
		this._spellDamage = _spellDamage;
	}
	/**
	 * 
	 * @return
	 */
	public int get_attackRating() {
		return _attackRating;
	}
	/**
	 * 
	 * @param _attackRating
	 */
	public void set_attackRating(int _attackRating) {
		this._attackRating = _attackRating;
	}
	/**
	 * 
	 * @return
	 */
	public int get_magicRating() {
		return _magicRating;
	}
	/**
	 * 
	 * @param _magicRating
	 */
	public void set_magicRating(int _magicRating) {
		this._magicRating = _magicRating;
	}
	/**
	 * 
	 * @return
	 */
	public boolean is_boolSpellDamage() {
		return _boolSpellDamage;
	}
	/**
	 * 
	 * @param _boolSpellDamage
	 */
	public void set_boolSpellDamage(boolean _boolSpellDamage) {
		this._boolSpellDamage = _boolSpellDamage;
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
