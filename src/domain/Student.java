package domain;
/**
 * 学生信息保存类
 * @author thl
 *
 */
public class Student {
private String stuNo;//学号
private String stuName;//学生姓名
private String stuPassword;//学生密码
int classsNo;//部门id,多个用户对应一个部门
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getClasssNo() {
	return classsNo;
}
public void setClasssNo(int classsNo) {
	this.classsNo = classsNo;
}
public Student(String no,String stuPassword) {
	this.stuNo=no;
	this.stuPassword=stuPassword;
	// TODO Auto-generated constructor stub
}
public String getStuNo() {
	return stuNo;
}
public void setStuNo(String stuNo) {
	this.stuNo = stuNo;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getStuPassword() {
	return stuPassword;
}
public void setStuPassword(String stuPassword) {
	this.stuPassword = stuPassword;
}


}
