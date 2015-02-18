
/**
 * 
 */

/**
 * @author Chris
 * slashie.net libjsci
 */
public abstract class AGameCharacter implements I_GameCharacter,
	I_StandardActions {

	private String _name;
	private String _charType;
	private DefenseStats _defenseStats;
	private AttackStats _attackStats;
	private MagicStats _magicStats;
	private RateStats _rateStats;	
	private String _attack;
	private String _specialAttack;
	private AWeapon _weapon;
	private AArmor _armor;
	private int _locx;
	private int _locy;
	
	/**
	 * 
	 */
	public AGameCharacter() {}
	/**
	 * 
	 * @param name
	 */
	public AGameCharacter(String name)
	{
		_name = name;
	}
	/* (non-Javadoc)
	 * @see I_GameCharacterFactory#get_name()
	 */
	@Override
	public String get_name() {
		return _name;
	}
	/*
	 * (non-Javadoc)
	 * @see I_StandardActions#attack(AGameCharacter)
	 */
	@Override
	public void attack(AGameCharacter character) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_StandardActions#block(AGameCharacter)
	 */
	@Override
	public void block(AGameCharacter character) {
		// random block opposing character attack
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_StandardActions#specialAttack(AGameCharacterFactory)
	 */
	@Override
	public void specialAttack(AGameCharacterFactory characters) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_StandardActions#set_specialAttack(java.lang.String)
	 */
	@Override
	public void set_specialAttack(String _specialAttack) {
		this._specialAttack = _specialAttack;
	}
	/*
	 * (non-Javadoc)
	 * @see I_StandardActions#specialAttack_desc()
	 */
	@Override
	public String specialAttack_desc() {
		// TODO Auto-generated method stub
		return _specialAttack;
	}
	/*
	 * (non-Javadoc)
	 * @see I_GameCharacter#get_char_desc()
	 */
	@Override
	public String get_char_desc() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Name: " + get_name());
		sb.append("CharType: " + get_charType());
		
		return sb.toString();
	}
	/**
	 * 
	 * @param _name
	 */
	public void set_name(String _name) {
		this._name = _name;
	}
	/**
	 * 
	 * @return
	 */
	public AWeapon get_weapon() {
		return _weapon;
	}
	/**
	 * 
	 * @param _weapon
	 */
	public void set_weapon(AWeapon _weapon) {
		this._weapon = _weapon;
	}
	/**
	 * 
	 * @return
	 */
	public AArmor get_armor() {
		return _armor;
	}
	/**
	 * 
	 * @param _armor
	 */
	public void set_armor(AArmor _armor) {
		this._armor = _armor;
	}
	/**
	 * 
	 * @return
	 */
	public String get_charType() {
		return _charType;
	}
	/**
	 * 
	 * @param charType
	 */
	public void set_charType(String charType)
	{
		this._charType = charType;
	}
	/**
	 * 
	 * @return
	 */
	public int get_locx() {
		return _locx;
	}
	/**
	 * 
	 * @param _locx
	 */
	public void set_locx(int _locx) {
		this._locx = _locx;
	}
	/**
	 * 
	 * @return
	 */
	public int get_locy() {
		return _locy;
	}
	/**
	 * 
	 * @param _locy
	 */
	public void set_locy(int _locy) {
		this._locy = _locy;
	}
	/**
	 * 
	 * @return
	 */
	public String get_attack() {
		return _attack;
	}
	/**
	 * 
	 * @param _attack
	 */
	public void set_attack(String _attack) {
		this._attack = _attack;
	}
	/**
	 * 
	 * @return
	 */
	public DefenseStats get_defenseStats() {
		return _defenseStats;
	}
	/**
	 * 
	 * @param _defenseStats
	 */
	public void set_defenseStats(DefenseStats _defenseStats) {
		this._defenseStats = _defenseStats;
	}
	/**
	 * 
	 * @return
	 */
	public AttackStats get_attackStats() {
		return _attackStats;
	}
	/**
	 * 
	 * @param _attackStats
	 */
	public void set_attackStats(AttackStats _attackStats) {
		this._attackStats = _attackStats;
	}
	/**
	 * 
	 * @return
	 */
	public MagicStats get_magicStats() {
		return _magicStats;
	}
	/**
	 * 
	 * @param _magicStats
	 */
	public void set_magicStats(MagicStats _magicStats) {
		this._magicStats = _magicStats;
	}
	/**
	 * 
	 * @return
	 */
	public RateStats get_rateStats() {
		return _rateStats;
	}
	/**
	 * 
	 * @param _rateStats
	 */
	public void set_rateStats(RateStats _rateStats) {
		this._rateStats = _rateStats;
	}

}
