
/**
 * 
 */

/**
 * @author chris
 *
 */
public class BossThree extends ABoss implements I_TwoHand, I_FinalBoss {

	private ALightWeapon _secondHand;
	/**
	 * 
	 */
	public BossThree() {
		set_name("The Final Countdown");
		set_charType("Boss");
		set_attackStats(new AttackStats(10, 2, 35));
		set_defenseStats(new DefenseStats(100, 9, 4, 4));
		set_magicStats(new MagicStats(10, 3, 3));
		set_rateStats(new RateStats(.8, .7, .7));
		set_attack("Murder Ball");
		set_bossSpecial("Mad Max");
		set_finalBossSpecial("Death Plunge");
		set_finalBossSpecialDmg(50);
		set_weapon(new ShortSword());//enchanted
		addSecondWeapon(new BowieKnife());//enchanted
		set_armor(new HeavyPlateArmor());//enchanted
		set_bossUpgrade(new Shield());//enchanted
	}

	/*
	 * (non-Javadoc)
	 * @see I_TwoHand#addSecondWeapon(ALightWeapon)
	 */
	@Override
	public void addSecondWeapon(ALightWeapon secondWeapon) {
		this._secondHand = secondWeapon;
	}
	
	public ALightWeapon get_secondHand() {
		return _secondHand;
	}
	
	/*
	 * (non-Javadoc)
	 * @see I_FinalBoss#finalBossSpecialAttack(GoodGuyFactory)
	 */
	@Override
	public void finalBossSpecialAttack(GoodGuyFactory goodGuys) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_FinalBoss#finalBossSpecialAttack_desc()
	 */
	@Override
	public String finalBossSpecialAttack_desc() {
		// TODO Auto-generated method stub
		return null;
	}

}
