package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Enitites.Customer;

public 	  class StarbuckCustomerManager extends BaseCustomerManager implements ICustomerCheckService{

	ICustomerCheckService _customerCheckService;
	
	public StarbuckCustomerManager(ICustomerCheckService customerCheckService)
	{
		 _customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws RemoteException {

		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid Person.");
		}
		
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
