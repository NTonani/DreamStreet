/**
 * 
 */

/**
 * @author chris
 *
 */
public class LevelFour extends ALevel {

	/**
	 * @param goodGuys
	 */
	public LevelFour(GoodGuyFactory goodGuys)
	{
		super("Level Four", goodGuys);
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
