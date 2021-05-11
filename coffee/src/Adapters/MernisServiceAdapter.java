package Adapters;

import Abstract.CustomerCheckService;
import Main.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
    
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase()
                ,customer.getDateOfBirth().getYear());
    }
}