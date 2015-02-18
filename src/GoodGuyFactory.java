import java.util.Scanner;


public class GoodGuyFactory extends AGameCharacterFactory {

	private java.util.List<AGoodGuy> _goodGuys;


	public GoodGuyFactory() {
		_goodGuys = new java.util.ArrayList<AGoodGuy>();
		select_group();
	}
	
	public void addGroupOne()
	{
		addGoodGuy(new Knight());
		addGoodGuy(new ShadowWizard());
		addGoodGuy(new Hunter());
		set_groupType("Default");
	}
	public void addGroupTwo()
	{
		addGoodGuy(new Paladin());
		addGoodGuy(new FireMage());
		addGoodGuy(new Rogue());
		set_groupType("Attack DPS");
	}
	public void addGroupThree()
	{
		addGoodGuy(new Hunter());
		addGoodGuy(new WhiteWizard());
		addGoodGuy(new IceMage());
		set_groupType("Defense DPS");
	}
	public void addGroupFour()
	{
		addGoodGuy(new Knight());
		addGoodGuy(new Paladin());
		addGoodGuy(new WhiteWizard());
		set_groupType("Defense");
	}
	public void addGroupFive()
	{
		addGoodGuy(new IceMage());
		addGoodGuy(new ShadowWizard());
		addGoodGuy(new FireMage());
		set_groupType("Magic DPS");
	}
	public void addGroupSix()
	{
		addGoodGuy(new Paladin());
		addGoodGuy(new WhiteWizard());
		addGoodGuy(new ShadowWizard());
		set_groupType("Magic Defense");
	}
	
	public void addGroupCustom(int type1, int type2, int type3)
	{
		addGoodGuy(select_goodguy(type1));
		addGoodGuy(select_goodguy(type2));
		addGoodGuy(select_goodguy(type3));
		set_groupType("Custom");
	}
	
	public AGoodGuy select_goodguy(int type)
	{
		switch(type)
		{
			case 1:
				return new FireMage();
			case 2:
				return new Hunter();
			case 3:
				return new IceMage();
			case 4:
				return new Knight();
			case 5:
				return new Paladin();
			case 6:
				return new Rogue();
			case 7:
				return new ShadowWizard();
			case 8:
				return new WhiteWizard();
		}
		return null;
	}
	
	public void select_group()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Group 1(Default): Hunter, Knight, Shadow Wizard\n");
		sb.append("Group 2(Attack DPS): Fire Mage, Paladin, Rogue\n");
		sb.append("Group 3(Defense DPS): Hunter, Ice Mage, White Wizard\n");
		sb.append("Group 4(Attack Defense): Knight, Paladin, White Wizard\n");
		sb.append("Group 5(Magic DPS): Fire Mage, Ice Mage, Shadow Wizard\n");
		sb.append("Group 6(Magic Defense): Paladin, White Wizard, Shadow Wizard\n");
		sb.append("Group Custom 7: \n");
		sb.append("Group Selection?--> ");
		
		System.out.print(sb.toString());
		
		Scanner c;
		
		try
		{
			c = new Scanner(System.in);
			int selection_one = c.nextInt();
			c.nextLine();
			if(selection_one == 7)
			{
				sb = new StringBuilder();
				sb.append("Use 1-8 to select from:\n");
				sb.append("1: Fire Mage\n");
				sb.append("2: Hunter\n");
				sb.append("3: Ice Mage\n");
				sb.append("4: Knight\n");
				sb.append("5: Paladin\n");
				sb.append("6: Rogue\n");
				sb.append("7: Shadow Wizard\n");
				sb.append("8: White Wizard\n");
				sb.append("in this sequence # # #: ");
				System.out.print(sb.toString());
				selection_one = c.nextInt();
				int selection_two = c.nextInt();
				int selection_three = c.nextInt();
				addGroupCustom(selection_one, selection_two, selection_three);
			}
			else
			{
				switch(selection_one)
				{
				case 1:
					addGroupOne();
					break;
				case 2:
					addGroupTwo();
					break;
				case 3:
					addGroupThree();
					break;
				case 4:
					addGroupFour();
					break;
				case 5:
					addGroupFive();
					break;
				case 6:
					addGroupSix();
					break;
				default:
					addGroupOne();
					break;
				}
			}	
			c.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public java.util.List<AGoodGuy> get_goodGuys() {
		return _goodGuys;
	}

	public void addGoodGuy(AGoodGuy goodGuy)
	{
		get_goodGuys().add(goodGuy);
	}

}
