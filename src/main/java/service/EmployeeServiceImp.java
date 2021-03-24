package service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Employee;
import repositary.EmployeeeRepositary;
@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeeRepositary employeeeRepositary;
	
	@Override
	public List<Employee> getAllEmployeeS() {
		
		return employeeeRepositary.findAll();
	}

}
