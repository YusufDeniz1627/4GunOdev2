package Abstract;

import java.rmi.RemoteException;

import Enitites.Customer;

public interface ICustomerService {
	public void Save(Customer customer) throws RemoteException;
}
