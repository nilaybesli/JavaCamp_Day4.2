package Main;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer=new Customer();

        customer.firstName="Nilay";
        customer.lastName="Beþli";
        customer.dateOfBirth= LocalDate.of(2001,3,19); 
        customer.id=1 ;
        customer.nationalityId="12398";

        baseCustomerManager.Save(customer);
    }
}