package net.fastnet.dbfastnet.interfaceService;

import java.util.List;
import java.util.Optional;

import net.fastnet.dbfastnet.entities.Claim;

public interface IClaimService {
	public List<Claim>list();
	public Optional<Claim>listId(int id);
	public int save(Claim c);
	public void delete(int id);
}
