package net.fastnet.dbfastnet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fastnet.dbfastnet.entities.Claim;
import net.fastnet.dbfastnet.entities.Customer;
import net.fastnet.dbfastnet.interfaceService.IClaimService;
import net.fastnet.dbfastnet.interfaces.IClaim;

@Service
public class ClaimService implements IClaimService {
	
	@Autowired
	private IClaim data;
	
	@Override
	public List<Claim> list() {
		return (List<Claim>)data.findAll();
	}

	@Override
	public Optional<Claim> listId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Claim c) {
		int res=0;
		Claim claim=data.save(c);
		if(!claim.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
