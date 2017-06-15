package com.shihu.daoimp;

import com.shihu.User;
import com.shihu.dao.UserDao;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by BenBen on 2017/6/13.
 */
public class UserDaoImp extends HibernateDaoSupport implements UserDao {


    public void save(Object obj) throws HibernateException {
        System.out.println("saveingg +++++++++++++++++");
        getHibernateTemplate().save(obj);
    }
}
