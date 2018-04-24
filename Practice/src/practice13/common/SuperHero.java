package practice13.common;

public class SuperHero extends practice13.common.Character {

	public SuperHero() {
		super(25, 10, 7);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	practice13.common.Item equipment;


	public int attack() {
		return (this.getAttack() + equipment.getAditinalDamage());
	}

	public void setEquipment(practice13.common.Item equipment) {
		this.equipment = equipment;
	}

	public practice13.common.Item getEquipment() {
		return this.equipment;
	}

}
