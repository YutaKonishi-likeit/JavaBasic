/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<Player> players = new ArrayList<Player>();




        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                array.add(line);
                String[] str = line.split(",",0);
                Player player = new Player();
                player.setPosition(str[0]);
                player.setName(str[1]);
                player.setCountry(str[2]);
                player.setTeam(str[3]);

                players.add(player);

            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

        ArrayList<Player> GK = new ArrayList<Player>();
        ArrayList<Player> DF = new ArrayList<Player>();
        ArrayList<Player> MF = new ArrayList<Player>();
        ArrayList<Player> FW = new ArrayList<Player>();

        ArrayList<Player> Team = new ArrayList<Player>();


        for (int i = 0; i < players.size(); i++) {
        	if (players.get(i).getPosition().contains("GK")) {
        		GK.add(players.get(i));
        	}
        	if (players.get(i).getPosition().contains("DF")) {
        		DF.add(players.get(i));
        	}
        	if (players.get(i).getPosition().contains("MF")) {
        		MF.add(players.get(i));
        	}
        	if (players.get(i).getPosition().contains("FW")) {
        		FW.add(players.get(i));
        	}
        }

        int gNum = new java.util.Random().nextInt(GK.size());
        Team.add(GK.get(gNum));

        for (int i = 0; i < 4; i++) {
        	int dNum = new java.util.Random().nextInt(DF.size());
        	Team.add(DF.get(dNum));
        	DF.remove(dNum);
        }

        for (int i = 0; i < 4; i++) {
        	int mNum = new java.util.Random().nextInt(MF.size());
        	Team.add(MF.get(mNum));
        	MF.remove(mNum);
        }

        for (int i = 0; i < 2; i++) {
        	int fNum = new java.util.Random().nextInt(FW.size());
        	Team.add(FW.get(fNum));
        	FW.remove(fNum);
        }




        for (Player player: Team) {
        	System.out.println(player.toString());

        }

	}
}
