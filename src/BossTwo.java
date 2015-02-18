/**
 * 
 */

/**
 * @author chris
 *
 */
public class BossTwo extends ABoss {

	/**
	 * 
	 */
	public BossTwo() {
		set_name("Gruyy Bair Lothmok");
		set_charType("Boss");
		set_attackStats(new AttackStats(6, 2, 20));
		set_defenseStats(new DefenseStats(100, 4, 2, 2));
		set_magicStats(new MagicStats(10, 3, 3));
		set_rateStats(new RateStats(.7, .3, .6));
		set_bossSpecial("Lightning Storm");
		set_weapon(new GnarledStaff());//enchanted
		set_armor(new LightPlateArmor());//enchanted
		set_bossUpgrade(new Scroll("Scroll of Strength", "attack", 4));
	}
}
