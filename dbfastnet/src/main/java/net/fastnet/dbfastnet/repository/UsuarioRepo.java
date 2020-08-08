package net.fastnet.dbfastnet.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.fastnet.dbfastnet.entities.Usuario;

public interface UsuarioRepo extends CrudRepository <Usuario, String>{

	List<Usuario> findByNickname(String nickname); 
	
	List<Usuario> findByNombre(String nombre);
	
	List<Usuario> findByEmail(String email);
}
