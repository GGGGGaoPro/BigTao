package com.lanqiao.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {
   public static void main(String[] args) throws Exception {
   
      String resource = "mybatis-config.xml";
    
      InputStream inputStream = Resources.getResourceAsStream(resource);
    
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
     
      SqlSession sqlSession = sqlSessionFactory.openSession();
      try {

         User user = sqlSession.selectOne("MyMapper.GetId", 1);
         System.out.println(user);
         
         List<User> list=sqlSession.selectList("MyMapper.GetAll");
         for(User u:list) {
        	 System.out.println(u);
         }
      } finally {
         sqlSession.close();
      }
   }
}