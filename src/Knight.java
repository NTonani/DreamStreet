/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Knight extends AHeavyWarrior {
	
	private static final double _chargeChance = .6;
	private boolean _canFrenzy;
	/**
	 *
	 */
	public Knight() {
		super(_chargeChance);
		set_charType("Knight");
		set_name("Sir Cramalot");
		set_weapon(new BroadSword());
		set_canFrenzy(true);
		set_chargeDmg(10);
		set_charge(get_name() + "charges ");
	}
	/**
	 * 
	 * @param goodGuys
	 * @param badGuys
	 */
	public void frenzy(GoodGuyFactory goodGuys, BadGuyFactory badGuys)
	{
		// turns badguy into goodguy for 1 turn
		
		if(is_canFrenzy())
		{
			set_canFrenzy(false); 
			
		}
		else
		{
			System.out.println("Must advance to next level to respawn frenzy ability.");
		}
	}

	public boolean is_canFrenzy() {
		return _canFrenzy;
	}

	public void set_canFrenzy(boolean _canFrenzy) {
		this._canFrenzy = _canFrenzy;
	}

}
