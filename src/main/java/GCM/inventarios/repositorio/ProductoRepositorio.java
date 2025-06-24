package GCM.inventarios.repositorio;

import GCM.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
