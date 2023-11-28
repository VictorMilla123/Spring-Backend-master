package pe.com.ventas.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.ventas.Servicio.IClienteServicio;
import pe.com.ventas.modelo.Cliente;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class ClienteControlador {
	
	@Autowired
	private IClienteServicio clienteService;
	
	// Metodo para traer todos los clientes
	@GetMapping("/Clientes")
	public List<Cliente> getAllClientes() {
		return clienteService.getAllClientes();
	}

	//este metodo sirve para guardar el cliente
	@PostMapping("/Clientes")
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
  
	//este metodo sirve para buscar un cliente
	@GetMapping("/Clientes/{id}")
	public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable Long id){
			return clienteService.obtenerClientePorId(id);
	}
	
	//este metodo sirve para actualizar cliente
	@PutMapping("/Clientes/{id}")
	public ResponseEntity<Cliente> actualizarCliente(@PathVariable Long id,@RequestBody Cliente detallesEmpleado){
		return clienteService.actualizarCliente(id, detallesEmpleado);
    }
	
	//este metodo sirve para eliminar un cliente
	@DeleteMapping("/Clientes/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarCliente(@PathVariable Long id){
		return clienteService.eliminarCliente(id);
    }
	
}














