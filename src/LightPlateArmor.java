/**
 * 
 */

/**
 * @author chris
 *
 */
public class LightPlateArmor extends AHeavyArmor {

	/**
	 * default
	 */
	public LightPlateArmor() {
		set_name("Plate/Mail Armor");
		set_condition("New");
		set_spellProtection("");
		set_armorRating(6);
		set_boolSpellProtection(false);
		set_magicRating(0, 0);
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
	public LightPlateArmor(String name, String condition, String spellProtection, int armorRating,
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
