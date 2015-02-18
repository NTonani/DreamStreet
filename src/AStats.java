
/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class AStats implements I_Upgrade{

	/*
	 * (non-Javadoc)
	 * @see I_Upgrade#upgradeArmor(AGoodGuy, AArmor)
	 */
	@Override
	public void upgradeArmor(AGoodGuy goodGuy, AArmor armor) {
		goodGuy.set_armor(armor);
		if(armor.is_boolSpellProtection())
		{
			switch(armor.get_spellProtection())
			{
				case "Fire":
					goodGuy.get_defenseStats().set_fireprot(armor.get_bonusRating());
				case "Ice":
					goodGuy.get_defenseStats().set_iceprot(armor.get_bonusRating());
			}
		}
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_Upgrade#upgradeStats(AGoodGuy, AUpgrade)
	 */
	@Override
	public void upgradeStats(AGoodGuy goodGuy, AUpgrade upgrade) {
		// TODO Auto-generated method stub
		/*switch(upgrade.get_type())
		{
			case "fireprot":
				goodGuy.set_fireprot(goodGuy.get_fireprot() + upgrade.get_bonus());
				break;
			case "firedmg":
				set_firedmg(get_firedmg() + upgrade.get_bonus());
				break;
			case "iceprot":
				set_iceprot(get_iceprot() + upgrade.get_bonus());
				break;
			case "icedmg":
				set_icedmg(get_icedmg() + upgrade.get_bonus());
				break;
			case "strength":
				set_attackRating(get_attackRating() + upgrade.get_bonus());
				break;
			case "speed":
				set_attackSpeed(get_attackSpeed() + upgrade.get_bonus());
				break;
			case "magic":
				set_magicRating(get_magicRating() + upgrade.get_bonus());
				break;
			case "health":
				set_health(get_health() + upgrade.get_bonus());
				break;			
		}*/
	}
	/*
	 * (non-Javadoc)
	 * @see I_Upgrade#upgradeWeapon(AGoodGuy, AWeapon)
	 */
	@Override
	public void upgradeWeapon(AGoodGuy goodGuy, AWeapon weapon) {
		goodGuy.set_weapon(weapon);
		if(weapon.is_boolSpellDamage())
		{
			switch(weapon.get_spellDamage())
			{
				case "Fire":
					goodGuy.get_magicStats().set_firedmg(weapon.get_itembonus());
				case "Ice":
					goodGuy.get_magicStats().set_icedmg(weapon.get_itembonus());
			}
		}
	}	
	
}
