package question1.service;

import question1.model.Customer;

public class CustomerService {
	public boolean checkEligibility(Customer cus) {
		boolean result=false;
		int custAge=cus.getAge();
		if(custAge>18)
		{
			result=true;
			
		}
		return result;
	}

}
