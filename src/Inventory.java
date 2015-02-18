/**
 * 
 */

/**
 * @author chris
 *
 */
public class Inventory extends AInventory {

	private AItem _head;
	private int _size;
	private int _attackBonus;
	private int _strengthBonus;
	private int _healthBonus;
	private int _protectionBonusFire;
	private int _protectionBonusIce;
	private int _damageBonusFire;
	private int _damageBonusIce;
	private int _attackSpeedBonus;
	
	
	
	public Inventory()
	{
		_head = null;
		_size = 0;
	}

	public AItem get_head() {
		return _head;
	}

	public void set_head(AItem _head) {
		this._head = _head;
	}

	public int get_size() {
		return _size;
	}

	public void set_size(int _size) {
		this._size = _size;
	}
	
	public void add(AItem toAdd)
	{
		AItem temp = null, nxt = null, prv = null;
		
		if(_head == null)
		{
			
			toAdd.setNext(_head);
			toAdd.setPrev(_head);
			_head = toAdd;
		}
		else
		{
			temp = get_head();
			nxt = temp.getNext();
			prv = temp.getPrev();
			
			while(nxt!=temp)
			{
				nxt = nxt.getNext();
				prv = prv.getNext();
			}
			if(nxt!=null)
			{
				prv.setNext(toAdd);
				nxt.setPrev(toAdd);
				toAdd.setPrev(prv);
				toAdd.setNext(nxt);
			}
			else
			{
				throw new RuntimeException("Null Pointer");
			}
		}
		set_stats(toAdd);
	}
	
	private void set_stats(AItem toAdd) {
		// TODO Auto-generated method stub
		switch(toAdd.get_itemdesc())
		{
			case "attack":
				set_attackBonus(toAdd.get_itembonus());
				break;
			case "attackSpeed":
				set_attackSpeedBonus(toAdd.get_itembonus());
				break;
			case "strength":
				set_strengthBonus(toAdd.get_itembonus());
				break;
			case "health":
				set_healthBonus(toAdd.get_itembonus());
				break;
			case "fireprot":
				set_protectionBonusFire(toAdd.get_itembonus());
				break;
			case "iceprot":
				set_protectionBonusIce(toAdd.get_itembonus());
				break;
			case "firedmg":
				set_damageBonusFire(toAdd.get_itembonus());
				break;
			case "icedmg":
				set_damageBonusIce(toAdd.get_itembonus());
				break;
		}
	}

	public void remove(AItem toRemove)
	{
		if(get_size() >= 1)
		{
			set_head(null);
			set_size(0);
		}
		else if(toRemove.equals(get_head()))
		{
			AItem temp = get_head().getPrev();
			get_head().getNext().setPrev(temp);
			temp.setNext(get_head().getNext());
			set_head(temp);
		}
		else
		{
			AItem temp = get_head();
			while(temp!=(toRemove))
			{
				temp = temp.getNext();
			}
			AItem nxt = temp.getNext();
			AItem prv = temp.getPrev();
			
			prv.setNext(nxt);
			nxt.setPrev(prv);
		}
	}
	
	private boolean has_item(String name)
	{
		AItem temp = get_head();
		
		while(temp.get_itemname().compareTo(name)!=0)
		{
			temp = temp.getNext();
		}
		if(temp.get_itemname().compareTo(name)==0)
			return true;
		else
			return false;
	}
	public AInventory findItem(String name)
	{
		AItem temp = get_head();
		
		if(has_item(name))
		{
			while(temp.get_itemname().compareTo(name)!=0)
			{
				temp = temp.getNext();
			}
		}
		else
		{
			System.out.println("Item does not exist");
			return null;
		}
		
		return temp.get_item();
	}


	public String printInventory()
	{
		AItem temp = get_head();
		StringBuilder sb = new StringBuilder();
		int i = 1;
		
		sb.append("Inventory: \n");
		while(temp.getNext() != get_head())
		{
			sb.append(i + ": " + temp.getInfo());
			i++;
			temp = temp.getNext();
		}
		
		return sb.toString();
	}
	public int get_attackBonus() {
		return _attackBonus;
	}

	public void set_attackBonus(int _attackBonus) {
			this._attackBonus = _attackBonus;
	}

	public int get_strengthBonus() {
		return _strengthBonus;
	}

	public void set_strengthBonus(int _strengthBonus) {
		this._strengthBonus = _strengthBonus;
	}

	public int get_healthBonus() {
		return _healthBonus;
	}

	public void set_healthBonus(int _healthBonus) {
		this._healthBonus = _healthBonus;
	}

	public int get_protectionBonusFire() {
		return _protectionBonusFire;
	}

	public void set_protectionBonusFire(int _protectionBonusFire) {
		this._protectionBonusFire = _protectionBonusFire;
	}

	public int get_protectionBonusIce() {
		return _protectionBonusIce;
	}

	public void set_protectionBonusIce(int _protectionBonusIce) {
		this._protectionBonusIce = _protectionBonusIce;
	}

	public int get_attackSpeedBonus() {
		return _attackSpeedBonus;
	}

	public void set_attackSpeedBonus(int _attackSpeedBonus) {
		this._attackSpeedBonus = _attackSpeedBonus;
	}

	public int get_damageBonusFire() {
		return _damageBonusFire;
	}

	public void set_damageBonusFire(int _damageBonusFire) {
		this._damageBonusFire = _damageBonusFire;
	}

	public int get_damageBonusIce() {
		return _damageBonusIce;
	}

	public void set_damageBonusIce(int _damageBonusIce) {
		this._damageBonusIce = _damageBonusIce;
	}
}
