/**
 * 
 */

/**
 * @author Chris
 *
 */
public class BadGuyFactory extends AGameCharacterFactory {


	private java.util.List<ABadGuy> _badGuys;
	private boolean _bossGroup;
	/**
	 * 
	 */
	public BadGuyFactory(ALevel level) {
		_badGuys = new java.util.ArrayList<ABadGuy>();
		set_level(level);
	}

	public void addGroupOne()
	{
		addBadGuy(new Ghost());
		addBadGuy(new Skeleton());
		addBadGuy(new Brigand());
	}
	public void addGroupTwo()
	{
		addBadGuy(new Brigand());
		addBadGuy(new Skeleton());
		addBadGuy(new Brute());
	}
	public void addGroupThree()
	{
		addBadGuy(new Ghost());
		addBadGuy(new Ghost());
		addBadGuy(new Ghost());
	}
	public void addGroupFour()
	{
		addBadGuy(new Skeleton());
		addBadGuy(new Skeleton());
		addBadGuy(new Skeleton());
	}
	public void addGroupFive()
	{
		addBadGuy(new Brute());
		addBadGuy(new Brute());
		addBadGuy(new Brute());
	}
	public void addGroupSix()
	{
		addBadGuy(new Brigand());
		addBadGuy(new Brigand());
		addBadGuy(new Brigand());
	}

	public void get_boss(int level)
	{
		switch(level)
		{
		case 1:
			this.addBadGuy(new BossOne());
		case 2:
			this.addBadGuy(new BossTwo());
		case 3:
			this.addBadGuy(new BossThree());
		}
	}
	
	public java.util.List<ABadGuy> get_badGuys() {
		return _badGuys;
	}
	
	public void report_badGuys()
	{
		StringBuilder sb = new StringBuilder();
		for(ABadGuy bg : get_badGuys())
		{
			sb.append(bg.get_name());
			sb.append(" (");
			sb.append(bg.get_charType());
			sb.append(") is on ");
			sb.append( bg.get_level().get_levelName());
			sb.append(" at loc(");
			sb.append(bg.get_locx());
			sb.append(",");
			sb.append(bg.get_locy());
			sb.append(")\n");
			System.out.println(sb.toString());
		}
	}
	
	public void addBadGuy(ABadGuy badGuy)
	{
		get_badGuys().add(badGuy);
	}

	public boolean is_bossGroup() {
		return _bossGroup;
	}

	public void set_bossGroup(boolean _bossGroup) {
		this._bossGroup = _bossGroup;
	}
}
