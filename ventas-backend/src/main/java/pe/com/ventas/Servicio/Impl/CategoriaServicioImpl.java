package pe.com.ventas.Servicio.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import pe.com.ventas.Servicio.ICategoriaServicio;
import pe.com.ventas.excepciones.ResourceNotFoundException;
import pe.com.ventas.modelo.Categoria;
import pe.com.ventas.repositorio.CategoriaRepositorio;

@Service
public class CategoriaServicioImpl implements ICategoriaServicio {

    
    @Autowired
    private CategoriaRepositorio categoriaRepository;


    
    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }
    
    @Override
    public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
    
    @Override
    public ResponseEntity<Categoria> obtenerCategoriaPorId(Long id) {
    	Categoria categoria = categoriaRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("No existe la categoria con el ID : " + id));
		return ResponseEntity.ok(categoria);
    }
    
    @Override
    public ResponseEntity<Categoria> actualizarCategoria(Long id, Categoria detalleCategoria) {
    		Categoria categoria = categoriaRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("No existe la categoria con el ID : " + id));
			
    		categoria.setNombre(detalleCategoria.getNombre());
    		categoria.setDescripcion(detalleCategoria.getDescripcion());
    		categoria.setEstado(detalleCategoria.getEstado());
			
    		Categoria categoriaActualizada = categoriaRepository.save(categoria);
			return ResponseEntity.ok(categoriaActualizada);
    }
    
    @Override
    public ResponseEntity<Map<String, Boolean>> eliminarCategoria(Long id) {
    	Categoria categoria = categoriaRepository.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No existe la categoria con el ID : " + id));
		
		categoriaRepository.delete(categoria);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);

    }
    
    public ResponseEntity<Categoria> eliminadoLogicoCategoria(Long id) {
    	Categoria categoria = categoriaRepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("No existe la categoria con el ID : " + id));
		
    	categoria.setEstado(0);
		
		Categoria categoriaActualizada = categoriaRepository.save(categoria);
		return ResponseEntity.ok(categoriaActualizada);
    }
    
}
