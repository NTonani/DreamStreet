/**
 * 
 */

/**
 * @author chris
 *
 */
public class Leather_MailArmor extends ALightArmor {

	/**
	 * default
	 */
	public Leather_MailArmor() {
		set_name("Leather/Mail Armor");
		set_spellProtection("None");
		set_armorRating(5);
		set_boolSpellProtection(false);
		set_magicRating(0,0);
	}

	/**
	 * dropped
	 * @param name
	 * @param condition
	 * @param spellProtection
	 * @param armorRating
	 * @param spellProtection_
	 * @param spell_defenseRating
	 * @param spell_bonusRating
	 */
	public Leather_MailArmor(String name, String condition, String spellProtection, int armorRating,
			boolean spellProtection_, int spell_defenseRating, int spell_bonusRating)
	{
		set_name(name);
		set_condition(condition);
		set_spellProtection(spellProtection);
		set_armorRating(armorRating);
		set_boolSpellProtection(spellProtection_);
		set_magicRating(spell_defenseRating, spell_bonusRating);
	}

}
