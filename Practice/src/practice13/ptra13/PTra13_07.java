/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;


public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero superHero = new SuperHero();
		superHero.setName("勇者（装備あり）");

		Slime slime = new Slime();
		slime.setName("スライム");


		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item item = new Item(null, 0);
		item.setName("こんぼう");
		item.setAditinalDamage(4);


		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		superHero.setEquipment(item);


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		String winner;
		String loser;

		while(true) {
			boolean heroAttack = slime.damage(superHero.attack());

			if (heroAttack) {
				winner = superHero.getName();
				loser = slime.getName();
				break;
			}

			boolean slimeAttack = superHero.damage(slime.attack());

			if (slimeAttack) {
				winner = slime.getName();
				loser = superHero.getName();
				break;
			}
		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		System.out.println(winner + "は" + loser + "との戦闘に勝利した");

	}
}
