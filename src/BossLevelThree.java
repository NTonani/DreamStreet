/**
 * 
 */

/**
 * @author chris
 *
 */
public class BossLevelThree extends ALevel {

	private BadGuyFactory _theFinalCountdown = new BadGuyFactory(this);
	/**
	 * 
	 * @param goodGuys
	 */
	public BossLevelThree(GoodGuyFactory goodGuys)
	{
		super("The ThunderDome", goodGuys);
		_theFinalCountdown.get_boss(3);
		_theFinalCountdown.addGroupTwo();
		_theFinalCountdown.set_bossGroup(true);
		get_badgroupone().addGroupOne();
		addEnemies(get_badgroupone(), 5, 0);
		get_badgrouptwo().addGroupThree();
		addEnemies(get_badgrouptwo(), 25, 20);
		get_badgroupthree().addGroupFour();
		addEnemies(get_badgroupthree(), 15, 25);
		addEnemies(_theFinalCountdown, 30, 40);
	}

	/* (non-Javadoc)
	 * @see I_LevelDescription#levelDescription()
	 */
	@Override
	public String levelDescription() {
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see ALevel#play_level(GoodGuyFactory)
	 */
	@Override
	public void play_level(GoodGuyFactory goodGuys) {
		// boss override version
		// group can move x and y the amount of their combined attack speed
		// must wait num moves to attack, i.e combined attack speed 10, x = 3 y = 4
		// group waits seven seconds to move again, has to clear entire level of mobs to
		// advance, treasure for each group member at end of level based on chartype
		// if move to enemy location, group must wait enemy group combined attack speed,
		// less combined move, i.e combined move = 7 enemy attack speed = 10, must wait 3 seconds,
		// pseudo enemy ambush, each enemy with attack speed <= numMoves - combinedEnemyAttackSpeed
		//  can attack random member of group, then turn based until goodguys or badguys win
		for(AGoodGuy gg : goodGuys.get_goodGuys())
		{
			System.out.println(gg.get_name() + " has conquered " + get_levelName() + "\n");
		}
	}
}
