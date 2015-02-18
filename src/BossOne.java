
/**
 * 
 */

/**
 * @author chris
 *
 */
public class BossOne extends ABoss implements I_Vanish{

	/**
	 * 
	 */
	public BossOne() {
		set_name("Gilgamesh V");
		set_charType("Boss");
		set_attackStats(new AttackStats(7, 2, 20));
		set_defenseStats(new DefenseStats(100, 6, 2, 2));
		set_magicStats(new MagicStats(5, 0, 0));
		set_rateStats(new RateStats(.8, .5, .6));
		set_bossSpecial("Hack and Slash");
		set_weapon(new BroadSword());//enchanted
		set_armor(new Leather_MailArmor());//enchanted
		set_bossUpgrade(new Scroll("Scroll of Magic", "magic", 3));
	}

	@Override
	public void vanish() {
		// When boss vanishes, mob comes in, boss heals, 
		// comes back when mob is dead, or wins.
		
	}

}
