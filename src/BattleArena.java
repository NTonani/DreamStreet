/**
 * 
 */

/**
 * @author chris
 *
 */
public class BattleArena {

	private GoodGuyFactory _goodGuys;
	private BadGuyFactory _badGuys;
	/**
	 * 
	 * @param goodGuys
	 * @param badGuys
	 */
	public BattleArena(GoodGuyFactory goodGuys, BadGuyFactory badGuys) {
		// TODO Auto-generated constructor stub
		_goodGuys = goodGuys;
		_badGuys = badGuys;
	}

	public void fight()
	{
		/**
		 * remaining moves from goodguys determine wait time for attack
		 * after the timer is up, each team gets 1 attack per character, until one side
		 * has been defeated. White Wizard can revive.
		 * 
		 * prompts the user to choose attack type per character, and which enemy to attack
		 */
	}
	
	public void boss_fight()
	{
		/**
		 * no matter the remaining moves from goodguys, boss attacks first, has backup mob,
		 * final boss has 2. 
		 */
	}

	public GoodGuyFactory get_goodGuys() {
		return _goodGuys;
	}

	public void set_goodGuys(GoodGuyFactory _goodGuys) {
		this._goodGuys = _goodGuys;
	}

	public BadGuyFactory get_badGuys() {
		return _badGuys;
	}

	public void set_badGuys(BadGuyFactory _badGuys) {
		this._badGuys = _badGuys;
	}

}
