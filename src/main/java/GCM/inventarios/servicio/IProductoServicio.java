package GCM.inventarios.servicio;

import GCM.inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    List<Producto> listarProductos();
    Producto buscarProductoPorId(Integer idProducto);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Integer idProducto);
}
