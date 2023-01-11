package ista.edu.proyecto.factura.Proyecto_Factura.controller;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Cliente;
import ista.edu.proyecto.factura.Proyecto_Factura.models.Producto;
import ista.edu.proyecto.factura.Proyecto_Factura.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/producto")
public class controller_producto {

    @Autowired
    IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listarProd(){
        return productoService.findAll();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto guardarProd(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarProd(@PathVariable Integer id){
        productoService.delete(id);
    }

    @GetMapping("buscar/{id}")
    public Producto buscarProd(@PathVariable Integer id){
        return productoService.findById(id);
    }

    @PutMapping("cliente/{id}")
    public Producto editarProd(@RequestBody Producto producto, @PathVariable Integer id){
        Producto producto1=productoService.findById(id);
        producto1.setNombre(producto.getNombre());
        producto1.setStock(producto.getStock());
        producto1.setPrecio(producto.getPrecio());
        return productoService.save(producto1);
    }
}
