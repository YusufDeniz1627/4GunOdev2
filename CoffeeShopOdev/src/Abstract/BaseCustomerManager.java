package Abstract;

import java.rmi.RemoteException;

import Enitites.Customer;

public  class BaseCustomerManager implements ICustomerService {

	
	


	@Override
	public void Save(Customer customer) throws RemoteException {
		System.out.println("Saved To db :"+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
