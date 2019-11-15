package app;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Classs;
import domain.FeMaleStudent;
import domain.Goods;
import domain.MaleStudent;
import domain.OrderDetail;
import domain.Orders;
import domain.Student;
import domain.Students;
public class Testno {

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
				//1List<Map> list = sqlSession.selectList("findStudentByStuName","马云");
				
				
				/*5student.setStuName("马云");
				student.setStuPassword("123456");
				Student student4=sqlSession.selectOne("selectOne",student);
				System.out.println(student4.getStuName()+" "+student4.getStuNo());*/
				
				//3List<Student> list = sqlSession.selectList("findStudentByStudentinfo",student);
				//2List<Map> list = sqlSession.selectList("findStudentByStuNameAndPassword",student);
				//输出查询结果
				/*2for(Map map : list){

					System.out.println(map);
				}*/
				/*3for(Student student2 : list){
					System.out.println(student2.getStuName());//只返回学生姓名
				}*/
				
				/*4List<Student> list =sqlSession.selectList("findStudentByStuName", "马云");
				for(Student student4 : list){
					System.out.println(student4);
				}
				sqlSession.commit();*/
				/*//插入
				student.setStuNo("003");
				student.setStuName("李四");
				student.setStuPassword("111111");
				sqlSession.insert("insertStudent",student);
				
				
				//修改密码
				student.setStuName("李四");
				student.setStuPassword("222222");
				sqlSession.insert("updatePassword",student);
				
				//修改用户名
				student.setStuNo("003");
				student.setStuName("李斯");
				sqlSession.update("updateStudentName",student);
				
				
				//删除用户
				student.setStuName("李斯");
				sqlSession.delete("deleteStudent",student);
				sqlSession.commit();*/
				/*多对一List<Student> list=sqlSession.selectList("findAllStudent");
				for(Student student4:list){
					System.out.println(student4.getStuName()+":"+student4.getClasssNo().getClasssName());
				}*/
				/*5一对多List<Classs> list=sqlSession.selectList("findClasssStudent");
				for(Classs classs:list){
					List<Student> students=classs.getStudent();
					for(Student student4:students){
						System.out.println(classs.getClasssName()+"包含"+student4.getStuName());
					}
				}*/
				/*List<Student> list=sqlSession.selectList("findAllStudent");
				for(Student student2:list){
					if(MaleStudent.class.isInstance(student2)){//A.class.isInstance(a)判断a对象是不是A的实体类
						MaleStudent maleStudent=(MaleStudent)student2;
						System.out.println(student2.getStuName()+":"+maleStudent.getGender());
					}else{
						FeMaleStudent feMaleStudent=(FeMaleStudent)student2;
						System.out.println(student2.getStuName()+":"+feMaleStudent.getGender());
					}
				}*/
				
				/*订单查询List<Orders> list=sqlSession.selectList("selectOrders");
				for(Orders orders:list){
					System.out.println("订单"+orders.getId()+orders.getOrdertime()+" "+orders.getCustomer().getName()+" "+orders.getEmployee().getName()+"包含:");
					List<OrderDetail> orderDetails=orders.getOrderdetails();
					for(OrderDetail orderDetail:orderDetails){
						System.out.print("订单详情:"+orderDetail.getAmount()+"(件)"+orderDetail.getSum()+"(元)");
						List<Goods> goodsList=orderDetail.getGoods();
						for(Goods goods:goodsList){
							System.out.println(goods.getName()+" "+goods.getPrice()+"元");
						}
					}
				}*/
				/*Student student4=new Student();//调用数据类
				student4.setStuName("马云");
				Student student2=new Student();//调用数据类
				student2.setStuName("马化腾");
				ArrayList<Student> list=new ArrayList<Student>();
				list.add(student4);
				list.add(student2);
				List<Student> list1=sqlSession.selectList("findName",list);
				for(Student i:list1){
					System.out.println(i.getStuName()+" 在"+i.getClasssNo().getClasssName()+" "+" 班级编号为"+i.getClasssNo().getClasssNo());
				}*/
				ApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");
				Students students=(Students)act.getBean("students");
				ArrayList<Student> list=students.getStudents();
				//调用mapper中方法
				List<Student> list1=sqlSession.selectList("findName",list);
				for(Student i:list1){
					System.out.println(i.getStuName()+" 在"+i.getClasssNo().getClasssName()+" "+" 班级编号为"+i.getClasssNo().getClasssNo());
				}
				System.out.println("你好，测试");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				sqlSession.rollback();//回滚
			}
			
		
	}

}
