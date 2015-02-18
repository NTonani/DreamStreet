/**
 * 
 */

/**
 * @author chris
 *
 */
public class PlayTheGame {

	private ALevel _l1;
	private ALevel _l2;
	private ALevel _l3;
	private ALevel _l4;
	private ALevel _l5;
	private ALevel _B1;
	private ALevel _B2;
	private ALevel _B3;
	private static GoodGuyFactory _newGroup;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayTheGame game = null;
		
		try
		{
			
			game = new PlayTheGame(new GoodGuyFactory());
			game.start();
			
		}
		catch(Exception e)
		{
			System.out.println("Broken");
		}
		
	}

	private void start() {
		// Prints Game Logo, and Directions;
		_l1 = new LevelOne(_newGroup);
		_l2 = new LevelTwo(_newGroup);
		_B1 = new BossLevelOne(_newGroup);
		_l3 = new LevelThree(_newGroup);
		_l4 = new LevelFour(_newGroup);
		_B2 = new BossLevelTwo(_newGroup);
		_l5 = new LevelFive(_newGroup);
		_B3 = new BossLevelThree(_newGroup);
	}

	public PlayTheGame(GoodGuyFactory goodGuys)
	{
		_newGroup = goodGuys;
	}

	public ALevel get_l1() {  return _l1;  }
	public void set_l1(ALevel _l1) {  this._l1 = _l1;  }
	public ALevel get_l2() {  return _l2;  }
	public void set_l2(ALevel _l2) {  this._l2 = _l2;  }
	public ALevel get_l3() {  return _l3;  }
	public void set_l3(ALevel _l3) {  this._l3 = _l3;  }
	public ALevel get_l4() {  return _l4;  }
	public void set_l4(ALevel _l4) {  this._l4 = _l4;  }
	public ALevel get_l5() {  return _l5;  }
	public void set_l5(ALevel _l5) {  this._l5 = _l5;  }
	public ALevel get_B1() {  return _B1;  }
	public void set_B1(ALevel _B1) {  this._B1 = _B1;  }
	public ALevel get_B2() {  return _B2;  }
	public void set_B2(ALevel _B2) {  this._B2 = _B2;  }
	public ALevel get_B3() {  return _B3;  }
	public void set_B3(ALevel _B3) {  this._B3 = _B3;  }
}
