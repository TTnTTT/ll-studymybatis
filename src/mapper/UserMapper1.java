package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import domain.Student;

public interface UserMapper1 {
	@Insert("insert into student(stuNo,stuName,stuPassword) values(#{stuNo},#{stuName},#{stuPassword})")//注解写SQL语句
	void insertStudent(Student student);//方法声明，xml的ID对应方法名
	
	@Update("UPDATE student set stuName='${stuName}' where stuNo='${stuNo}'")
	void updateStudentName(Student student);//修改学生姓名
	
	@Select("select * from student where stuName=#{xx}")
	Student findStudentByStuName(String xx);//通过学生 姓名找到学生
	
	@Select("select * from student where stuName=#{stuName} and stuPassword=#{stuPassword}")
	Student selectOne(Student student);//查找唯一一条记录
	
}
