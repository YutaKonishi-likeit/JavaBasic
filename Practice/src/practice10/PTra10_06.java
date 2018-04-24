package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		// ★ Car型の変数carを宣言し、Carクラスのインスタンスを代入してください
		Car[] cars = new Car[3];

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();



		// ★ 変数carに格納されているインスタンスのserialNoフィールドに、10000を代入してください
		cars[i].serialNo = 10000;

		// ★ 変数carに格納されているインスタンスのcolorフィールドに、"Red"を代入してください
		cars[i].color = "Red";

		// ★ 変数carに格納されているインスタンスのgasolineフィールドに、50を代入してください
		cars[i].gasoline = 50;

		// 目的地までの距離
		final int distance = 300;

		/*
		 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
		 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
		 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
		 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
		 */



		int[][] sumNP = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};

		while (true) {

			sumNP[i][2] = cars[i].run();

			if (sumNP[i][2] == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			} else {
				sumNP[i][0] += sumNP[i][2];
				sumNP[i][1]++;
				if (sumNP[i][0] >= distance) {
					System.out.println("目的地にまで" + sumNP[i][1] + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
					break;

				}
			}
		}
		}

	}
}
