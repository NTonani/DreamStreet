import java.util.Observable;
import java.util.Observer;

/**
 * 
 */

/**
 * @author chris
 *
 */
public abstract class ALevel extends Observable implements I_Levels,
	I_Enemies {

	private BadGuyFactory _badgroupone;
	private BadGuyFactory _badgrouptwo;
	private BadGuyFactory _badgroupthree;
	private BattleArena _battleArena;
	private java.util.List<BadGuyFactory> _badGuysOnLevel;
	private GoodGuyFactory _goodGuys;
	private String _levelName;
	/**
	 * 
	 * @param levelName
	 * @param goodGuys
	 */
	public ALevel(String levelName, GoodGuyFactory goodGuys)
	{
		_levelName = levelName;
		_goodGuys = goodGuys;
		_badGuysOnLevel = new java.util.ArrayList<BadGuyFactory>();
		_badgroupone = new BadGuyFactory(this);
		_badgrouptwo = new BadGuyFactory(this);
		_badgroupthree = new BadGuyFactory(this);
		for(AGoodGuy gg : goodGuys.get_goodGuys())
		{
			accept(gg);
			gg.set_level(this);
		}
		play_level(goodGuys);
	}
	/*
	 * (non-Javadoc)
	 * @see I_Enemies#addEnemies(BadGuyFactory, int, int)
	 */
	@Override
	public void addEnemies(BadGuyFactory badGuys, int originX, int originY) {
		// adds mobs at specific points on the level
		_badGuysOnLevel.add(badGuys);
		for(ABadGuy bg : badGuys.get_badGuys())
		{
			addObserver((Observer) bg);
			bg.set_locx(originX);
			bg.set_locy(originY);
		}
	}
	/*
	 * (non-Javadoc)
	 * @see I_Levels#accept(AGoodGuy)
	 */
	@Override
	public void accept(AGoodGuy goodGuy)
	{
		System.out.println(goodGuy.get_name() + " has entered " + 
			get_levelName() + " at location (0, 0)\n");
	}
	/**
	 * 
	 * @return
	 */
	public GoodGuyFactory get_goodGuys() {
		return _goodGuys;
	}
	/**
	 * 
	 * @param _goodGuys
	 */
	public void set_goodGuys(GoodGuyFactory _goodGuys) {
		this._goodGuys = _goodGuys;
	}
	/**
	 * 
	 * @return
	 */
	public BadGuyFactory get_badgroupone() {
		return _badgroupone;
	}
	/**
	 * 
	 * @param _badgroupone
	 */
	public void set_badgroupone(BadGuyFactory _badgroupone) {
		this._badgroupone = _badgroupone;
	}
	/**
	 * 
	 * @return
	 */
	public BadGuyFactory get_badgrouptwo() {
		return _badgrouptwo;
	}
	/**
	 * 
	 * @param _badgrouptwo
	 */
	public void set_badgrouptwo(BadGuyFactory _badgrouptwo) {
		this._badgrouptwo = _badgrouptwo;
	}
	/**
	 * 
	 * @return
	 */
	public BadGuyFactory get_badgroupthree() {
		return _badgroupthree;
	}
	/**
	 * 
	 * @param _badgroupthree
	 */
	public void set_badgroupthree(BadGuyFactory _badgroupthree) {
		this._badgroupthree = _badgroupthree;
	}
	/**
	 * 
	 * @return
	 */
	public java.util.List<BadGuyFactory> get_badGuysOnLevel() {
		return _badGuysOnLevel;
	}
	/**
	 * 
	 * @param _badGuysOnLevel
	 */
	public void set_badGuysOnLevel(java.util.List<BadGuyFactory> _badGuysOnLevel) {
		this._badGuysOnLevel = _badGuysOnLevel;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Levels#move(GoodGuyFactory, int, int)
	 */
	@Override
	public void move(GoodGuyFactory goodGuys, int dirx, int diry)
	{
		//notifies Observers local to level of GoodGuy presence,
		//if GoodGuy comes to BadGuy location new BattleArena made
		goodGuys.set_grouplocx(goodGuys.get_grouplocx() + dirx);
		goodGuys.set_grouplocy(goodGuys.get_grouplocy() + diry);
		for(BadGuyFactory badGuys : get_badGuysOnLevel())
		{
				if(goodGuys.get_grouplocx() == badGuys.get_grouplocx() 
						&& goodGuys.get_grouplocy() == badGuys.get_grouplocy())
				{
					for(ABadGuy abg : badGuys.get_badGuys())
					{
						abg.update();
					}
					set_battleArena(new BattleArena(goodGuys, badGuys));
					get_battleArena().fight();
				}
					
			
		}
		
	}
	/**
	 * 
	 * @return
	 */
	public BattleArena get_battleArena() {
		return _battleArena;
	}
	/**
	 * 
	 * @param _battleArena
	 */
	public void set_battleArena(BattleArena _battleArena) {
		this._battleArena = _battleArena;
	}
	/*
	 * (non-Javadoc)
	 * @see I_Levels#play_level(GoodGuyFactory)
	 */
	@Override
	public void play_level(GoodGuyFactory goodGuys) {
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
	/*
	 * (non-Javadoc)
	 * @see I_Levels#treasureDrop(AHeavyWarrior)
	 */
	@Override
	public void treasureDrop(AHeavyWarrior hWarrior) {
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_Levels#treasureDrop(AShadowWarrior)
	 */
	@Override
	public void treasureDrop(AShadowWarrior sWarrior) {
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_Levels#treasureDrop(AMage)
	 */
	@Override
	public void treasureDrop(AMage mage) {
		
	}
	/*
	 * (non-Javadoc)
	 * @see I_Levels#treasureDrop(AWizard)
	 */
	@Override
	public void treasureDrop(AWizard wizard) {
		
	}
	/**
	 * 
	 * @return
	 */
	public String get_levelName() {
		return _levelName;
	}
	/**
	 * 
	 * @param _levelName
	 */
	public void set_levelName(String _levelName) {
		this._levelName = _levelName;
	}
}
