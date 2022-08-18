package question1.view;
import question1.model.Customer;
import question1.service.CustomerService;

public class CustomerView {
	public static void main(String[] args) {
		Customer customer1=new Customer(1,'A',19);
		
		CustomerService custSer=new CustomerService();
		boolean value=custSer.checkEligibility(customer1);
		System.out.println(value);
		if(value=true)
		{
			System.out.println("you are eligible for voting");
		
		}
		else
		{
			System.out.println("you are not eligible for voting");
		}
		
	}
}