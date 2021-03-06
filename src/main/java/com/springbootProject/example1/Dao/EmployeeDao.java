package com.springbootProject.example1.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootProject.example1.Model.Employee;
import com.springbootProject.example1.Repository.EmployeeRepository;

@Service
public class EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	
	/* search all employees*/
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	
	/*delete an employee*/
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
	


}


