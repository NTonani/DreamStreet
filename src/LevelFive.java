/**
 * 
 */

/**
 * @author chris
 *
 */
public class LevelFive extends ALevel {

	/**
	 * @param goodGuys
	 */
	public LevelFive(GoodGuyFactory goodGuys)
	{
		super("Level Five", goodGuys);
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
		return this.get_levelName();
	}

}
