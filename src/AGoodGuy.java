
/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class AGoodGuy extends AGameCharacter implements
I_Visitor, I_PickupUpgrade {

	private boolean _is_alive;
	private boolean _can_beattacked;
	private ALevel _level;
	private Inventory _inventory;	
	/**
	 * 
	 */
	public AGoodGuy() {
		_is_alive = true;
		_can_beattacked = true;
	}

	/* (non-Javadoc)
	 * @see I_Visitor#visit(ALevel)
	 */
	@Override
	public void visit(ALevel level) {
		// send each goodguy to this level
		set_level(level);
		level.accept(this);
	}

	/* (non-Javadoc)
	 * @see I_PickupUpgrade#addUpgrade(AUpgrade)
	 */
	@Override
	public void addUpgrade(AItem upgrade) {
		get_inventory().add(upgrade);
	}
	/* (non-Javadoc)
	 * @see I_PickupUpgrade#pickup_item()
	 */
	@Override
	public boolean pickup_item() {
		// prompt on if user wants item
		return false;
	}
	/*
	 * (non-Javadoc)
	 * @see AGameCharacter#get_char_desc()
	 */
	@Override
	public String get_char_desc() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Name: " + get_name());
		sb.append("CharType: " + get_charType());
		
		return super.toString() + get_inventory().printInventory();
	}
	/**
	 * 
	 * @return
	 */
	public Inventory get_inventory() {
		return _inventory;
	}
	/**
	 * 
	 * @param _inventory
	 */
	public void set_inventory(Inventory _inventory) {
		this._inventory = _inventory;
	}
	/**
	 * 
	 * @return
	 */
	public boolean is_alive() {
		return _is_alive;
	}
	/**
	 * 
	 * @param _is_alive
	 */
	public void set_is_alive(boolean _is_alive) {
		this._is_alive = _is_alive;
	}
	/**
	 * 
	 * @param level
	 */
	public void set_level(ALevel level) {
		this._level = level;
	}
	/**
	 * 
	 * @return
	 */
	public ALevel get_level() {
		return _level;
	}
	/*
	 * (non-Javadoc)
	 * @see I_PickupUpgrade#pickup(AItem)
	 */
	@Override
	public void pickup(AItem toPickup) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 * @return
	 */
	public boolean is_can_beattacked() {
		return _can_beattacked;
	}
	/**
	 * 
	 * @param _can_beattacked
	 */
	public void set_can_beattacked(boolean _can_beattacked) {
		this._can_beattacked = _can_beattacked;
	}
}
