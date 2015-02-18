/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Paladin extends AHeavyWarrior {

	private static final double _chargeChance = .4;
	private boolean _canSmite;
	
	/*
	 * @param chargeChance
	 */
	public Paladin() {
		super(_chargeChance);
		set_charType("Paladin");
		set_name("Gedry Crusadi");
		set_weapon(new PikeStaff());
	}

	public void smite(GoodGuyFactory goodGuys, BadGuyFactory badGuys)
	{
		// takes 15 or health left from enemy group, returns it to paladin group
		int damage = 15;
		int health = 0;
		int zero = 0;
		if(is_canSmite())
		{
			set_canSmite(false); 
			for(ABadGuy bg : badGuys.get_badGuys())
			{
				DefenseStats dstats = bg.get_defenseStats();
				if(dstats.get_health() > damage)
				{
					dstats.set_health(dstats.get_health() - damage);
					health = damage;
				}
				else
				{
					System.out.println("Smite has killed " + bg.get_name());
					badGuys.get_badGuys().remove(bg);
					health = dstats.get_health();
					dstats.set_health(zero);
				}
			}
			for(AGoodGuy gg : goodGuys.get_goodGuys())
			{
				DefenseStats dstats_ = gg.get_defenseStats();
				dstats_.set_health(dstats_.get_health() + health);
			}
		}
		else
		{
			System.out.println("Must advance to next level to respawn smite ability.");
		}
	}

	public boolean is_canSmite() {
		return _canSmite;
	}

	public void set_canSmite(boolean _canSmite) {
		this._canSmite = _canSmite;
	}

}
