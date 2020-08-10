package net.fastnet.dbfastnet.interfaceService;

import java.util.List;
import java.util.Optional;

import net.fastnet.dbfastnet.entities.Customer;

public interface ICustomerService {
	public List<Customer>listar();
	public Optional<Customer>listarId(int id);
	public int save(Customer c);
	public void delete(int id);
}
