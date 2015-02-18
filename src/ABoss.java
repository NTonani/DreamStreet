import java.util.Random;

/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class ABoss extends ABadGuy implements I_Smash, I_GroupHeal, I_Cast{

	private String _bossSpecial;
	private String _finalBossSpecial;
	private int _finalBossSpecialDmg;
	private AUpgrade _bossUpgrade;
	/**
	 * 
	 */
	public void random_drop()
	{
		Random r = new Random();
		
		int random = r.nextInt(0)+3;
		
		switch(random)
		{
		case 1:
			dropUpgrade();
		case 2:
			dropArmor();
		case 3:
			dropWeapon();
		}

	}
	/*
	 * (non-Javadoc)
	 * @see I_GroupHeal#groupHeal(AGameCharacterFactory)
	 */
	@Override
	public void groupHeal(AGameCharacterFactory bossgroup) {
		// +15 health to boss group
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_Smash#smash(AGameCharacter)
	 */
	@Override
	public void smash(AGameCharacter character) {
		// +20 dmg		
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
	public String get_bossSpecial() {
		return _bossSpecial;
	}
	/**
	 * 
	 * @param _bossSpecial
	 */
	public void set_bossSpecial(String _bossSpecial) {
		this._bossSpecial = _bossSpecial;
	}
	/**
	 * 
	 * @return
	 */
	public String get_finalBossSpecial() {
		return _finalBossSpecial;
	}
	/**
	 * 
	 * @param _finalBossSpecial
	 */
	public void set_finalBossSpecial(String _finalBossSpecial) {
		this._finalBossSpecial = _finalBossSpecial;
	}
	/**
	 * 
	 * @return
	 */
	public int get_finalBossSpecialDmg() {
		return _finalBossSpecialDmg;
	}
	/**
	 * 
	 * @param _finalBossSpecialDmg
	 */
	public void set_finalBossSpecialDmg(int _finalBossSpecialDmg) {
		this._finalBossSpecialDmg = _finalBossSpecialDmg;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Drop#dropWeapon()
	 */
	@Override
	public AWeapon dropWeapon() {
		return get_weapon();
	}
	/*
	 * (non-Javadoc)
	 * @see I_Drop#dropArmor()
	 */
	@Override
	public AArmor dropArmor() {
		return get_armor();
	}
	/*
	 * (non-Javadoc)
	 * @see I_Drop#dropUpgrade()
	 */
	@Override
	public AUpgrade dropUpgrade() {
		return get_bossUpgrade();
	}
	/**
	 * 
	 * @return
	 */
	public AUpgrade get_bossUpgrade() {
		return _bossUpgrade;
	}
	/**
	 * 
	 * @param _bossUpgrade
	 */
	public void set_bossUpgrade(AUpgrade _bossUpgrade) {
		this._bossUpgrade = _bossUpgrade;
	}
}
