package net.fastnet.dbfastnet.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.fastnet.dbfastnet.entities.Claim;

@Repository
public interface IClaim extends CrudRepository<Claim, Integer>{

}