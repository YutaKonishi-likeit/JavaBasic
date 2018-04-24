package practice14.common;

public class DBCourse implements Course {

	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		return PREFIX + "DB基礎";
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String[] unit = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return unit;
	}

}
