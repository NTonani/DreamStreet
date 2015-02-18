/**
 * 
 */

/**
 * @author chris
 *
 */
public class LongBow extends AHeavyWeapon {

	/**
	 * default
	 */
	public LongBow() {
		set_name("Long Bow");
		set_description("No Enchantment");
		set_bonus(0);
		set_spellDamage("");
		set_attackRating(7);
		set_boolSpellDamage(false);
		set_magicRating(0);
	}
	
	/**
	 * 
	 * @param name
	 * @param condition
	 * @param spelldamage
	 * @param attackRating
	 * @param spelldamage_
	 * @param spell_bonusRating
	 * @param attackBonus
	 */
	public LongBow(String name, String condition, String spelldamage, int attackRating,
			boolean spelldamage_, int spell_bonusRating, int attackBonus)
	{
		set_name(name);
		set_condition(condition);
		set_spellDamage(spelldamage);
		set_attackRating(attackRating);
		set_boolSpellDamage(spelldamage_);
		set_magicRating(spell_bonusRating);
		set_bonus(attackBonus);
	}



}
