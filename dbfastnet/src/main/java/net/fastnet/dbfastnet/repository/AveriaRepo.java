package net.fastnet.dbfastnet.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.fastnet.dbfastnet.entities.Averia;

public interface AveriaRepo extends CrudRepository <Averia, String>{

	List<Averia> findByIDaveria (String IDaveria); 
	
	List<Averia> findByDescripcion (String descripcion);
}
