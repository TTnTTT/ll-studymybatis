package app;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Student;
public class Test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//类路径下配置文件名称
			String resource="mybatis-config.xml";
			InputStream inputStream;
			SqlSession sqlSession = null;
			
			try {
				//配置文件加载
				inputStream=Resources.getResourceAsStream(resource);
				//根据配置文件生成SqlSessionFactory对象
				SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
				//sqlSession 获取
				//sqlSession=sqlSessionFactory.openSession(true);//加了一个true为自动提交到数据库，默认不提交
				sqlSession=sqlSessionFactory.openSession();//不加ture，进行事务管理
				//执行查询请求
				//1List<Map> list = sqlSession.selectList("findUserByStuName","马云");
				Student student=new Student();//调用数据类
				
				student.setStuName("马云");
				student.setStuPassword("123456");
				Student student1=sqlSession.selectOne("selectOne",student);
				System.out.println(student1.getStuName()+" "+student1.getStuNo());
				
				//3List<Student> list = sqlSession.selectList("findUserByStudentinfo",student);
				//2List<Map> list = sqlSession.selectList("findUserByStuNameAndPassword",student);
				//输出查询结果
				/*2for(Map map : list){

					System.out.println(map);
				}*/
				/*3for(Student student2 : list){
					System.out.println(student2.getStuName());//只返回学生姓名
				}*/
				//插入
				/*student.setStuName("马化腾");
				student.setStuPassword("111111");
				sqlSession.insert("insertStudent",student);*/
				//修改密码
				/*student.setStuName("马化腾");
				student.setStuPassword("222222");
				sqlSession.insert("updatePassword",student);*/
				//删除用户
				/*student.setStuName("雷军");
				sqlSession.delete("deleteStudent",student);*/
				
				System.out.println("你好，测试");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
