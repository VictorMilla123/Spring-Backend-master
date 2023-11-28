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

import pe.com.ventas.Servicio.ICategoriaServicio;
import pe.com.ventas.modelo.Categoria;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaControlador {

	
	@Autowired
	private ICategoriaServicio categoriaService;

	// Listar todas las categorias
	@GetMapping("/Categorias")
	public List<Categoria> getAllCategorias() {
		return categoriaService.getAllCategorias();
	}

	//este metodo sirve para guardar la categoria
	@PostMapping("/Categorias")
	public Categoria saveCategoria(@RequestBody Categoria categoria) {
		return categoriaService.saveCategoria(categoria);
	}
 
	//este metodo sirve para buscar un categoria
	@GetMapping("/Categorias/{id}")
	public ResponseEntity<Categoria> obtenerCategoriaPorId(@PathVariable Long id){
			return categoriaService.obtenerCategoriaPorId(id);
	}
	
	//este metodo sirve para actualizar categoria
	@PutMapping("/Categorias/{id}")
	public ResponseEntity<Categoria> actualizarCategoria(@PathVariable Long id,@RequestBody Categoria detallesEmpleado){
		return categoriaService.actualizarCategoria(id, detallesEmpleado);
    }
	
	//este metodo sirve para eliminar un categoria
	@DeleteMapping("/Categorias/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarCategoria(@PathVariable Long id){
		return categoriaService.eliminarCategoria(id);
    }
	
	//eliminado logico categoria
	@PutMapping("/Categorias/eliminadoLogico/{id}")
	public ResponseEntity<Categoria> eliminadoLogicoCategoria(@PathVariable Long id){
		return categoriaService.eliminadoLogicoCategoria(id);
    }
	
	
}














