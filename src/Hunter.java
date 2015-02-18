/**
 * 
 */

/**
 * @author Chris
 *
 */
public class Hunter extends AShadowWarrior {

	/**
	 * 
	 */
	public Hunter() {
		set_charType("Hunter");
		set_name("Chief Compton");
		set_weapon(new LongBow());
		addSecondWeapon(new HuntingKnife());
	}

	/* (non-Javadoc)
	 * @see I_Vanish#vanish()
	 */
	@Override
	public void vanish() {
		//the hunter puts on his ghilly suit
	}

}
