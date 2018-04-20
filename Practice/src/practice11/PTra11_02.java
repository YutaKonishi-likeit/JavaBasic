package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		int bookCount = FileReaderClass.readBookDataFile().length;
		String[] titleList = new String[bookCount];

		for (int i = 0; i < bookCount; i++) {
			titleList[i] = FileReaderClass.readBookDataFile()[i].title;
		}

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String line = scanner.nextLine();

		boolean flg = true;

		for (int i = 0; i < bookCount; i++) {

			if (titleList[i].contains(line)) {
				System.out.println(titleList[i]);
				flg = false;
			}
		}
		if (flg) {
			System.out.println("検索結果が見つかりません");
		}



	}
}
