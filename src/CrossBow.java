/**
 * 
 */

/**
 * @author chris
 *
 */
public class CrossBow extends ALightWeapon {

	/**
	 * default
	 */
	public CrossBow() {
		set_name("Cross Bow");
		set_description("No Enchantment");
		set_bonus(0);
		set_spellDamage("");
		set_attackRating(5);
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
	 */
	public CrossBow(String name, String condition, String spelldamage, int attackRating,
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
