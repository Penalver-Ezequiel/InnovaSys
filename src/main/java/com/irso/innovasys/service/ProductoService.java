package com.irso.innovasys.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.irso.innovasys.entity.Producto;
import com.irso.innovasys.repository.ProductoRepository;

@Service
public class ProductoService {
  private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Crear o actualizar producto
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Listar todos los productos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Buscar producto por ID
    public Optional<Producto> obtenerProductoPorId(Integer id) {
        return productoRepository.findById(id);
    }

    // Eliminar producto por ID
    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}
