/**
 * 
 */

/**
 * @author chris
 *
 */
public class LevelThree extends ALevel {

	/**
	 * 
	 * @param goodGuys
	 */
	public LevelThree(GoodGuyFactory goodGuys)
	{
		super("Level Three", goodGuys);
		get_badgroupone().addGroupTwo();
		addEnemies(get_badgroupone(), 20, 15);
		get_badgrouptwo().addGroupThree();
		addEnemies(get_badgrouptwo(), 5, 10);
		get_badgroupthree().addGroupFive();
		addEnemies(get_badgroupthree(), 0, 0);
	}

	/* (non-Javadoc)
	 * @see I_LevelDescription#levelDescription()
	 */
	@Override
	public String levelDescription() {
		return null;
	}

}
