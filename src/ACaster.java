
/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class ACaster extends AGoodGuy implements I_LightEquip, I_Cast {


	private double _spellChance;
	private String _spell;
	private String _heal;
	private int _spellDmg;
	private int _healPts;

	/* (non-Javadoc)
	 * @see I_LightEquip#addLarmor(ALightArmor)
	 */
	@Override
	public void addLarmor(ALightArmor lightArmor) {
		// changes armor for caster
		get_defenseStats().upgradeArmor(this, lightArmor);
	}

	/* (non-Javadoc)
	 * @see I_LightEquip#addScroll(ALightWeapon)
	 */
	@Override
	public void addScroll(AUpgrade scroll) {
		// adds scroll to caster
		get_magicStats().upgradeStats(this, scroll);
	}

	/* (non-Javadoc)
	 * @see I_LightEquip#addKnife(ALightWeapon)
	 */
	@Override
	public void addLweapon(ALightWeapon lightWeapon) {
		// changes weapon for caster
		get_attackStats().upgradeWeapon(this, lightWeapon);
	}
	/**
	 * 
	 * @return
	 */
	public double get_spellChance() {
		return _spellChance;
	}
	/**
	 * 
	 * @param _spellChance
	 */
	public void set_spellChance(double _spellChance) {
		this._spellChance = _spellChance;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Cast#spell(AGameCharacter)
	 */
	@Override
	public void spell(AGameCharacter character) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_Cast#heal()
	 */
	@Override
	public void heal() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 * @return
	 */
	public String get_spell() {
		return _spell;
	}
	/**
	 * 
	 * @param _spell
	 */
	public void set_spell(String _spell) {
		this._spell = _spell;
	}
	/**
	 * 
	 * @return
	 */
	public String get_heal() {
		return _heal;
	}
	/**
	 * 
	 * @param _heal
	 */
	public void set_heal(String _heal) {
		this._heal = _heal;
	}
	/**
	 * 
	 * @return
	 */
	public int get_spellDmg() {
		return _spellDmg;
	}
	/**
	 * 
	 * @param _spellDmg
	 */
	public void set_spellDmg(int _spellDmg) {
		this._spellDmg = _spellDmg;
	}
	/**
	 * 
	 * @return
	 */
	public int get_healPts() {
		return _healPts;
	}
	/**
	 * 
	 * @param _healPts
	 */
	public void set_healPts(int _healPts) {
		this._healPts = _healPts;
	}

}
