
/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class AShadowWarrior extends AFighter implements I_Vanish, I_TwoHand {

	private ALightWeapon _secondHand;
	
	/**
	 * 
	 */
	public AShadowWarrior() {
		set_attackStats(new AttackStats(6, 2, 0));
		set_defenseStats(new DefenseStats(60, 5, 0, 0));
		set_magicStats(new MagicStats(3, 0, 0));
		set_rateStats(new RateStats(.6, .4, .7));
		set_armor(new LightPlateArmor());
		set_inventory(new Inventory());
	}
	/*
	 * (non-Javadoc)
	 * @see I_TwoHand#get_secondHand()
	 */
	@Override
	public ALightWeapon get_secondHand()
	{
		return _secondHand;
	}
	/*
	 * (non-Javadoc)
	 * @see I_TwoHand#addSecondWeapon(ALightWeapon)
	 */
	@Override
	public void addSecondWeapon(ALightWeapon secondWeapon) {
		// TODO Auto-generated method stub
		
	}

}
