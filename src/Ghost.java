/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Ghost extends ABadGuy implements I_Blink, I_Cast {

	/**
	 * 
	 */
	public Ghost() {
		set_name("Ghost");
		set_charType("Ghost");
		set_attackStats(new AttackStats(6, 2, 25));
		set_defenseStats(new DefenseStats(25, 10, 0, 0));
		set_magicStats(new MagicStats(7, 0, 0));
		set_rateStats(new RateStats(.5, 1, .5));
		set_specialAttack("Possess");
		set_specialAttackDmg(10);
		set_weapon(new Dagger());
		set_armor(new ClothArmor());
		set_wtoDrop_one(new BroadSword());
		set_wtoDrop_two(new CrossBow());
		set_wtoDrop_three(new Dagger("Rusty Nail", "Rare", "shadowdmg", 6, true, 4, 4));
		set_atoDrop_one(new Leather_MailArmor());
		set_atoDrop_two(new ClothArmor());
		set_atoDrop_three(new ClothArmor("Tattered Rags", "Rare", "iceprot", 3, true, 4, 0));
		set_utoDrop_one(new MagicPotion("Health", 20));
		set_utoDrop_two(new MagicPotion("Ice" , 10));
		set_utoDrop_three(new MagicPotion("Max Health", 75));
	}

	@Override
	public void spell(AGameCharacter character) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void blink() {
		// TODO Auto-generated method stub
		
	}

}
