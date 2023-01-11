package ista.edu.proyecto.factura.Proyecto_Factura.service;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto save(Producto user);

    public Producto findById(Integer id);

    public void delete(Integer id);

}
