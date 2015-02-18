/**
 * 
 */

/**
 * @author chris
 *
 */
public class TreasureFactory extends ATreasureFactory {

	/**
	 * 
	 */
	public TreasureFactory() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see I_TreasureFactory#make_armor(java.lang.String)
	 */
	@Override
	public AArmor make_armor(String type) {
		AArmor armor = null;
		switch(type)
		{
			case "Knight":
				armor = new HeavyPlateArmor();//enchanted strength
			case "Paladin":
				armor = new HeavyPlateArmor();//enchanted health
			case "Fire":
				armor = new Leather_MailArmor();//enchanted fire
			case "Ice":
				armor = new Leather_MailArmor();//enchanted ice
			case "Hunter":
				armor = new LightPlateArmor();//enchanted
			case "Rogue":
				armor = new LightPlateArmor();//enchanted
			case "Shadow":
				armor = new ClothArmor();//enchanted shadow dmg
			case "White":
				armor = new ClothArmor();//enchanted healr + 5
		}
		return armor;
	}

	/* (non-Javadoc)
	 * @see I_TreasureFactory#make_weapon(java.lang.String)
	 */
	@Override
	public AWeapon make_weapon(String type) {
		AWeapon weapon = null;
		switch(type)
		{
			case "Knight":
				weapon = new BroadSword();//enchanted strength
			case "Paladin":
				weapon = new PikeStaff();//enchanted health
			case "Fire":
				weapon = new Dagger();//enchanted fire
			case "Ice":
				weapon = new Dagger();//enchanted ice
			case "Hunter":
				weapon = new LongBow();//enchanted
			case "Rogue":
				weapon = new BowieKnife();//enchanted
			case "Shadow":
				weapon = new GnarledStaff();//enchanted shadow dmg
			case "White":
				weapon = new GnarledStaff();//enchanted healr + 5
		}
		return weapon;
	}

	/* (non-Javadoc)
	 * @see I_TreasureFactory#make_upgrade(java.lang.String)
	 */
	@Override
	public AUpgrade make_upgrade(String type) {
		AUpgrade upgrade = null;
		switch(type)
		{
			case "Knight":
				upgrade = new Shield();//enchanted
			case "Paladin":
				upgrade = new Shield();//enchanted
			case "Fire":
				upgrade = new Scroll("Scroll Of Fire", "firedmg", 25);
			case "Ice":
				upgrade = new Scroll("Scroll Of Ice", "icedmg", 25);
			case "Hunter":
				upgrade = new ExplodingArrows();
			case "Rogue":
				upgrade = new ThrowingKnife();
			case "Shadow":
				upgrade = new Scroll("Scroll Of Demonic Rage", "shadowdmg", 25);
			case "White":
				upgrade = new Scroll("Scroll Of Healing", "health", 25);
		}
		return upgrade;
	}

}
