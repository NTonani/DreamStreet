/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Skeleton extends ABadGuy implements I_Cast, I_GroupHeal {

	/**
	 *
	 */
	public Skeleton() {
		set_name("Skeleton");
		set_charType("Skeleton");
		set_attackStats(new AttackStats(5, 2, 15));
		set_defenseStats(new DefenseStats(45, 3, 0, 0));
		set_magicStats(new MagicStats(4, 0, 0));
		set_rateStats(new RateStats(.6, .3, .6));
		set_attack("Stab");
		set_specialAttack("Bone Dance");
		set_specialAttackDmg(15);
		set_weapon(new ShortSword());
		set_armor(new Leather_MailArmor());
		set_wtoDrop_one(new HuntingKnife());
		set_wtoDrop_two(new LongBow());
		set_wtoDrop_three(new HuntingKnife("Bone Collector", "Rare", "attack", 6, false, 0, 4));
		set_atoDrop_one(new Leather_MailArmor());
		set_atoDrop_two(new LightPlateArmor());
		set_atoDrop_three(new Leather_MailArmor("Burnt Chains", "Rare", "fireprot", 6, true, 4, 0));
		set_utoDrop_one(new MagicPotion("Fire", 10));
		set_utoDrop_two(new MagicPotion("Strength", 2));
		set_utoDrop_three(new Scroll("Scroll Of Healing", "health", 15));
	}

	@Override
	public void groupHeal(AGameCharacterFactory characters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spell(AGameCharacter character) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		
	}

}
