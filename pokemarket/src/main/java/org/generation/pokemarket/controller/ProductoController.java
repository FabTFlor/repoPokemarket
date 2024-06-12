package org.generation.pokemarket.controller;

import org.generation.pokemarket.models.Producto;
import org.generation.pokemarket.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Integer id) {
        var producto = productoService.findById(id);
        return producto;
    }
    @GetMapping("/{id}/precio")
    public double precioProducto (@PathVariable Integer id) {
        var precioProducto = productoService.findById(id).getPrecio();
        return precioProducto;

    }
}
