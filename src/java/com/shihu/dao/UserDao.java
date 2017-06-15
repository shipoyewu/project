package com.shihu.dao;

import com.shihu.User;
import org.hibernate.HibernateException;

/**
 * Created by BenBen on 2017/6/13.
 */
public interface UserDao {
    public void save(Object user) throws HibernateException;
}
