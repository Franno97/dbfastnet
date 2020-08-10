package net.fastnet.dbfastnet.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.fastnet.dbfastnet.entities.Breakdown;

@Repository
public interface IBreakdown extends CrudRepository<Breakdown, Integer>{

}