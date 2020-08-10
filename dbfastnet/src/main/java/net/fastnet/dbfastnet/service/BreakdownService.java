package net.fastnet.dbfastnet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fastnet.dbfastnet.entities.Breakdown;
import net.fastnet.dbfastnet.interfaceService.IBreakdownService;
import net.fastnet.dbfastnet.interfaces.IBreakdown;

@Service
public class BreakdownService implements IBreakdownService{
	
	@Autowired
	private IBreakdown data;
	
	@Override
	public List<Breakdown> list() {
		return (List<Breakdown>)data.findAll();
	}

	@Override
	public Optional<Breakdown> listId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Breakdown c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}

}