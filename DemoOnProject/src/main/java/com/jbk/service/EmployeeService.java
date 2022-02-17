package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.jbk.dao.EmployeeDAO;
import com.jbk.entity.Country;
import com.jbk.entity.Employee;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	EmployeeDAO dao;

	public String AddCountry(Country c) {

		String str = dao.AddCountry(c);
		return str;

	}
	
	public List<Country> GetAllCountry(){
		List<Country> list=dao.GetAllCountry();
		return list;
	}
	
	public String UpdateCountry(Country c) {
		String str=dao.UpdateCountry(c);
		return str;
	}
	 public String DeleteCountry(String cname) {
		 String str=dao.DeleteCountry(cname);
		 return str;
	 }
	 public Country GetPerticularCountry(Integer cid) {
		 Country c=dao.GetPerticularCountry(cid);
		 return c;
	 }
	 
	 public String AddEmployee(Employee e) {
		 String str=dao.AddEmployee(e);
		 return str;
	 }
       public List<Employee> getAllEmployee() {
    	   List<Employee> list=dao.getAllEmployee();
    	   return list;
    	   
       }
       public String updateEmployee(Employee e) {
    	   String str=dao.updateEmployee(e);
    	   return str;
       }
       public String deleteEmployee( Integer id) {
    	   String str=dao.deleteEmployee(id);
    	   return str;
       }
       public Employee getPerticularEMP( Integer id) {
    	   Employee e=dao.getPerticularEMP(id);
    	   return e;
       }
}
