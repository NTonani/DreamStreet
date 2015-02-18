
/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class ATreasureFactory extends AInventory implements I_TreasureFactory {

	
	private AArmor _armor;
	private AWeapon _weapon;
	private AUpgrade _upgrade;
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
	public AUpgrade get_upgrade() {
		return _upgrade;
	}
	/**
	 * 
	 * @param _upgrade
	 */
	public void set_upgrade(AUpgrade _upgrade) {
		this._upgrade = _upgrade;
	}
	
}
