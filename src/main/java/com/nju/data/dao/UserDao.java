package com.nju.data.dao;

import com.nju.data.dataobject.UserDO;

/**
 * �����û������ݿ���ýӿ�
 * @author Wangy
 *
 */
public interface UserDao {

	public UserDO getUserByUsernameAndPassword(String username, String password);
}
