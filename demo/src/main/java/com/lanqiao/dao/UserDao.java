package com.lanqiao.dao;

import java.util.List;

import com.lanqiao.model.User;

public interface UserDao {

    /**
     * ����id��ѯ�û���Ϣ
     *
     * @param id
     * @return
     */
    public User queryUserById(String id);

    /**
     * ��ѯ�����û���Ϣ
     *
     * @return
     */
    public List<User> queryUserAll();

    /**
     * �����û�
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * �����û���Ϣ
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * ����idɾ���û���Ϣ
     *
     * @param id
     */
    public void deleteUser(String id);
}
