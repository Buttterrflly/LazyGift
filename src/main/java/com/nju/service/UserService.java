package com.nju.service;

/**
 * ���ڴ����й��û����߼�����
 * @author Wangy
 *
 */
public interface UserService {

	
	/**
	 * �û���¼����
	 * @param username �û���
	 * @param password ����
	 * @return true:��¼�ɹ�,false:��¼ʧ��
	 */
	public boolean login(String username, String password);
	
}
