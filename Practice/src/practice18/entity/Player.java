package practice18.entity;

import java.util.ArrayList;

public class Player {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	private String position;
	private String name;
	private String country;
	private String team;

	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosition() {
		return position;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return country;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeam() {
		return team;
	}



	public String toString() {
		ArrayList<String> infoList = new ArrayList<String>();
		infoList.add(getPosition());
		infoList.add(getName());
		infoList.add(getCountry());
		infoList.add(getTeam());

		String info = String.join(",", infoList);

		return info;

	}



}
