/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class AInventory {
	
	private String _name;
	private String _description;
	/**
	 * 
	 * @return
	 */
	public String get_name() {
		return _name;
	}
	/**
	 * 
	 * @param name
	 */
	public void set_name(String name) {
		this._name = name;
	}
	/**
	 * 
	 * @return
	 */
	public String get_description() {
		return _description;
	}
	/**
	 * 
	 * @param description
	 */
	public void set_description(String description) {
		this._description = description;
	}

}
