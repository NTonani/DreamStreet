

/**
 * 
 */

/**
 * @author chris
 *
 */
public interface I_Levels {//Visitor

	public void accept(AGoodGuy aGoodGuy);
	public String levelDescription();
	public void play_level(GoodGuyFactory goodGuys);
	public void move(GoodGuyFactory goodGuys, int dirx, int diry);
	public void treasureDrop(AHeavyWarrior hWarrior);
	public void treasureDrop(AShadowWarrior sWarrior);
	public void treasureDrop(AMage mage);
	public void treasureDrop(AWizard wizard);
}
