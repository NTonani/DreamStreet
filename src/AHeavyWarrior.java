
/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class AHeavyWarrior extends AFighter implements I_Charge, I_Shield {

	private double _chargeChance;
	private AUpgrade _shield;
	private String _charge;
	private int _chargeDmg;
	/**
	 * 
	 * @param chargeChance
	 */
	public AHeavyWarrior(double chargeChance) {
		set_attackStats(new AttackStats(6, 2, 0));
		set_defenseStats(new DefenseStats(60, 7, 0, 0));
		set_magicStats(new MagicStats(3, 0, 0));
		set_rateStats(new RateStats(.6, .5, .5));
		set_armor(new HeavyPlateArmor());
		set_inventory(new Inventory());
		addShield(new Shield());
		set_chargeDmg(10);
		set_charge(get_name() + "charged");
		set_smashDmg(5);
		set_smash(get_name() + "smashed");
		_chargeChance = chargeChance;
	}

	/**
	 * 
	 * @return
	 */
	public double get_chargeChance() {
		return _chargeChance;
	}
	/**
	 * 
	 * @param _chargeChance
	 */
	public void set_chargeChance(double _chargeChance) {
		this._chargeChance = _chargeChance;
	}		
	/*
	 * (non-Javadoc)
	 * @see AFighter#addShield(AUpgrade)
	 */
	@Override
	public void addShield(AUpgrade shield) {
		this._shield = shield;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Charge#charge(AGameCharacterFactory)
	 */
	@Override
	public void charge(AGameCharacterFactory characters) {
		// +10 dmg to all enemies
		
	}
	/**
	 * 
	 * @return
	 */
	public AUpgrade get_shield() {
		return _shield;
	}
	/**
	 * 
	 * @return
	 */
	public String get_charge() {
		return _charge;
	}
	/**
	 * 
	 * @param _charge
	 */
	public void set_charge(String _charge) {
		this._charge = _charge;
	}
	/**
	 * 
	 * @return
	 */
	public int get_chargeDmg() {
		return _chargeDmg;
	}
	/**
	 * 
	 * @param _chargeDmg
	 */
	public void set_chargeDmg(int _chargeDmg) {
		this._chargeDmg = _chargeDmg;
	}

}
