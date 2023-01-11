package ista.edu.proyecto.factura.Proyecto_Factura.controller;
import ista.edu.proyecto.factura.Proyecto_Factura.models.Factura;
import ista.edu.proyecto.factura.Proyecto_Factura.service.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/factura")
public class controller_factura {
    @Autowired
    IFacturaService facturaService;

    @GetMapping("/listar")
        public List<Factura> listarFacturas(){
        return facturaService.findAll();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura guardarFactura(@RequestBody Factura factura){
        return facturaService.save(factura);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarFactura(@PathVariable Integer id){
        facturaService.delete(id);
    }

    @GetMapping("buscar/{id}")
    public Factura buscarFactura(@PathVariable Integer id){
        return facturaService.findById(id);
    }

    @PutMapping("cliente/{id}")
    public Factura editarFactura(@RequestBody Factura factura, @PathVariable Integer id){
        Factura factura1=facturaService.findById(id);
        factura1.setCliente(factura.getCliente());
        factura1.setDate(factura.getDate());
        return facturaService.save(factura1);
    }
}
