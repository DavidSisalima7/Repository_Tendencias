package ista.edu.proyecto.factura.Proyecto_Factura.controller;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Detalle_factura;
import ista.edu.proyecto.factura.Proyecto_Factura.service.IDetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = {"*"})
@RestController
@RequestMapping("/detalle")
public class controller_detalle_factura {
    @Autowired
    IDetalleFacturaService detalleFacturaService;

    @GetMapping("/listar")
    public List<Detalle_factura> listarDetalle(){
        return detalleFacturaService.findAll();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Detalle_factura guardarDetalle(@RequestBody Detalle_factura cliente){
        return detalleFacturaService.save(cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarDetalle(@PathVariable Integer id){
        detalleFacturaService.delete(id);
    }

    @GetMapping("buscar/{id}")
    public Detalle_factura buscarDetalle(@PathVariable Integer id){
        return detalleFacturaService.findById(id);
    }

    @PutMapping("cliente/{id}")
    public Detalle_factura editarDetalle(@RequestBody Detalle_factura detalleFactura, @PathVariable Integer id){
        Detalle_factura detalleFactura1=detalleFacturaService.findById(id);
        detalleFactura1.setCantidad(detalleFactura.getCantidad());
        detalleFactura1.setProducto(detalleFactura.getProducto());
        return detalleFacturaService.save(detalleFactura1);
    }
}
