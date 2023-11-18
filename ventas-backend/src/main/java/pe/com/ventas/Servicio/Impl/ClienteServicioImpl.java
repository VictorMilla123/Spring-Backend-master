package pe.com.ventas.Servicio.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import pe.com.ventas.Servicio.IClienteServicio;
import pe.com.ventas.excepciones.ResourceNotFoundException;
import pe.com.ventas.modelo.Cliente;
import pe.com.ventas.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements IClienteServicio {

    
    @Autowired
    private ClienteRepositorio clienteRepository;


    
    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
    
    @Override
    public ResponseEntity<Cliente> obtenerClientePorId(Long id) {
		Cliente cliente = clienteRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("No existe el cliente con el ID : " + id));
		return ResponseEntity.ok(cliente);
    }
    
    @Override
    public ResponseEntity<Cliente> actualizarCliente(Long id, Cliente detalleCliente) {
			Cliente cliente = clienteRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("No existe el cliente con el ID : " + id));
			
			cliente.setNombre(detalleCliente.getNombre());
			cliente.setApellido(detalleCliente.getApellido());
			cliente.setDireccion(detalleCliente.getDireccion());
			cliente.setFecha_nacimiento(detalleCliente.getFecha_nacimiento());
			cliente.setTelefono(detalleCliente.getTelefono());
			cliente.setEmail(detalleCliente.getEmail());
			
			Cliente clienteActualizado = clienteRepository.save(cliente);
			return ResponseEntity.ok(clienteActualizado);
    }
    
    @Override
    public ResponseEntity<Map<String, Boolean>> eliminarCliente(Long id) {
		Cliente cliente = clienteRepository.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No existe el cliente con el ID : " + id));
		
		clienteRepository.delete(cliente);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);

    }
    
}
