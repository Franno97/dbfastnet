package net.fastnet.dbfastnet.interfaceService;
import java.util.List;
import java.util.Optional;

import net.fastnet.dbfastnet.entities.Breakdown;

public interface IBreakdownService {
	public List<Breakdown>list();
	public Optional<Breakdown>listId(String idbreakdown);
	public int save(Breakdown c);
	public void delete(String idbreakdown);
}