package practice13.common;

public class SuperHero extends Hero {



	private Item equipment;


	public int attack() {
		return super.attack() + this.equipment.getAditinalDamage();
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	public Item getEquipment() {
		return equipment;
	}

}
