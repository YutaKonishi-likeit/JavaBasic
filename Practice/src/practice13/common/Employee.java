package practice13.common;

public class Employee extends Person {
	String departmentNm;
	int departmentCnt;

	public void setdepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public String getdepartmentNm() {
		return departmentNm;
	}

	public void setdepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
	public int getdepartmentCnt() {
		return departmentCnt;
	}

}
