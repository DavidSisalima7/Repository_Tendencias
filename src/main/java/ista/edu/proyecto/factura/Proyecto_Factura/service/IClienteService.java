package ista.edu.proyecto.factura.Proyecto_Factura.service;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente save(Cliente cliente);
    public Cliente findById(Integer id);
    public void delete(Integer id);
}
