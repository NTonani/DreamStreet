import java.util.Observable;
import java.util.Random;

/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class ABadGuy extends AGameCharacter implements
	I_Drop, I_Observer, I_BadGuy {

	private ALevel _level;
	private String _specialAttack;
	private int _specialAttackDmg;
	private AWeapon _wtoDrop_one;
	private AWeapon _wtoDrop_two;
	private AWeapon _wtoDrop_three;
	private AArmor _atoDrop_one;
	private AArmor _atoDrop_two;
	private AArmor _atoDrop_three;
	private AUpgrade _utoDrop_one;
	private AUpgrade _utoDrop_two;
	private AUpgrade _utoDrop_three;
	
	/* (non-Javadoc)
	 * @see I_Observer#update()
	 */
	@Override
	public void update() {
		// checks if good guys moved into bad guy area
		update(this.get_level(), this.get_level().get_badGuysOnLevel());
	}
	/**
	 * 
	 * @param level
	 */
	public void set_level(ALevel level)
	{
		this._level = level;
	}
	/**
	 * 
	 * @return
	 */
	public ALevel get_level()
	{
		return this._level;
	}
	/*
	 * (non-Javadoc)
	 * @see AGameCharacter#attack(AGameCharacter)
	 */
	@Override
	public void attack(AGameCharacter character) {
		// std attack against one random character
		
	}
	/*
	 * (non-Javadoc)
	 * @see AGameCharacter#block(AGameCharacter)
	 */
	@Override
	public void block(AGameCharacter character) {
		// block attack randomly
		
	}
	/*
	 * (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// if good guys have moved to badguy location fight starts
		ALevel level = (ALevel)o;
		BadGuyFactory badGuys = (BadGuyFactory)arg;
		
		for(ABadGuy abg : badGuys.get_badGuys())
		{
			if(level.get_goodGuys().get_grouplocx() == abg.get_locx()
					&& level.get_goodGuys().get_grouplocy() == abg.get_locy())
			{
				level.set_battleArena(new BattleArena(level.get_goodGuys(), badGuys));
				
			}
		}
	}
	/**
	 * 
	 * @return
	 */
	public String get_specialAttack() {
		return _specialAttack;
	}
	/**
	 * 
	 * @param _specialAttack
	 */
	public void set_specialAttack(String _specialAttack) {
		this._specialAttack = _specialAttack;
	}
	/**
	 * 
	 * @return
	 */
	public int get_specialAttackDmg() {
		return _specialAttackDmg;
	}
	/**
	 * 
	 * @param _specialAttackDmg
	 */
	public void set_specialAttackDmg(int _specialAttackDmg) {
		this._specialAttackDmg = _specialAttackDmg;
	}
	/**
	 * 
	 * @return
	 */
	public AWeapon get_wtoDrop_one() {
		return _wtoDrop_one;
	}
	/**
	 * 
	 * @param _wtoDrop_one
	 */
	public void set_wtoDrop_one(AWeapon _wtoDrop_one) {
		this._wtoDrop_one = _wtoDrop_one;
	}
	/**
	 * 
	 * @return
	 */
	public AWeapon get_wtoDrop_two() {
		return _wtoDrop_two;
	}
	/**
	 * 
	 * @param _wtoDrop_two
	 */
	public void set_wtoDrop_two(AWeapon _wtoDrop_two) {
		this._wtoDrop_two = _wtoDrop_two;
	}
	/**
	 * 
	 * @return
	 */
	public AWeapon get_wtoDrop_three() {
		return _wtoDrop_three;
	}
	/**
	 * 
	 * @param _wtoDrop_three
	 */
	public void set_wtoDrop_three(AWeapon _wtoDrop_three) {
		this._wtoDrop_three = _wtoDrop_three;
	}
	/**
	 * 
	 * @return
	 */
	public AArmor get_atoDrop_one() {
		return _atoDrop_one;
	}
	/**
	 * 
	 * @param _atoDrop_one
	 */
	public void set_atoDrop_one(AArmor _atoDrop_one) {
		this._atoDrop_one = _atoDrop_one;
	}
	/**
	 * 
	 * @return
	 */
	public AArmor get_atoDrop_two() {
		return _atoDrop_two;
	}
	/**
	 * 
	 * @param _atoDrop_two
	 */
	public void set_atoDrop_two(AArmor _atoDrop_two) {
		this._atoDrop_two = _atoDrop_two;
	}
	/**
	 * 
	 * @return
	 */
	public AArmor get_atoDrop_three() {
		return _atoDrop_three;
	}
	/**
	 * 
	 * @param _atoDrop_three
	 */
	public void set_atoDrop_three(AArmor _atoDrop_three) {
		this._atoDrop_three = _atoDrop_three;
	}
	/**
	 * 
	 * @return
	 */
	public AUpgrade get_utoDrop_one() {
		return _utoDrop_one;
	}
	/**
	 * 
	 * @param _utoDrop_one
	 */
	public void set_utoDrop_one(AUpgrade _utoDrop_one) {
		this._utoDrop_one = _utoDrop_one;
	}	
	/**
	 * 
	 * @return
	 */
	public AUpgrade get_utoDrop_two() {
		return _utoDrop_two;
	}
	/**
	 * 
	 * @param _utoDrop_two
	 */
	public void set_utoDrop_two(AUpgrade _utoDrop_two) {
		this._utoDrop_two = _utoDrop_two;
	}
	/**
	 * 
	 * @return
	 */
	public AUpgrade get_utoDrop_three() {
		return _utoDrop_three;
	}
	/**
	 * 
	 * @param _utoDrop_three
	 */
	public void set_utoDrop_three(AUpgrade _utoDrop_three) {
		this._utoDrop_three = _utoDrop_three;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Drop#dropWeapon()
	 */
	@Override
	public AWeapon dropWeapon() {
		AWeapon toDrop = null;
		Random r = new Random();
		
		int random = r.nextInt(0)+25;
		
		if(random%2==0)
			toDrop = get_wtoDrop_one();
		else if(random%3==0)
			toDrop = get_wtoDrop_two();
		else if(random == 17)
			toDrop = get_wtoDrop_three();
		return toDrop;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Drop#dropArmor()
	 */
	@Override
	public AArmor dropArmor() {
		AArmor toDrop = null;
		Random r = new Random();
		
		int random = r.nextInt(0)+25;
		
		if(random%2==0)
			toDrop = get_atoDrop_one();
		else if(random%3==0)
			toDrop = get_atoDrop_two();
		else if(random == 17)
			toDrop = get_atoDrop_three();
		return toDrop;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Drop#dropUpgrade()
	 */
	@Override
	public AUpgrade dropUpgrade() {
		AUpgrade toDrop = null;
		Random r = new Random();
		
		int random = r.nextInt(0)+25;
		
		if(random%2==0)
			toDrop = get_utoDrop_one();
		else if(random%3==0)
			toDrop = get_utoDrop_two();
		else if(random == 17)
			toDrop = get_utoDrop_three();
		return toDrop;
	}

}
