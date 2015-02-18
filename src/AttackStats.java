/**
 * 
 */

/**
 * @author chris
 *
 */
public class AttackStats extends AStats {

	private int _attackRating;//strength
	private int _attackSpeed;//speed
	private int _specialAttackDmg;
	/**
	 * 
	 * @param attackRating
	 * @param attackSpeed
	 * @param specialAttackDmg
	 */
	public AttackStats(int attackRating, int attackSpeed, int specialAttackDmg)
	{ 
		_attackRating = attackRating;
		_attackSpeed = attackSpeed;
		_specialAttackDmg = specialAttackDmg;
	}
	/**
	 * 
	 * @return
	 */
	public int get_attackRating() {
		return _attackRating;
	}
	/**
	 * @param _attackRating
	 */
	public void set_attackRating(int _attackRating) {
		this._attackRating = _attackRating;
	}
	/**
	 * 
	 * @return
	 */
	public int get_attackSpeed() {
		return _attackSpeed;
	}
	/**
	 * 
	 * @param _attackSpeed
	 */
	public void set_attackSpeed(int _attackSpeed) {
		this._attackSpeed = _attackSpeed;
	}
	/**
	 * 
	 * @return
	 */
	public int get_specialAttackDmg() {
		return _specialAttackDmg;
	}
	/**
	 * 
	 * @param _specialAttackDmg
	 */
	public void set_specialAttackDmg(int _specialAttackDmg) {
		this._specialAttackDmg = _specialAttackDmg;
	}

}
