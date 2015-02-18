/**
 * 
 */

/**
 * @author chris
 *
 */
public class LevelOne extends ALevel {
	
	/**
	 * 
	 * @param goodGuys
	 */
	public LevelOne(GoodGuyFactory goodGuys)
	{
		super("Level One", goodGuys);
		get_badgroupone().addGroupTwo();
		addEnemies(get_badgroupone(), 5, 10);
		get_badgrouptwo().addGroupThree();
		addEnemies(get_badgrouptwo(), 10, 20);
		get_badgroupthree().addGroupSix();
		addEnemies(get_badgroupthree(), 25, 15);
	}
	/* (non-Javadoc)
	 * @see I_LevelDescription#levelDescription()
	 */
	@Override
	public String levelDescription() {
		return null;
	}
	
}
