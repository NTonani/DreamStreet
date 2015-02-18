/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class AHeavyWeapon extends AWeapon {

	private int _attackBonusRating;

	/**
	 * 
	 * @return
	 */
	public int get_attackBonusRating()
	{
		return _attackBonusRating;
	}
	/**
	 * 
	 * @param attackRating
	 */
	public void set_attackBonusRating(int attackRating)
	{
		this._attackBonusRating = attackRating;
	}
}
