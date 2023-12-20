package com.gl.rest.PrajSampleRest.dao;

import java.util.List;

import com.gl.rest.PrajSampleRest.entity.Employee;



public interface EmployeeDao {
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
	public void updateEmployee(Employee employee);
}
