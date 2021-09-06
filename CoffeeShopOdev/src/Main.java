import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbuckCustomerManager;
import Enitites.Customer;

public class Main {



	public static void main(String[] args) throws RemoteException {
		Customer customer1 = new Customer(1,"Muhammed Yusuf","Deniz",2006,"13910182780");
		BaseCustomerManager customerManager =new StarbuckCustomerManager(new MernisServiceAdapter());		
		customerManager.Save(customer1);
		
	}

}
