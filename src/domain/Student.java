package domain;
/**
 * 学生信息保存类
 * @author thl
 *
 */
public class Student {
private String no;//学号
private String name;//学生姓名

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String no) {
	this.no=no;
	// TODO Auto-generated constructor stub
}
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
