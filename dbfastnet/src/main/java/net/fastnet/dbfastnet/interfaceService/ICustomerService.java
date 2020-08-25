package net.fastnet.dbfastnet.interfaceService;

import java.util.List;
import java.util.Optional;

import net.fastnet.dbfastnet.entities.Customer;

public interface ICustomerService {
	public List<Customer>list();
	public Optional<Customer>listId(String idcustomer);
	public int save(Customer c);
	public void delete(String idcustomer);
}
