/**
 * 
 */

/**
 * @author chris
 *
 */
public class HeavyPlateArmor extends AHeavyArmor {

	/**
	 * 
	 */
	public HeavyPlateArmor() {
		set_name("Heavy Plate Armor");
		set_spellProtection("None");
		set_armorRating(7);
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
	public HeavyPlateArmor(String name, String condition, String spellProtection, int armorRating,
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
