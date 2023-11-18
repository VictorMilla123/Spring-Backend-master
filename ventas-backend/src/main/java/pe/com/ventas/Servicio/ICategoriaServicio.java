package pe.com.ventas.Servicio;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import pe.com.ventas.modelo.Categoria;

public interface ICategoriaServicio  {

	List<Categoria> getAllCategorias();
	
	Categoria saveCategoria(Categoria categoria);
	
	ResponseEntity<Categoria> obtenerCategoriaPorId(Long id);
	
	ResponseEntity<Categoria> actualizarCategoria(Long id, Categoria categoria);
	
	ResponseEntity<Map<String,Boolean>> eliminarCategoria(Long id);
	
	ResponseEntity<Categoria> eliminadoLogicoCategoria(Long id);
	
}
