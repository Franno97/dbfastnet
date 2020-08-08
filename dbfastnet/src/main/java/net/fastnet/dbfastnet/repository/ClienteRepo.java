package net.fastnet.dbfastnet.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.fastnet.dbfastnet.entities.Cliente;

public interface ClienteRepo extends CrudRepository <Cliente, String>{

	List<Cliente> findByNombreCliente(String nombre); 
}
