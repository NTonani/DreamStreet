/**
 * 
 */

/**
 * @author chris
 *
 */
public class PikeStaff extends AHeavyWeapon {

	/**
	 * default
	 */
	public PikeStaff() {
		set_name("Pike Staff");
		set_description("No Enchantment");
		set_bonus(0);
		set_spellDamage("");
		set_attackRating(8);
		set_boolSpellDamage(false);
		set_magicRating(0);
	}

	/**
	 * dropped
	 * @param name
	 * @param condition
	 * @param spelldamage
	 * @param attackRating
	 * @param spelldamage_
	 * @param spell_bonusRating
	 * @param attackBonus
	 */
	public PikeStaff(String name, String condition, String spelldamage, int attackRating,
			boolean spelldamage_, int spell_bonusRating, int attackBonus)
	{
		set_name(name);
		set_condition(condition);
		set_spellDamage(spelldamage);
		set_attackRating(attackRating);
		set_boolSpellDamage(spelldamage_);
		set_bonus(attackBonus);
		set_magicRating(spell_bonusRating);
	}

}
