package net.fastnet.dbfastnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.fastnet.dbfastnet.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {

}