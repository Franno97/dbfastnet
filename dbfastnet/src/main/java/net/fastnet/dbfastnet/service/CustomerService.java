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
	public List<Customer> listar() {
		return (List<Customer>)data.findAll();
	}

	@Override
	public Optional<Customer> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
