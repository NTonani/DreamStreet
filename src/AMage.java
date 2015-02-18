
/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class AMage extends ACaster implements I_Blink {

	/**
	 * 
	 */
	public AMage() {
		set_attackStats(new AttackStats(2, 4, 0));
		set_defenseStats(new DefenseStats(65, 3, 0, 0));
		set_magicStats(new MagicStats(8, 0, 0));
		set_rateStats(new RateStats(.4, .4, .5));
		set_spellChance(.7);
		set_weapon(new BowieKnife());
		set_armor(new Leather_MailArmor());
		set_inventory(new Inventory());
	}
	/*
	 * (non-Javadoc)
	 * @see ACaster#heal()
	 */
	@Override
	public void heal() {
		// flash heal regardless of turn
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_Blink#blink()
	 */
	@Override
	public void blink() {
		// shift in a random direction on the map
		
	}
	

}
