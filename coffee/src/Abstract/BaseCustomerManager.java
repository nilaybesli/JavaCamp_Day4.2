package Abstract;

import Main.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void Save(Customer customer) throws Exception {
		System.out.println("Veritabanưna kaydedildi : "+ customer.getFirstName());
		
	}
}
