/**
 * 
 */

/**
 * @author chris
 *
 */
public class ShadowWizard extends AWizard {

	private static final double _healChance = .3;
	private boolean _canDrain;
	/**
	 * 
	 */
	public ShadowWizard() {
		super(_healChance);
		set_charType("Shadow");
		set_name("Bocephus Jenkins");
	}

	public void drain(GoodGuyFactory goodGuys, BadGuyFactory badGuys)
	{
		// drains 10 life per enemy, returns to group
			int damage = 10;
			int health = 0;
			int zero = 0;
			if(is_canDrain())
			{
				set_canDrain(false); 
				for(ABadGuy bg : badGuys.get_badGuys())
				{
					DefenseStats dstats = bg.get_defenseStats();
					if(dstats.get_health() > damage)
					{
						dstats.set_health(dstats.get_health() - damage);
						health = damage;
					}
					else
					{
						System.out.println("Drain has killed " + bg.get_name());
						badGuys.get_badGuys().remove(bg);
						health = dstats.get_health();
						dstats.set_health(zero);
					}
				}
				for(AGoodGuy gg : goodGuys.get_goodGuys())
				{
					DefenseStats dstats_ = gg.get_defenseStats();
					dstats_.set_health(dstats_.get_health() + health);
				}
			}
			else
			{
				System.out.println("Must advance to next level to respawn Drain ability.");
			}
		}

		public boolean is_canDrain() {
			return _canDrain;
		}

		public void set_canDrain(boolean _canDrain) {
			this._canDrain = _canDrain;
		}
	}

