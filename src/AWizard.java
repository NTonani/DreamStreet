/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class AWizard extends ACaster {

	private double _healChance;
	/**
	 * @param healChance
	 */
	public AWizard(double healChance) {
		set_attackStats(new AttackStats(3, 5, 0));
		set_defenseStats(new DefenseStats(75, 3, 0, 0));
		set_magicStats(new MagicStats(7, 0, 0));
		set_rateStats(new RateStats(.5, .3, .6));
		set_spellChance(.6);
		set_weapon(new GnarledStaff());
		set_armor(new ClothArmor());
		set_inventory(new Inventory());
		_healChance = healChance;
	}
	/**
	 * 
	 * @return
	 */
	public double get_healChance() {
		return _healChance;
	}
	/**
	 * 
	 * @param _healChance
	 */
	public void set_healChance(double _healChance) {
		this._healChance = _healChance;
	}	

}
