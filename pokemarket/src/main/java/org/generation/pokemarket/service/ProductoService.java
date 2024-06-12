package org.generation.pokemarket.service;

import org.generation.pokemarket.models.Producto;
import org.generation.pokemarket.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    public Producto findById(Integer id) {
        var producto = productoRepository.findById(id);
        return producto.get();
    }






}
