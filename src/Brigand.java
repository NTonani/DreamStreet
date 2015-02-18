
/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Brigand extends ABadGuy implements I_Vanish, I_TwoHand{

	private ALightWeapon _secondHand;
	/**
	 * 
	 */
	public Brigand() {
		set_name("Brigand");
		set_charType("Brigand");
		set_attackStats(new AttackStats(6, 2, 25));
		set_defenseStats(new DefenseStats(55, 5, 0, 0));
		set_magicStats(new MagicStats(2, 0, 0));
		set_rateStats(new RateStats(.7, .3, .6));
		set_attack("Slash");
		set_specialAttack("Back Stab");
		set_weapon(new ShortSword());
		set_armor(new Leather_MailArmor());
		set_wtoDrop_one(new ShortSword());
		set_wtoDrop_two(new BroadSword());
		set_wtoDrop_three(new GnarledStaff("Whispering Wind", "Rare", "magic", 6, true, 5, 0));
		set_atoDrop_one(new Leather_MailArmor());
		set_atoDrop_two(new HeavyPlateArmor());
		set_atoDrop_three(new LightPlateArmor("Scourged PlateMail", "Rare", "fireprot", 6, true, 0, 4));
		set_utoDrop_one(new MagicPotion("Max Health", 75));
		set_utoDrop_two(new MagicPotion("Health", 20));
		set_utoDrop_three(new Scroll("Scroll Of Strength", "attack", 3));
	}
	/*
	 * (non-Javadoc)
	 * @see I_TwoHand#addSecondWeapon(ALightWeapon)
	 */
	@Override
	public void addSecondWeapon(ALightWeapon secondWeapon) {
		// TODO Auto-generated method stub
		_secondHand = secondWeapon;
	}
	/*
	 * (non-Javadoc)
	 * @see I_TwoHand#get_secondHand()
	 */
	@Override
	public ALightWeapon get_secondHand()
	{
		return _secondHand;
	}

	@Override
	public void vanish() {
		// TODO Auto-generated method stub
		
	}

}
