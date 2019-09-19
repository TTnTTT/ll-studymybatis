package domain;//放数据封装类

import java.util.List;

public class Classs {
private String classsNo;
private String classsName;
List<Student> students;

public Classs() {
	
}
public Classs(String classsNo, String classsName) {
	super();
	this.classsNo = classsNo;
	this.classsName = classsName;
}

public String getClasssNo() {
	return classsNo;
}

public void setClassNo(String classsNo) {
	this.classsNo = classsNo;
}

public String getClasssName() {
	return classsName;
}

public void setClassName(String classsName) {
	this.classsName = classsName;
}


public List<Student> getStudent() {
	return students;
}
public void setStudent(List<Student> student) {
	this.students = student;
}




}
