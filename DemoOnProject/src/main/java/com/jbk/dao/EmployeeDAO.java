package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;

@Repository
public class EmployeeDAO implements EmployeeDaoInterface {

	@Autowired
	SessionFactory sessionFactory;

	public String AddCountry(Country c) {

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		int i = (int) session.save(c);
		transaction.commit();

		if (i > 0) {
			return "country" + c.getCid() + "AddedSuccessfully";
		} else {
			return "Somthing went wrong!!!";

		}

	}

	public List<Country> GetAllCountry() {
		Session session = sessionFactory.openSession();
		List<Country> list = session.createCriteria(Country.class).list();
		return list;
	}

	public String UpdateCountry(Country c) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(c);
		transaction.commit();
		return "Country " + c.getCid() + " Updated Successfully";
	}

	public String DeleteCountry(String cname) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Country.class);
		criteria.add(Restrictions.eq("cname", cname));
		Country country = (Country) criteria.uniqueResult();
		session.delete(country);
		transaction.commit();
		return "The country deleted successfully....";
	}

	public Country GetPerticularCountry(Integer cid) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Country.class);
		criteria.add(Restrictions.eq("cid", cid));
		Country c = (Country) criteria.uniqueResult();
		return c;

	}

	public String AddEmployee(Employee e) {
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(e);
		transaction.commit();
		return "Employee Added Successfully...";

	}

	public List<Employee> getAllEmployee() {
		Session session = sessionFactory.openSession();
		List<Employee> list = session.createCriteria(Employee.class).list();
		return list;
	}

	public String updateEmployee(Employee e) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(e);
		transaction.commit();
		return "Updated Succussesfully....";
	}

	public String deleteEmployee(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria ctr = session.createCriteria(Employee.class);// fetch the entity class
		ctr.add(Restrictions.eq("id", id));//check object is available or not
		Employee e = (Employee) ctr.uniqueResult();//get that objet
		session.delete(e);
		transaction.commit();
		return "Employee delected Successfully...";
	}

	public Employee getPerticularEMP(Integer id) {
		Session session = sessionFactory.openSession();
		Criteria ctr = session.createCriteria(Employee.class);
		ctr.add(Restrictions.eq("id", id));
		Employee e = (Employee) ctr.uniqueResult();
		return e;
	}

}
