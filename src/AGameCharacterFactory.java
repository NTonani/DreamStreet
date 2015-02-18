

public abstract class AGameCharacterFactory implements I_GameCharacterFactory {

		private ALevel _level;
		private String _groupType;
		private int _grouplocx;
		private int _grouplocy;
		/**
		 * 
		 * @return
		 */
		public ALevel get_level() {
			return _level;
		}
		/**
		 * 
		 * @param _level
		 */
		public void set_level(ALevel _level) {
			this._level = _level;
		}
		/**
		 * 
		 * @return
		 */
		public String get_groupType() {
			return _groupType;
		}
		/**
		 * 
		 * @param _groupType
		 */
		public void set_groupType(String _groupType) {
			this._groupType = _groupType;
		}
		/**
		 * 
		 * @return
		 */
		public int get_grouplocx() {
			return _grouplocx;
		}
		/**
		 * 
		 * @param _grouplocx
		 */
		public void set_grouplocx(int _grouplocx) {
			this._grouplocx = _grouplocx;
		}
		/**
		 * 
		 * @return
		 */
		public int get_grouplocy() {
			return _grouplocy;
		}
		/**
		 * 
		 * @param _grouplocy
		 */
		public void set_grouplocy(int _grouplocy) {
			this._grouplocy = _grouplocy;
		}

}
