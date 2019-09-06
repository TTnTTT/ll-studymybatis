package app;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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
				sqlSession=sqlSessionFactory.openSession();
				//执行查询请求
				List<Map> list = sqlSession.selectList("findUserByStuName","马云");
				//输出查询结果
				for(Map map : list){

					System.out.println(map);
				}
				System.out.println("你好，测试");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
