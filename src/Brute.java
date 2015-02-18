/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Brute extends ABadGuy implements I_Smash, I_Charge {

	/**
	 * 
	 */
	public Brute() {
		set_name("Brute");
		set_charType("Brute");
		set_attackStats(new AttackStats(8, 6, 15));
		set_defenseStats(new DefenseStats(75, 7, 0, 0));
		set_magicStats(new MagicStats(0, 0, 0));
		set_rateStats(new RateStats(.6, .7, .4));
		set_attack("Gouge");
		set_specialAttack("Swipe");
		set_specialAttackDmg(15);
		set_weapon(new PikeStaff());
		set_armor(new HeavyPlateArmor());
		set_wtoDrop_one(new ShortSword());
		set_wtoDrop_two(new BroadSword());
		set_wtoDrop_three(new PikeStaff("Head Pole", "Rare", "attack", 8, false, 0, 4));
		set_atoDrop_one(new Leather_MailArmor());
		set_atoDrop_two(new HeavyPlateArmor());
		set_atoDrop_three(new HeavyPlateArmor("Impenetrable", "Rare", "prot", 10, true, 0, 10));
		set_utoDrop_one(new MagicPotion("Health", 20));
		set_utoDrop_two(new MagicPotion("Strength" , 2));
		set_utoDrop_three(new Scroll("Scroll Of Strength", "attack", 3));
	}

	@Override
	public void charge(AGameCharacterFactory characters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smash(AGameCharacter character) {
		// TODO Auto-generated method stub
		
	}

}
