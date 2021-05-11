package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Main.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService _customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){

        _customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer) throws Exception {
       if (_customerCheckService.CheckIfRealPerson(customer)){
           super.Save(customer);
       }
       else{
           System.out.println("Not a valid person");
       }

    }



}