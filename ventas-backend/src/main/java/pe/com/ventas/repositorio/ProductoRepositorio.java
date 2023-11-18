package pe.com.ventas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.ventas.modelo.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{

}
