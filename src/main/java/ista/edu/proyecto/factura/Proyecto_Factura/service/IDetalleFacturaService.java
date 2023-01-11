package ista.edu.proyecto.factura.Proyecto_Factura.service;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Detalle_factura;
import ista.edu.proyecto.factura.Proyecto_Factura.models.Factura;

import java.util.List;

public interface IDetalleFacturaService {
    public List<Detalle_factura> findAll();

    public Detalle_factura save(Detalle_factura detalleFactura);

    public Detalle_factura findById(Integer id);

    public void delete(Integer id);
}
