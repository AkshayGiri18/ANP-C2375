package org.mycompany.service;
import org.mycompany.model.Employee;
public class EmployeeService {
	  public Employee calculateSalaryIncrement(Employee Obj1) {
		  int incrementedSal = Obj1.getEmployeeSalary()+(Obj1.getEmployeeSalary() * 25)/100;
		  Obj1.setEmployeeSalary(incrementedSal);
		  
				  
				
		  return Obj1;
	  
	  
	  
	  
	  
	  
	  
	  
		  
		  
		  
	 
		
		  
		  
		  
		  
		  
	  }

	
	}

  