package pe.com.ventas.Servicio;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import pe.com.ventas.modelo.Cliente;

public interface IProductoServicio  {

	List<Cliente> getAllClientes();
	
	Cliente saveCliente(Cliente cliente);
	
	ResponseEntity<Cliente> obtenerClientePorId(Long id);
	
	ResponseEntity<Cliente> actualizarCliente(Long id, Cliente cliente);
	
	ResponseEntity<Map<String,Boolean>> eliminarCliente(Long id);
	
}
