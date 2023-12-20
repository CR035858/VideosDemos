package com.gl.rest.PrajSampleRest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.rest.PrajSampleRest.dao.EmployeeDao;
import com.gl.rest.PrajSampleRest.entity.Employee;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {             
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public Employee findById(int theId) {
		return employeeDao.findById(theId);
	}



	@Override
	public void deleteById(int theId) {
		employeeDao.deleteById(theId);
	}

	

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDao.save(theEmployee);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(employee);
	}

	
}
