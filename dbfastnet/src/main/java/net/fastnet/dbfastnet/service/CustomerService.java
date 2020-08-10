package net.fastnet.dbfastnet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fastnet.dbfastnet.entities.Customer;
import net.fastnet.dbfastnet.interfaceService.ICustomerService;
import net.fastnet.dbfastnet.interfaces.ICustomer;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	private ICustomer data;
	
	@Override
	public List<Customer> list() {
		return (List<Customer>)data.findAll();
	}

	@Override
	public Optional<Customer> listId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Customer c) {
		int res=0;
		Customer customer=data.save(c);
		if(!customer.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
