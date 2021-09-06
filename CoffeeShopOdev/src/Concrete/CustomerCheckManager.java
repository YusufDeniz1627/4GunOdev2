package Concrete;

import Abstract.ICustomerCheckService;
import Enitites.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;

		
	}

}
