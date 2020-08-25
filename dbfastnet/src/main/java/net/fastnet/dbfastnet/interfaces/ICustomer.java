package net.fastnet.dbfastnet.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.fastnet.dbfastnet.entities.Customer;

@Repository
public interface ICustomer extends CrudRepository<Customer, String>{

}
