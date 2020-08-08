package net.fastnet.dbfastnet.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.fastnet.dbfastnet.entities.Reclamo;

public interface ReclamoRepo extends CrudRepository <Reclamo, String>{

	List<Reclamo> findByCanalReq(String CanalReq); 

}
