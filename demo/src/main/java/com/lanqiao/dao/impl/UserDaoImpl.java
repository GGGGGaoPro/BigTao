package com.lanqiao.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.lanqiao.dao.UserDao;
import com.lanqiao.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao{
	public SqlSession sqlSession;
	
	public UserDaoImpl(SqlSession sqlSession) {
	        this.sqlSession = sqlSession;
	        }
	
	
	@Override
	public User queryUserById(String id) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectOne("UserDao.queryUserById", id);
	}

	@Override
	public List<User> queryUserAll() {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList("UserDao.queryUserAll");
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		this.sqlSession.insert("UserDao.insertUser",user);
	}


	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.sqlSession.update("UserDao.updateUser",user);
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		this.sqlSession.delete("UserDao.deleteUser",id);
	}
	
}