
/**
 * 
 */

/**
 * @author Chris
 *
 */
public class WhiteWizard extends AWizard implements I_GroupHeal {
	
	private static final String _name = "Cumulus Grey";
	private static final double _healChance = .8;
	private boolean _canRevive;
	/**
	 *
	 */
	public WhiteWizard() {
		super(_healChance);
		set_charType("White");
		set_name(_name);
		get_attackStats().set_specialAttackDmg(15);//for group heal
	}
	/**
	 * 
	 * @param goodGuy
	 */
	public void revive(AGoodGuy goodGuy)
	{
		// revives dead member of group, with 50 HP
		if(!goodGuy.is_alive())
		{
			if(is_canRevive())
			{
				goodGuy.get_defenseStats().set_health(50);
			}
			else
			{
				System.out.println("Must wait until next battle to respawn revive ability.");
			}
		}
	}
	/*
	 * (non-Javadoc)
	 * @see I_GroupHeal#groupHeal(AGameCharacterFactory)
	 */
	@Override
	public void groupHeal(AGameCharacterFactory goodguys) {
		// +15 to all members of group
		
	}
	public boolean is_canRevive() {
		return _canRevive;
	}

	public void set_canRevive(boolean _canRevive) {
		this._canRevive = _canRevive;
	}
}
