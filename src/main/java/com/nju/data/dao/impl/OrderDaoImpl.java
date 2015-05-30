package com.nju.data.dao.impl;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.nju.data.dao.OrderDao;
import com.nju.data.dataobject.OrderDO;
import com.nju.data.dataobject.UserDO;
 
public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {

	protected static Logger log = LoggerFactory.getLogger(OrderDao.class);
	
	@Override
	public void save(OrderDO order) {
		log.debug("saving Order instance");
		try {
			getHibernateTemplate().save(order);
			log.debug("save successful");
 		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	
	public void find() {
		String sql = "from OrderDO";
		Session se = this.currentSession();
	
		Query q = se.createQuery(sql);
		List<UserDO> result = q.list();
		System.out.println(result.get(0));

	}
	
	@SuppressWarnings("unchecked")
	public OrderDO findOrderById(int orderId) {				
		String sql = "from OrderDO where order_id = '"+orderId+"'";
		Session se = this.currentSession();	
		Query q = se.createQuery(sql);
		List<OrderDO> result = q.list();
		System.out.println(result.get(0));
		return result.size()==0?null:result.get(0);
	}
	

}