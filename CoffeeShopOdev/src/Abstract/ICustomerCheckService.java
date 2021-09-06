package Abstract;

import java.rmi.RemoteException;

import Enitites.Customer;

public interface ICustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
