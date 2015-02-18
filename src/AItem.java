/**
 * 
 */

/**
 * @author Chris
 *
 */
public abstract class AItem {
	
	
		private String _name;
		private String _desc;
		private int _bonus;
		private AInventory _item;
		private AItem next;
		private AItem prev;
		
		public AItem() {}
		public AItem(AInventory item, String name, String description, int bonus)
		{
			_item = item;
			_name = name;
			_desc = description;
			_bonus = bonus;
		}
		
		public AItem build_item(AInventory inventoryItem, String get_name,
				String get_description, int get_bonus) {
			// TODO Auto-generated method stub
			return null;
		}
		/**
		 * 
		 * @param name
		 */
		public void set_name(String name) {
			this._name = name;
		}
		public String get_itemname() {
			return _name;
		}
		/**
		 * 
		 * @param description
		 */
		public void set_description(String description) {
			this._desc = description;
		}
		public String get_itemdesc() {
			return _desc;
		}

		public int get_itembonus() {
			return _bonus;
		}

		public AItem getNext() {
			return next;
		}

		public void setNext(AItem next) {
			this.next = next;
		}
		public void set_bonus(int bonus) {
			this._bonus = bonus;
		}

		public AItem getPrev() {
			return prev;
		}

		public void setPrev(AItem prev) {
			this.prev = prev;
		}
		
		public String getInfo()
		{
			StringBuilder sb = new StringBuilder();
			
			sb.append("Item Name: ");
			sb.append(get_itemname() + "\n");
			sb.append("Item Desc: ");
			sb.append(get_itemdesc() + "\n");
			sb.append("Item Bonus: ");
			sb.append(get_itembonus() + "\n");
			
			return sb.toString();
		}

		public AInventory get_item() {
			return _item;
		}

	}

