/**
 * 
 */

/**
 * @author chris
 *
 */
public class DefenseStats extends AStats {
	
	private int _health;
	private int _maxHealth;
	private int _defenseRating;
	private int _fireprot;
	private int _iceprot;
	/**
	 * 
	 * @param health
	 * @param defenseRating
	 * @param fireprot
	 * @param iceprot
	 */
	public DefenseStats(int health, int defenseRating, int fireprot, int iceprot) 
	{
		_maxHealth = _health = health;
		_defenseRating = defenseRating;
		_fireprot = fireprot;
		_iceprot = iceprot;
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
	 * @param _defenseRating
	 */
	public void set_defenseRating(int _defenseRating) {
		this._defenseRating = _defenseRating;
	}
	/**
	 * 
	 * @return
	 */
	public int get_health() {
		return _health;
	}
	/**
	 * 
	 * @param _health
	 */
	public void set_health(int _health) {
		this._health = _health;
	}
	/**
	 * 
	 * @return
	 */
	public int get_fireprot() {
		return _fireprot;
	}
	/**
	 * 
	 * @param _fireprot
	 */
	public void set_fireprot(int _fireprot) {
		this._fireprot = _fireprot;
	}
	/**
	 * 
	 * @return
	 */
	public int get_iceprot() {
		return _iceprot;
	}
	/**
	 * 
	 * @param _iceprot
	 */
	public void set_iceprot(int _iceprot) {
		this._iceprot = _iceprot;
	}
	/**
	 * 
	 * @return
	 */
	public int get_maxHealth() {
		return _maxHealth;
	}
	/**
	 * 
	 * @param _maxHealth
	 */
	public void set_maxHealth(int _maxHealth) {
		this._maxHealth = _maxHealth;
	}

}
