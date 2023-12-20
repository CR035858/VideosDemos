package com.gl.rest.PrajSampleRest.service;

import java.util.List;

import com.gl.rest.PrajSampleRest.entity.Employee;



public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int theId);
	public abstract void save(Employee theEmployee);
	public void deleteById(int theId);
	public void update(Employee employee);
	
}
