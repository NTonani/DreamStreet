
/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class AFighter extends AGoodGuy implements I_HeavyEquip,
		I_Smash {

	private double _smashChance;
	private String _smash;
	private int _smashDmg;

	/*
	 * (non-Javadoc)
	 * @see I_Smash#smash(AGameCharacter)
	 */
	@Override
	public void smash(AGameCharacter character) {
		// 10 dmg to enemy +3 to enemy attack speed

	}

	/* (non-Javadoc)
	 * @see I_HeavyEquip#addHarmor(AHeavyArmor)
	 */
	@Override
	public void addHarmor(AHeavyArmor heavyArmor) {
		get_defenseStats().upgradeArmor(this, heavyArmor);
	}
	/* (non-Javadoc)
	 * @see I_HeavyEquip#addHweapon(AHeavyWeapon)
	 */
	@Override
	public void addHweapon(AHeavyWeapon heavyWeapon) {
		get_attackStats().upgradeWeapon(this, heavyWeapon);
	}
	/**
	 * 
	 * @return
	 */
	public double get_smashChance() {
		return _smashChance;
	}
	/**
	 * 
	 * @param _smashChance
	 */
	public void set_smashChance(double _smashChance) {
		this._smashChance = _smashChance;
	}
	/**
	 * 
	 * @return
	 */
	public String get_smash() {
		return _smash;
	}
	/**
	 * 
	 * @param _smash
	 */
	public void set_smash(String _smash) {
		this._smash = _smash;
	}
	/**
	 * 
	 * @return
	 */
	public int get_smashDmg() {
		return _smashDmg;
	}
	/**
	 * 
	 * @param _smashDmg
	 */
	public void set_smashDmg(int _smashDmg) {
		this._smashDmg = _smashDmg;
	}

}
