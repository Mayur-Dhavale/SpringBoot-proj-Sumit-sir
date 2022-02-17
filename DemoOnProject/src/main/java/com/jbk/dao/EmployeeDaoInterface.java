package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;

public interface EmployeeDaoInterface {
	public String AddCountry(Country c);
	public List<Country> GetAllCountry() ;
	public String UpdateCountry(Country c);
	public String DeleteCountry(String cname);
	public Country GetPerticularCountry(Integer cid);
	public String AddEmployee(Employee e);
	public List<Employee> getAllEmployee();
	public String updateEmployee(Employee e);
	public String deleteEmployee( Integer id);
	public Employee getPerticularEMP( Integer id);

}
