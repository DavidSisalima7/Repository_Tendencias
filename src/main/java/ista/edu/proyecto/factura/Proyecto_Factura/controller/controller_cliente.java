package ista.edu.proyecto.factura.Proyecto_Factura.controller;

import ch.qos.logback.core.net.server.Client;
import ista.edu.proyecto.factura.Proyecto_Factura.models.Cliente;
import ista.edu.proyecto.factura.Proyecto_Factura.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/cliente")
public class controller_cliente {

    @Autowired
    IClienteService clienteService;

    @GetMapping("/listar")
    public List<Cliente>listarCliente(){
        return clienteService.findAll();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarCliente(@PathVariable Integer id){
        clienteService.delete(id);
    }

    @GetMapping("buscar/{id}")
    public Cliente buscarCliente(@PathVariable Integer id){
        return clienteService.findById(id);
    }

    @PutMapping("cliente/{id}")
    public Cliente editarCliente(@RequestBody Cliente cliente, @PathVariable Integer id){
        Cliente cliente1=clienteService.findById(id);
        cliente1.setNombre(cliente.getNombre());
        cliente1.setApellido(cliente.getApellido());
        cliente1.setEmail(cliente.getEmail());
        cliente1.setFacturas(cliente.getFacturas());
        return clienteService.save(cliente1);
    }
}
