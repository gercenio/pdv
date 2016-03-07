package com.gaxsoftware.pdv.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gaxsoftware.pdv.model.Softwarehouse;
import com.gaxsoftware.pdv.model.User;
import com.gaxsoftware.pdv.util.HibernateUtil;

public class SoftwarehouseDao {
	
	public void addSoftware(Softwarehouse softwarehouse) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(softwarehouse);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
	
	public void deleteSoftwarehouse(int softwarehouseid) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Softwarehouse soft = (Softwarehouse) session.load(Softwarehouse.class, new Integer(softwarehouseid));
            session.delete(soft);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

}
