package Concrete;

import Abstract.CustomerCheckService;
import Main.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) {
		 
		return true;
		 
	}
}
