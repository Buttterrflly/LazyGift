package com.nju.service;

import java.util.List;

import com.nju.model.Order;

public interface OrderService {

	/**
	 * ���ݹ�����Աid�Ͷ���״̬������ڸ�Ա���ض�״̬�Ķ���
	 * @param staffId
	 * @param states
	 * @return
	 */
	public List<Order> getOrdersByStaffId(long staffId, String[] states);
}
