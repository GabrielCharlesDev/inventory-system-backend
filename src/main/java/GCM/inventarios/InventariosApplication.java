package GCM.inventarios;

import GCM.inventarios.modelo.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {

		SpringApplication.run(InventariosApplication.class, args);

		//Prueba de Lombok
		Producto producto = new Producto();
		producto.setDescripcion("Camisa M");
		producto.setPrecio(600.0);
		producto.setExistencia(30);
		// Imprimir objeto con toString de lombok
		System.out.println(producto);
	}

}
