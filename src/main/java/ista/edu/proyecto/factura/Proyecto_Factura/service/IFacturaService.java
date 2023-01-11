package ista.edu.proyecto.factura.Proyecto_Factura.service;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Factura;


import java.util.List;

public interface IFacturaService {
    public List<Factura> findAll();

    public Factura save(Factura factura);

    public Factura findById(Integer id);

    public void delete(Integer id);
}
