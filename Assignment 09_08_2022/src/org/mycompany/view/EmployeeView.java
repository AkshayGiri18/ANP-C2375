package org.mycompany.view;
import org.mycompany.service.EmployeeService;
import org.mycompany.model.Employee;



public class EmployeeView {
	public static void main(String[] args) {
	Employee Employee1 = new Employee(1,'s',2000);
	EmployeeService EmployeeSer1 = new EmployeeService();
	System.out.println("Employee Old Salary :" + Employee1.getEmployeeSalary());
	Employee UpdatedSalary =EmployeeSer1.calculateSalaryIncrement(Employee1);
	System.out.println("EmployeeId : " + UpdatedSalary.getEmployeeId());
	System.out.println("Employee Initial : " + UpdatedSalary.getEmployeeInitial());
	System.out.println("Employee Updated Salary : "+UpdatedSalary.getEmployeeSalary());
	
	
		
	}

}
