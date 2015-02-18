/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Rogue extends AShadowWarrior {

	private boolean _canBackStab;
	/**
	 * 
	 */
	public Rogue() {
		set_charType("Rogue");
		set_name("Night Stalker");
		set_weapon(new ShortSword());
		get_attackStats().set_specialAttackDmg(45);
		addSecondWeapon(new BowieKnife());
		set_canBackStab(true);
	}

	public void backstab(ABadGuy badGuy)
	{
		int zero = 0;
		// does 45 dmg to one enemy after vanish
		if(is_canBackStab())
		{
			vanish();
			DefenseStats bgstats = badGuy.get_defenseStats();
			int health = bgstats.get_health();
			int specialDmg = get_attackStats().get_specialAttackDmg();
			if(health > specialDmg)
				bgstats.set_health(health - specialDmg);
			else
			{
				specialDmg = health;
				bgstats.set_health(zero);
			}
				
			
			System.out.println(get_name() + " has performed " + specialAttack_desc() + " on "
					+ badGuy.get_name() + " for: " + ((bgstats.get_health() == 0)? "their life" : specialDmg));
		}
		else
		{
			System.out.println("Must wait until next level for back stab ability to respawn.");
		}
	
		
	}

	public boolean is_canBackStab() {
		return _canBackStab;
	}

	public void set_canBackStab(boolean _canBackStab) {
		this._canBackStab = _canBackStab;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Vanish#vanish()
	 */
	@Override
	public void vanish() {
		// TODO Auto-generated method stub
		
	}
}
