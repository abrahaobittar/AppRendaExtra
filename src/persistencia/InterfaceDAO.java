package persistencia;

import java.util.List;
import Modelo.Cliente;

public interface InterfaceDAO
{

	void save(Cliente cliente);
	void remove(Cliente cliente);
	List<Cliente> getAll();
	
}
