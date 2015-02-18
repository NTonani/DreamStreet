/**
 * 
 */

/**
 * @author chris
 *
 */
public class LevelTwo extends ALevel {

	/**
	 * @param goodGuys
	 */
	public LevelTwo(GoodGuyFactory goodGuys)
	{
		super("Level Two", goodGuys);
		get_badgroupone().addGroupOne();
		addEnemies(get_badgroupone(), 10, 5);
		get_badgrouptwo().addGroupFour();
		addEnemies(get_badgrouptwo(), 5, 20);
		get_badgroupthree().addGroupFive();
		addEnemies(get_badgroupthree(), 20, 20);
	}

	/* (non-Javadoc)
	 * @see I_LevelDescription#levelDescription()
	 */
	@Override
	public String levelDescription() {
		return null;
	}

}
